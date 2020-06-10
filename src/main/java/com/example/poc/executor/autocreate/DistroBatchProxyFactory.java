package com.example.poc.executor.autocreate;

import java.lang.reflect.Proxy;

/**
 * @date: 2020/6/4 8:53
 * @author: farui.yu
 */
public class DistroBatchProxyFactory<T> {
    private final Class<T> distroBatchInterface;

    public DistroBatchProxyFactory(Class<T> mapperInterface) {
        this.distroBatchInterface = mapperInterface;
    }

    public T newInstance() {
        DistroBatchProxy<T> distroBatchProxy = new DistroBatchProxy<>(distroBatchInterface);
        return (T) Proxy.newProxyInstance(distroBatchInterface.getClassLoader(), new Class[]{distroBatchInterface}, distroBatchProxy);
    }
}
