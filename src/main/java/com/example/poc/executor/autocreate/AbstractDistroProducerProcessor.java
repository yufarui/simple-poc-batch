package com.example.poc.executor.autocreate;

import com.example.poc.config.SpringContex;
import com.example.poc.executor.autocreate.http.HttpDistroProducerProcessor;
import com.example.poc.executor.createtask.HTTPProducer;

import java.lang.annotation.Annotation;

/**
 * @date: 2020/6/4 10:17
 * @author: farui.yu
 */
public abstract class AbstractDistroProducerProcessor implements DistroProducerProcessor {

    private DistroBatchMethod distroBatchMethod;

    public AbstractDistroProducerProcessor() {
    }

    protected AbstractDistroProducerProcessor(DistroBatchMethod distroBatchMethod) {
        this.distroBatchMethod = distroBatchMethod;
    }

    public static AbstractDistroProducerProcessor createProcessor(DistroBatchMethod distroBatchMethod) {

        ProducerType[] values = ProducerType.values();
        for (int i = 0; i < values.length; i++) {
            if (values[i].annontationType == distroBatchMethod.getAnnotation().annotationType()) {
                try {
                    Class<? extends AbstractDistroProducerProcessor> producerType
                            = values[i].producerType;
                    AbstractDistroProducerProcessor processor = SpringContex.getBean(producerType);
                    processor.setDistroBatchMethod(distroBatchMethod);
                    return processor;
                } catch (Exception e) {
                }
            }
        }
        return null;
    }

    public DistroBatchMethod getDistroBatchMethod() {
        return distroBatchMethod;
    }

    public void setDistroBatchMethod(DistroBatchMethod distroBatchMethod) {
        this.distroBatchMethod = distroBatchMethod;
    }

    enum ProducerType {
        /**
         *
         */
        HTTP_PROCESSOR(HTTPProducer.class, HttpDistroProducerProcessor.class),
        ;


        ProducerType(Class<? extends Annotation> annontationType, Class<? extends AbstractDistroProducerProcessor> producerType) {
            this.annontationType = annontationType;
            this.producerType = producerType;
        }

        private Class<? extends Annotation> annontationType;
        private Class<? extends AbstractDistroProducerProcessor> producerType;

    }

}
