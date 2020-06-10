package com.example.poc.executor.autocreate.http;

import com.example.poc.consistency.ConsistencyConstant;
import com.example.poc.executor.model.DistroTaskResponse;
import com.example.poc.executor.model.TaskState;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.*;

/**
 * @date: 2020/6/5 11:01
 * @author: farui.yu
 */
@Slf4j
public class HttpBatchTaskExecutor {

    private HttpDistroTask httpDistroTask;
    private Long peroid = ConsistencyConstant.BEAT_PERIOD_DEFAULT;
    private ExecutorService workPool;
    private ScheduledExecutorService queryPool;
    private CountDownLatch latch = new CountDownLatch(1);

    private HttpBatchTaskExecutor() {
    }

    public static HttpBatchTaskExecutor build(HttpDistroTask httpDistroTask) {
        return new HttpBatchTaskExecutor().createDefault(httpDistroTask);
    }

    public HttpBatchTaskExecutor createDefault(HttpDistroTask httpDistroTask) {
        this.httpDistroTask = httpDistroTask;
        buildWorkPool();
        buildQueryTimer();
        return this;
    }

    public HttpBatchTaskExecutor buildWorkPool() {
        this.workPool = new ThreadPoolExecutor(
                1, 1,
                1000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque<>(500),
                r -> {
                    Thread thread = new Thread(r);
                    thread.setDaemon(true);
                    thread.setName("HttpBatchTaskExecutor.worker");
                    return thread;
                });
        return this;
    }

    public HttpBatchTaskExecutor buildQueryTimer() {
        this.queryPool = Executors
                .newScheduledThreadPool(1, r -> {
                    Thread thread = new Thread(r);
                    thread.setDaemon(true);
                    thread.setName("HttpBatchTaskExecutor.timer");
                    return thread;
                });
        return this;
    }

    public void executeDemo() {
        log.info("execute start");
        HttpDistroTask task = this.httpDistroTask;
        task.getStartTask().get();
        log.info("execute final");
    }

    public void execute() {
        log.info("execute start");
        HttpDistroTask task = this.httpDistroTask;
        workPool.submit(() -> {
            task.getStartTask().get();
        });
        doScheduledQuery(task);
        try {
            latch.await();
        } catch (Exception e) {
            log.error("latch await error", e);
        }
        log.info("execute final");
    }

    public void dobusi(HttpDistroTask task) {
        doScheduledQuery(task);
    }

    private void doScheduledQuery(HttpDistroTask task) {
        queryPool.schedule(new InnerTask(task), peroid, TimeUnit.MILLISECONDS);
    }


    class InnerTask implements Runnable {

        private HttpDistroTask task;

        public InnerTask(HttpDistroTask task) {
            this.task = task;
        }

        @Override
        public void run() {
            DistroTaskResponse distroTaskResponse = task.getQueryTask().get();
            if (TaskState.SUCCESS.equals(distroTaskResponse.getTaskState())) {
                latch.countDown();
                return;
            }
            queryPool.schedule(new InnerTask(task), peroid, TimeUnit.MILLISECONDS);
        }
    }
}
