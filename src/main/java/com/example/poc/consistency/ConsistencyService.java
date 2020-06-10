package com.example.poc.consistency;


import com.example.poc.executor.model.DistroTaskResponse;

import java.util.List;

/**
 * 管理从节点缓存的一致性服务;
 *
 * @author farui.yu
 */
public interface ConsistencyService {

    /**
     * 向缓存中添加或修改follower
     *
     * @param beatInfo
     */
    void put(BeatInfo beatInfo);

    /**
     * 负载均衡地获取节点，以帮助master向followers发送请求
     *
     * @param num
     * @return
     */
    List<Follower> getWithBalance(int num);

    /**
     * 观察任务进程
     *
     * @param taskName
     * @return
     */
    List<DistroTaskResponse> getBatchState(String taskName);

    List<Follower> getAll();
}
