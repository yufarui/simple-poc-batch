package com.example.poc.executor.jobbuilder;

import com.example.poc.executor.autocreate.http.HttpDistroTask;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.job.builder.FlowBuilder;
import org.springframework.batch.core.job.builder.FlowJobBuilder;
import org.springframework.batch.core.job.builder.SimpleJobBuilder;
import org.springframework.batch.core.job.flow.Flow;
import org.springframework.batch.core.job.flow.support.SimpleFlow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.task.SimpleAsyncTaskExecutor;

import java.util.ArrayList;
import java.util.List;

/**
 * 使用spring-batch 快速的构建任务
 *
 * @date: 2020/6/5 9:39
 * @author: farui.yu
 */

public class JobBuilderHelper {

    private SimpleJobBuilder simpleJobBuilder;

    @Autowired
    private StepBuilderFactory stepBuilderFactory;
    @Autowired
    private JobBuilderFactory jobBuilderFactory;

    private List<Step> stepList;
    private String jobName;


    public JobBuilderHelper init(String jobName) {
        this.stepList = new ArrayList<>();
        this.jobName = jobName;
        return this;
    }

    public Job buildStep() {
        FlowBuilder.SplitBuilder<FlowJobBuilder> split = null;
        for (int i = 0; i < stepList.size(); i++) {

            Step step = stepList.get(i);
            if (i == 0) {
                this.simpleJobBuilder = jobBuilderFactory.get(jobName)
                        .start(step);
                split = this.simpleJobBuilder.split(new SimpleAsyncTaskExecutor());
            } else if (i < stepList.size()) {
                Flow flow = new FlowBuilder<SimpleFlow>(step.getName())
                        .start(step)
                        .build();
                split.add(flow);
            }

        }
        return simpleJobBuilder.build();

    }

    public Job addSteps(List<HttpDistroTask> httpDistroTaskList) {
        for (int i = 0; i < httpDistroTaskList.size(); i++) {
            HttpDistroTask httpDistroTask = httpDistroTaskList.get(i);

            String taskName = httpDistroTask.getDistroTask().getTaskName();
            String address = httpDistroTask.getAddress();
            Step step = stepBuilderFactory
                    .get(address + taskName)
                    .tasklet(new DistroTasklet(httpDistroTask))
                    .build();

            stepList.add(step);
        }

        return buildStep();
    }

    public Job getJob() {
        return simpleJobBuilder.build();
    }
}
