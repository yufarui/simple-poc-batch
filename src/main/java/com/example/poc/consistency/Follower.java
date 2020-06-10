package com.example.poc.consistency;

import lombok.Data;

/**
 * @date: 2020/6/3 9:17
 * @author: farui.yu
 */
@Data
public class Follower {

    private String ip;
    private String port;
    private volatile State state;
    private Long lastBeatTime;
    private int priority;

    public String buildUrl() {
        return "http://" + this.ip + ":" + this.port;
    }
}
