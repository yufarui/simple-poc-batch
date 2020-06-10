package com.example.poc.executor.createtask;

import java.lang.annotation.*;

/**
 * 分布式任务的接口,此接口标注的类，将会注入到spring 环境中
 *
 * @date: 2020/6/3 15:18
 * @author: farui.yu
 */
@Documented
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface DistroBatch {
}
