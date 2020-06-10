package com.example.poc.controller.view;

import lombok.Data;

/**
 * @date: 2020/6/9 15:28
 * @author: farui.yu
 */
@Data
public class ResponseData<T> {
    private String code;
    private String msg;
    private int count;
    private T data;

    public static <T> ResponseData success(T data) {
        ResponseData responseData = new ResponseData();
        responseData.setCode("0");
        responseData.setMsg("ok");
        responseData.setData(data);
        return responseData;
    }
}
