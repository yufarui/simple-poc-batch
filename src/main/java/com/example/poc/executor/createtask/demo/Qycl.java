package com.example.poc.executor.createtask.demo;

import com.example.poc.executor.autocreate.http.HttpDistroTask;
import com.example.poc.executor.createtask.CreateTask;
import com.example.poc.executor.createtask.DistroBatch;
import com.example.poc.executor.createtask.HTTPProducer;
import com.example.poc.executor.model.DistroTask;

import java.util.List;

/**
 * demo: qycl 名称是和数据库配置task_context保持一致的
 *
 * @date: 2020/6/9 8:38
 * @author: farui.yu
 */
@DistroBatch
public interface Qycl extends CreateTask {

    @HTTPProducer(startPath = "/task/qy")
    List<HttpDistroTask> create(List<DistroTask> task);
}
