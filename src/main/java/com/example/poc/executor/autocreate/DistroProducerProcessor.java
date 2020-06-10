package com.example.poc.executor.autocreate;

/**
 * 分布式任务生产者的处理器
 *
 * @date: 2020/6/4 10:59
 * @author: farui.yu
 */
public interface DistroProducerProcessor {

    /**
     * 根据方法入参，进行生产
     *
     * @param methodArgs
     * @return
     */
    Object produce(Object[] methodArgs);
}
