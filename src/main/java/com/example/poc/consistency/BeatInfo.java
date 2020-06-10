package com.example.poc.consistency;

import lombok.Data;

/**
 * @date: 2020/6/3 13:20
 * @author: farui.yu
 */
@Data
public class BeatInfo {

    private String ip;
    private String port;

    public String buildKey() {
        return this.ip + ":" + this.port;
    }
}
