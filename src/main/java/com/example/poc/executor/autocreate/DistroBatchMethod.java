package com.example.poc.executor.autocreate;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * @date: 2020/6/4 9:02
 * @author: farui.yu
 */
public class DistroBatchMethod {

    private Annotation annotation;
    private Method method;

    public DistroBatchMethod(Annotation producer, Method method) {
        this.annotation = producer;
        this.method = method;
    }

    public Object execute(Object[] args) {
        DistroProducerProcessor processor = AbstractDistroProducerProcessor.createProcessor(this);
        return processor.produce(args);
    }

    public Annotation getAnnotation() {
        return annotation;
    }

    public Method getMethod() {
        return method;
    }
}
