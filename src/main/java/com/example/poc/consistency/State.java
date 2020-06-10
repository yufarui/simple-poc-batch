package com.example.poc.consistency;

/**
 * @date: 2020/6/3 9:19
 * @author: farui.yu
 */
public enum State {
    /**
     *
     */
    UNKOWN(-1, "未知状态"),
    SUCCESS(200, "成功"),
    NOTGOOD(400, "运行状态不佳"),
    FAIL(500, "失败"),
    ABANDON(600, "失败"),
    ;


    private Integer value;
    private String desc;

    State(Integer value, String desc) {
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
