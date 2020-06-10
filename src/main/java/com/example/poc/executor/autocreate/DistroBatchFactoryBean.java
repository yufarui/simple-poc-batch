package com.example.poc.executor.autocreate;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @date: 2020/6/3 16:48
 * @author: farui.yu
 */
public class DistroBatchFactoryBean<T> implements FactoryBean<T> {

    private Class<T> distroBatchInterface;

    @Autowired
    private DistroBatchTemplate distroBatchTemplate;


    public DistroBatchFactoryBean() {
    }

    public DistroBatchFactoryBean(Class<T> distroBatchInterface) {
        this.distroBatchInterface = distroBatchInterface;
    }

    @Override
    public T getObject() throws Exception {
        return distroBatchTemplate.createDistroBatch(distroBatchInterface);
    }

    @Override
    public Class<?> getObjectType() {
        return distroBatchInterface;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
