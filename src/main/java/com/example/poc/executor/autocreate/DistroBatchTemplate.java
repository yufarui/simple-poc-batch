package com.example.poc.executor.autocreate;

import org.springframework.stereotype.Component;

/**
 * 分布式任务执行模板
 *
 * @date: 2020/6/4 8:41
 * @author: farui.yu
 */
@Component
public class DistroBatchTemplate {

    public <T> T createDistroBatch(Class<T> type) {
        DistroBatchProxyFactory<T> factory = new DistroBatchProxyFactory<>(type);
        return factory.newInstance();
    }
}
