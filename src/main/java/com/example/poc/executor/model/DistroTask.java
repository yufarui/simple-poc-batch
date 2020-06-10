package com.example.poc.executor.model;

import lombok.Data;

/**
 * 分布式任务
 *
 * @date: 2020/6/3 15:09
 * @author: farui.yu
 */
@Data
public class DistroTask<T> {

    private T sendMessage;
    /**
     * 任务名称
     */
    private String taskName;
    /**
     * 任务拆分后的分布式编号
     */
    private String distroId;

}
