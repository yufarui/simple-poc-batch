package com.example.poc.executor.autocreate.http;

import com.example.poc.executor.model.DistroTask;
import com.example.poc.executor.model.DistroTaskResponse;
import lombok.Data;

import java.util.function.Supplier;

/**
 * @date: 2020/6/4 16:39
 * @author: farui.yu
 */
@Data
public class HttpDistroTask {

    private String address;
    private DistroTask distroTask;
    private Supplier<String> startTask;
    private Supplier<DistroTaskResponse> queryTask;
}
