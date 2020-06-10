package com.example.poc.consistency;

import com.example.poc.executor.model.DistroTaskResponse;
import org.springframework.beans.BeanUtils;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @date: 2020/6/3 10:24
 * @author: farui.yu
 */
public class DistroConsistencyService implements ConsistencyService {

    private Map<String, Follower> followerMap = new ConcurrentHashMap<>();

    private Map<String, FollowerListener> listenerMap = new ConcurrentHashMap<>();

    @Override
    public void put(BeatInfo beatInfo) {

        String key = beatInfo.buildKey();

        if (followerMap.get(key) == null) {
            Follower follower = createFollower(beatInfo);
            followerMap.put(key, follower);
            FollowerListener followerListener = new FollowerListener(follower);
            listenerMap.put(key, followerListener);
            followerListener.init();
        } else {
            followerMap.get(key).setLastBeatTime(System.currentTimeMillis());
            FollowerListener followerListener = listenerMap.get(key);
            followerListener.onChange();
        }

    }

    private Follower createFollower(BeatInfo beatInfo) {
        Follower follower = new Follower();
        follower.setIp(beatInfo.getIp());
        follower.setPort(beatInfo.getPort());
        follower.setLastBeatTime(System.currentTimeMillis());
        follower.setState(State.SUCCESS);
        // 优先级的值必须足够大，才能使负载的策略更均衡
        follower.setPriority(200);
        return follower;
    }

    @Override
    public List<Follower> getWithBalance(int num) {

        Set<String> keySet = followerMap.keySet();
        List<Follower> availableList = new ArrayList<>();
        // 复制，创建快照，减少原来数据的影响
        keySet.stream()
                .filter(key -> State.SUCCESS.equals(followerMap.get(key).getState()))
                .forEach(key -> availableList.add(clone(followerMap.get(key))));

        if (num > availableList.size()) {
            throw new RuntimeException("节点不足，无法分发任务");
        }
        if (num == availableList.size()) {
            return availableList;
        }
        // 采取 随机数加上 二分法，构建执行任务节点
        List<Follower> result = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            int[] prioritys = new int[availableList.size()];
            for (int j = 0; j < availableList.size(); j++) {
                if (j == 0) {
                    prioritys[j] = availableList.get(j).getPriority();
                } else {
                    prioritys[j] = prioritys[j - 1] + availableList.get(j).getPriority();
                }
            }

            int sum = prioritys[availableList.size() - 1];
            int resultTmp = getRandomSearch(prioritys, sum);
            result.add(availableList.get(resultTmp));
            availableList.remove(resultTmp);
        }
        return result;
    }

    @Override
    public List<DistroTaskResponse> getBatchState(String taskName) {
        return null;
    }

    @Override
    public List<Follower> getAll() {
        return null;
    }

    private int getRandomSearch(int[] prioritys, int sum) {
        ThreadLocalRandom threadLocalRandom = ThreadLocalRandom.current();
        int random = threadLocalRandom.nextInt(sum);
        int search = Arrays.binarySearch(prioritys, random);
        int resultTmp;
        if (search >= 0) {
            resultTmp = search;
        } else {
            resultTmp = -search - 1;
        }
        return resultTmp;
    }

    public Follower clone(Follower follower) {
        Follower clone = new Follower();
        BeanUtils.copyProperties(follower, clone);
        return clone;
    }

}
