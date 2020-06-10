package com.example.poc.executor.createtask;

import java.lang.annotation.*;

/**
 * 标识 此注解为分布式任务的生产者
 * 当前默认 的 生产者为 {@link HTTPProducer}
 *
 * @date: 2020/6/4 9:37
 * @author: farui.yu
 */
@Target({ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface DistroProducer {
}
