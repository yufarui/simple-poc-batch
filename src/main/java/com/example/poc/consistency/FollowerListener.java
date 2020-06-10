package com.example.poc.consistency;

import java.util.concurrent.*;

/**
 * @date: 2020/6/3 9:29
 * @author: farui.yu
 */
public class FollowerListener {

    private Follower follower;

    /**
     * 定时在内存中更新节点状态
     * 防止follower长时间未发送来的心跳
     */
    private ScheduledExecutorService timer =
            new ScheduledThreadPoolExecutor(1, r -> {
                Thread thread = new Thread(r);
                thread.setDaemon(true);
                thread.setName("followerListener.timer");
                return thread;
            });

    public FollowerListener(Follower follower) {
        this.follower = follower;
    }

    /**
     * 初始化 定时检查
     */
    public void init() {
        timer.schedule(new HealthChecker(), 1000, TimeUnit.MILLISECONDS);
    }

    public void onChange() {
        follower.setState(State.SUCCESS);
    }

    public void onDelete() {

    }

    private class HealthChecker implements Runnable {

        @Override
        public void run() {
            if (follower == null) {
                return;
            }

            Long lastBeatTime = follower.getLastBeatTime();
            long current = System.currentTimeMillis();
            long period = ConsistencyConstant.BEAT_PERIOD_DEFAULT;
            if (current - lastBeatTime < period) {
                follower.setState(State.SUCCESS);
            } else if (current - lastBeatTime > period * 5) {
                follower.setState(State.FAIL);
            } else {
                follower.setState(State.NOTGOOD);
            }

            timer.schedule(new HealthChecker(), period, TimeUnit.MILLISECONDS);
        }
    }
}
