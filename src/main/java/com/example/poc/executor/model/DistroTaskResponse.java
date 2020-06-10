package com.example.poc.executor.model;

import lombok.Data;

/**
 * @date: 2020/6/4 8:32
 * @author: farui.yu
 */
@Data
public class DistroTaskResponse {
    private String ip;
    private String port;
    private TaskState taskState;
    private Integer taskQuota;
    // todo yufr 是否还需要细分 成功笔数 失败笔数 跳过笔数
    private Integer finishCount;
}
