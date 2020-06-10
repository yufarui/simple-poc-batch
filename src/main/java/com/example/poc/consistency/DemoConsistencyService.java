package com.example.poc.consistency;

import com.example.poc.executor.model.DistroTaskResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @date: 2020/6/7 23:40
 * @author: farui.yu
 */
public class DemoConsistencyService implements ConsistencyService {

    private Map<String, Follower> followerMap = new ConcurrentHashMap<>();


    @Override
    public void put(BeatInfo beatInfo) {
        String key = beatInfo.buildKey();

        if (followerMap.get(key) == null) {
            Follower follower = createFollower(beatInfo);
            followerMap.put(key, follower);
        } else {
            followerMap.get(key).setLastBeatTime(System.currentTimeMillis());
        }
    }

    @Override
    public List<Follower> getWithBalance(int num) {

        Set<String> keySet = followerMap.keySet();
        List<Follower> availableList = new ArrayList<>();
        // 复制，创建快照，减少原来数据的影响
        keySet.stream()
                .filter(key -> State.SUCCESS.equals(followerMap.get(key).getState()))
                .forEach(key -> availableList.add(followerMap.get(key)));


        List<Follower> resultList = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            resultList.add(availableList.get(i % availableList.size()));
        }

        return resultList;
    }

    @Override
    public List<DistroTaskResponse> getBatchState(String taskName) {
        return null;
    }

    @Override
    public List<Follower> getAll() {
        List<Follower> availableList = new ArrayList<>();
        Set<String> keySet = followerMap.keySet();
        keySet.stream()
                .forEach(key -> availableList.add(followerMap.get(key)));
        return availableList;
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
}
