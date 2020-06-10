package com.example.poc.dao.model;

import java.io.Serializable;

public class TaskContext implements Serializable {
    private Long taskExecutionId;

    private String taskType;

    private String taskName;

    private Long taskOrder;

    private String param;

    private static final long serialVersionUID = 1L;

    public Long getTaskExecutionId() {
        return taskExecutionId;
    }

    public void setTaskExecutionId(Long taskExecutionId) {
        this.taskExecutionId = taskExecutionId;
    }

    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType == null ? null : taskType.trim();
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName == null ? null : taskName.trim();
    }

    public Long getTaskOrder() {
        return taskOrder;
    }

    public void setTaskOrder(Long taskOrder) {
        this.taskOrder = taskOrder;
    }

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param == null ? null : param.trim();
    }
}