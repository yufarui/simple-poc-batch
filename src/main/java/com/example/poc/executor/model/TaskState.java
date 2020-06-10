package com.example.poc.executor.model;

/**
 * @date: 2020/6/3 15:53
 * @author: farui.yu
 */
public enum TaskState {
    /**
     *
     */
    PROCESS(10, "任务执行中"),
    SUCCESS(20, "任务执行成功"),
    FAIL(30, "任务执行失败"),
    TIMEOUT(30, "任务执行超时"),
    ;

    private Integer value;
    private String desc;

    TaskState(Integer value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    public Integer getValue() {
        return value;
    }

    public String getDesc() {
        return desc;
    }
}
