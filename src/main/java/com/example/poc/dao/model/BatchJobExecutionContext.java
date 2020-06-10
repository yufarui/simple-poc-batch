package com.example.poc.dao.model;

import java.io.Serializable;

public class BatchJobExecutionContext implements Serializable {
    private Long jobExecutionId;

    private String shortContext;

    private String serializedContext;

    private static final long serialVersionUID = 1L;

    public Long getJobExecutionId() {
        return jobExecutionId;
    }

    public void setJobExecutionId(Long jobExecutionId) {
        this.jobExecutionId = jobExecutionId;
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