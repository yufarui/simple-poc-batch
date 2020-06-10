package com.example.poc.controller.job;

import com.example.poc.config.SpringContex;
import com.example.poc.executor.autocreate.http.HttpDistroTask;
import com.example.poc.executor.createtask.CreateTask;
import com.example.poc.executor.model.DistroTask;
import com.example.poc.dao.mapper.TaskContextMapper;
import com.example.poc.dao.model.TaskContext;
import com.example.poc.dao.model.TaskContextExample;
import com.example.poc.executor.jobbuilder.JobBuilderHelper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.core.*;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@RestController
@Slf4j
public class JobController {

    @Autowired
    private JobLauncher jobLauncher;

    @Autowired
    private JobBuilderHelper jobBuilderHelper;

    @Autowired
    private TaskContextMapper taskContextMapper;

    private ExecutorService workPool = new ThreadPoolExecutor(
            1, 1,
            1000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque<>(500),
            r -> {
                Thread thread = new Thread(r);
                thread.setDaemon(true);
                thread.setName("TaskExecute.worker");
                return thread;
            });

    @GetMapping("job/execute/{info}")
    public String runJob(@PathVariable("info") String taskType) {

        List<TaskContext> taskContexts = getTaskContextsFromDB(taskType);

        buildTaskAndRun(taskType, taskContexts);

        log.info("接受到请求参数:[{}], 执行任务结束", taskType);
        return taskType + "正在处理中...";
    }

    private List<TaskContext> getTaskContextsFromDB(@PathVariable("info") String taskType) {
        TaskContextExample example = new TaskContextExample();
        example.createCriteria()
                .andTaskTypeEqualTo(taskType);
        example.setOrderByClause("task_order");
        return taskContextMapper.selectByExample(example);
    }

    /**
     * 自动化构建任务，从数据库中读取任务，并按顺序执行
     * todo 此功能的实现，可以放置于 autocreate 包中
     *
     * @param taskType
     * @param taskContexts
     */
    private void buildTaskAndRun(String taskType, List<TaskContext> taskContexts) {

        String dateTime = "" + LocalDate.now() + LocalTime.now();
        log.info("接受到请求参数:[{}], 开始执行任务", taskType);
        JobParameters jobParameters = new JobParametersBuilder()
                .addString("dateTime", dateTime)
                .addString("taskType", taskType)
                .toJobParameters();

        for (int i = 0; i < taskContexts.size(); i++) {
            TaskContext taskContext = taskContexts.get(i);
            String taskName = taskContext.getTaskName();
            CreateTask createTask = SpringContex.getBean(taskName, CreateTask.class);
            List<HttpDistroTask> tasks = buildQsDistroTask(createTask, taskName, taskContext.getParam());
            Job qsjob = jobBuilderHelper.init(taskType + taskName)
                    .addSteps(tasks);

            workPool.submit(() -> {
                try {
                    JobExecution jobExecution = jobLauncher.run(qsjob, jobParameters);
                    while (jobExecution.getStatus() != BatchStatus.COMPLETED) {
                        Thread.sleep(100);
                    }
                } catch (Exception e) {
                    log.error("jobLauncher.run", e);
                }
            });
        }
    }

    private List<HttpDistroTask> buildQsDistroTask(CreateTask createTask, String taskName, String param) {

        List<DistroTask> list = new ArrayList<>();

        String[] split = param.split(",");
        for (int i = 0; i < split.length; i++) {
            DistroTask<SimpleDemoDTO> task = new DistroTask<>();
            task.setTaskName(taskName + split[i]);
            SimpleDemoDTO simpleDemoDTO = new SimpleDemoDTO();
            simpleDemoDTO.setParam(split[i]);
            list.add(task);
        }
        List<HttpDistroTask> result = createTask.create(list);
        return result;
    }
}
