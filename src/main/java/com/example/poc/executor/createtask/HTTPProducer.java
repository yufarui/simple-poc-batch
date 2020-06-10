package com.example.poc.executor.createtask;

import org.springframework.http.HttpMethod;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 使用 http 发送任务请求
 *
 * @date: 2020/6/3 15:31
 * @author: farui.yu
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@DistroProducer
public @interface HTTPProducer {

    /**
     * follower 启动任务的 url path
     *
     * @return
     */
    String startPath();

    /**
     * follower 任务结果查询 url path
     *
     * @return
     */
    String queryPath() default "";

    HttpMethod startMethod() default HttpMethod.POST;

    HttpMethod queryMethod() default HttpMethod.POST;
}
