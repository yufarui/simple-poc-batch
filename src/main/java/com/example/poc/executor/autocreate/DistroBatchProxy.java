package com.example.poc.executor.autocreate;

import com.example.poc.executor.createtask.DistroProducer;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @date: 2020/6/4 8:56
 * @author: farui.yu
 */
public class DistroBatchProxy<T> implements InvocationHandler {

    private final Class<T> distroBatchInterface;
    private Map<String, DistroBatchMethod> cacheMethod = new ConcurrentHashMap<>();

    public DistroBatchProxy(Class<T> distroBatchInterface) {
        this.distroBatchInterface = distroBatchInterface;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Annotation[] annotations = method.getAnnotations();
        for (int i = 0; i < annotations.length; i++) {

            // 只处理找到的第一个DistroProducer注解
            Annotation annotation = annotations[i];
            DistroProducer distroProducer = annotation.annotationType().getAnnotation(DistroProducer.class);
            if (distroProducer != null) {
                DistroBatchMethod distroBatchMethod = new DistroBatchMethod(annotation, method);
                return distroBatchMethod.execute(args);
            }
        }

        return null;
    }
}
