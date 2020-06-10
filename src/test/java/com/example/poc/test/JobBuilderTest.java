package com.example.poc.test;

import com.example.poc.config.SpringContex;
import com.example.poc.executor.autocreate.http.HttpDistroTask;
import com.example.poc.PocApp;
import com.example.poc.controller.job.SimpleDemoDTO;
import com.example.poc.executor.createtask.CreateTask;
import com.example.poc.executor.model.DistroTask;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.job.builder.SimpleJobBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * @date: 2020/6/5 9:07
 * @author: farui.yu
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {PocApp.class})
public class JobBuilderTest {

    @Autowired
    private JobBuilderFactory jobBuilderFactory;
    @Autowired
    private Step step1;
    @Autowired
    private Step step2;
    @Autowired
    private Step step3;
    @Autowired
    private JobLauncher jobLauncher;

    @Test
    public void test() {
        SimpleJobBuilder start = jobBuilderFactory.get("test")
                .start(step1);
        start.next(step2)
                .next(step3);

        Job job = start.build();

        JobParameters jobParameters = new JobParametersBuilder()
                .addString("info", "yufr")
                .toJobParameters();
        try {
            jobLauncher.run(job, jobParameters);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void create() {
        CreateTask qscl = SpringContex.getBean("qscl", CreateTask.class);

        List<HttpDistroTask> qwer = qscl.create(buildQsDistroTask("qwer"));

        System.out.println(qwer);
    }

    private List<DistroTask> buildQsDistroTask(String taskName) {

        List<DistroTask> list = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            DistroTask<SimpleDemoDTO> task = new DistroTask<>();
            task.setTaskName(taskName + (i + 1));
            SimpleDemoDTO simpleDemoDTO = new SimpleDemoDTO();
            simpleDemoDTO.setParam((i + 1) + "");
            list.add(task);
        }
        return list;
    }
}
