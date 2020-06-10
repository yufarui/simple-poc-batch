package com.example.poc.controller.view;

import com.example.poc.consistency.ConsistencyService;
import com.example.poc.consistency.Follower;
import com.example.poc.dao.mapper.BatchJobExecutionMapper;
import com.example.poc.dao.mapper.BatchStepExecutionMapper;
import com.example.poc.dao.mapper.TaskContextMapper;
import com.example.poc.dao.model.TaskContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @date: 2020/6/9 15:03
 * @author: farui.yu
 */
@RestController
public class SimpleRestController {

    @Autowired
    private ConsistencyService consistencyService;

    @Autowired
    private TaskContextMapper taskContextMapper;

    @Autowired
    private BatchJobExecutionMapper batchJobExecutionMapper;

    @Autowired
    private BatchStepExecutionMapper batchStepExecutionMapper;

    @GetMapping("/follower/list")
    public ResponseData<List<Follower>> followerList() {
        return ResponseData.success(consistencyService.getAll());
    }

    @GetMapping("/task/list")
    public ResponseData<List<TaskContext>> taskList() {
        return ResponseData.success(taskContextMapper.selectAll());
    }

    @GetMapping("/task/job/list")
    public ResponseData<List> taskJobList() {
        return ResponseData.success(batchJobExecutionMapper.selectAll());
    }

    @GetMapping("/task/step/list")
    public ResponseData<List> taskStepList() {
        return ResponseData.success(batchStepExecutionMapper.selectAll());
    }
}
