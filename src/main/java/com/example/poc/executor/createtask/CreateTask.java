package com.example.poc.executor.createtask;

import com.example.poc.executor.autocreate.http.HttpDistroTask;
import com.example.poc.executor.model.DistroTask;

import java.util.List;

/**
 * 快速创建任务的模板接口
 *
 * @date: 2020/6/9 8:40
 * @author: farui.yu
 */
public interface CreateTask {
    List<HttpDistroTask> create(List<DistroTask> distroTasks);
}
