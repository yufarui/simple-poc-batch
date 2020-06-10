package com.example.poc.executor.autocreate.http;

import com.example.poc.consistency.ConsistencyConstant;
import com.example.poc.executor.model.DistroTaskResponse;
import com.example.poc.executor.model.TaskState;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.concurrent.*;

@Slf4j
public class HttpBatchTaskExecutorExample {

    private List<HttpDistroTask> taskList;
    private CountDownLatch latch;
    private Long innerQueryPeroid = ConsistencyConstant.BEAT_PERIOD_DEFAULT;
    private ExecutorService workPool;
    private ScheduledExecutorService queryPool;

    private HttpBatchTaskExecutorExample() {
    }

    public static HttpBatchTaskExecutorExample build(List<HttpDistroTask> taskList) {
        return new HttpBatchTaskExecutorExample().createDefault(taskList);
    }

    public HttpBatchTaskExecutorExample createDefault(List<HttpDistroTask> taskList) {
        this.taskList = taskList;
        buildWorkPool();
        buildQueryTimer();
        finishBuild();
        return this;
    }

    public HttpBatchTaskExecutorExample buildWorkPool() {
        this.workPool = new ThreadPoolExecutor(
                taskList.size(), taskList.size() * 2,
                1000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque<>(500),
                r -> {
                    Thread thread = new Thread(r);
                    thread.setDaemon(true);
                    thread.setName("HttpBatchTaskExecutor.worker");
                    return thread;
                });
        return this;
    }

    public HttpBatchTaskExecutorExample buildQueryTimer() {
        this.queryPool = Executors
                .newScheduledThreadPool(taskList.size(), r -> {
                    Thread thread = new Thread(r);
                    thread.setDaemon(true);
                    thread.setName("HttpBatchTaskExecutor.timer");
                    return thread;
                });
        return this;
    }

    public HttpBatchTaskExecutorExample finishBuild() {
        this.latch = new CountDownLatch(taskList.size());
        return this;
    }

    public void execute() {
        log.info("execute start");
        for (int i = 0; i < taskList.size(); i++) {
            HttpDistroTask task = taskList.get(i);
            workPool.submit(() -> {
                task.getStartTask().get();
            });
            doScheduledQuery(task);
        }
        try {
            latch.await();
        } catch (Exception e) {
            log.error("latch await error", e);
        }
        log.info("execute final");
    }

    public void executeDemo() {
        log.info("execute start");
        for (int i = 0; i < taskList.size(); i++) {
            HttpDistroTask task = taskList.get(i);
            task.getStartTask().get();
        }
        log.info("execute final");
    }

    public void dobusi(HttpDistroTask task) {
        doScheduledQuery(task);
    }

    private void doScheduledQuery(HttpDistroTask task) {
        queryPool.schedule(new InnerTask(task), innerQueryPeroid, TimeUnit.MILLISECONDS);
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
            queryPool.schedule(new InnerTask(task), innerQueryPeroid, TimeUnit.MILLISECONDS);
        }
    }
}
