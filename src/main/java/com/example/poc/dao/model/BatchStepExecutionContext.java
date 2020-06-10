package com.example.poc.dao.model;

import java.io.Serializable;

public class BatchStepExecutionContext implements Serializable {
    private Long stepExecutionId;

    private String shortContext;

    private String serializedContext;

    private static final long serialVersionUID = 1L;

    public Long getStepExecutionId() {
        return stepExecutionId;
    }

    public void setStepExecutionId(Long stepExecutionId) {
        this.stepExecutionId = stepExecutionId;
    }

    public String getShortContext() {
        return shortContext;
    }

    public void setShortContext(String shortContext) {
        this.shortContext = shortContext == null ? null : shortContext.trim();
    }

    public String getSerializedContext() {
        return serializedContext;
    }

    public void setSerializedContext(String serializedContext) {
        this.serializedContext = serializedContext == null ? null : serializedContext.trim();
    }
}