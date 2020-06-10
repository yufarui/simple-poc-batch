package com.example.poc.executor.jobbuilder;

import com.alibaba.fastjson.JSON;
import com.example.poc.executor.autocreate.http.HttpBatchTaskExecutor;
import com.example.poc.executor.autocreate.http.HttpDistroTask;
import com.example.poc.executor.model.DistroTask;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

/**
 * 调度任务 默认的执行模式
 *
 * @date: 2020/6/8 17:50
 * @author: farui.yu
 */
public class DistroTasklet implements Tasklet {

    private HttpDistroTask httpDistroTask;

    public DistroTasklet(HttpDistroTask httpDistroTask) {
        this.httpDistroTask = httpDistroTask;
    }

    @Override
    public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
        HttpBatchTaskExecutor
                .build(httpDistroTask)
                .executeDemo();
        return RepeatStatus.FINISHED;
    }

    @Override
    public String toString() {
        InnerTask innerTask = new InnerTask();
        innerTask.setAddress(httpDistroTask.getAddress());
        DistroTask distroTask = httpDistroTask.getDistroTask();
        innerTask.setSendMessage(distroTask.getSendMessage());
        innerTask.setTaskName(distroTask.getTaskName());
        return innerTask.toString();
    }

    class InnerTask<T> {
        private String address;
        private T sendMessage;
        private String taskName;

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public T getSendMessage() {
            return sendMessage;
        }

        public void setSendMessage(T sendMessage) {
            this.sendMessage = sendMessage;
        }

        public String getTaskName() {
            return taskName;
        }

        public void setTaskName(String taskName) {
            this.taskName = taskName;
        }

        @Override
        public String toString() {
            return JSON.toJSONString(this);
        }
    }
}
