package com.example.poc.executor.autocreate.http;

import com.example.poc.consistency.ConsistencyService;
import com.example.poc.consistency.Follower;
import com.example.poc.executor.createtask.HTTPProducer;
import com.example.poc.executor.model.DistroTask;
import com.example.poc.executor.model.DistroTaskResponse;
import com.example.poc.executor.autocreate.AbstractDistroProducerProcessor;
import com.example.poc.executor.autocreate.DistroBatchMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * @date: 2020/6/4 10:18
 * @author: farui.yu
 */
@Component
public class HttpDistroProducerProcessor extends AbstractDistroProducerProcessor {

    @Autowired
    private ConsistencyService consistencyService;
    @Autowired
    private RestTemplate restTemplate;

    @Override
    public Object produce(Object[] methodArgs) {
        List<DistroTask> list = buildParams(methodArgs);

        List<Follower> followers = consistencyService.getWithBalance(list.size());
        DistroBatchMethod distroBatchMethod = getDistroBatchMethod();

        Method method = distroBatchMethod.getMethod();
        HTTPProducer httpProducer = method.getAnnotation(HTTPProducer.class);

        List<HttpDistroTask> httpDistroTask = createHttpDistroTask(list, followers, httpProducer);

        return httpDistroTask;
    }

    private List<HttpDistroTask> createHttpDistroTask(List<DistroTask> taskList, List<Follower> followers, HTTPProducer httpProducer) {

        List<HttpDistroTask> result = new ArrayList<>();
        for (int i = 0; i < taskList.size(); i++) {
            DistroTask distroTask = taskList.get(i);
            Follower follower = followers.get(i);
            HttpDistroTask httpDistroTask = new HttpDistroTask();
            httpDistroTask.setDistroTask(distroTask);
            httpDistroTask.setAddress(follower.buildUrl());

            httpDistroTask.setStartTask(() -> {
                String url = follower.buildUrl();
                String path = httpProducer.startPath();
                HttpEntity<?> requestEntity = new HttpEntity<>(distroTask);
                ResponseEntity<String> responseEntity = restTemplate.exchange(url + path,
                        httpProducer.startMethod(), requestEntity, String.class);

                return responseEntity.getBody();
            });

            httpDistroTask.setQueryTask(() -> {
                String url = follower.buildUrl();
                String path = httpProducer.queryPath();
                HttpEntity<?> requestEntity = new HttpEntity<>(distroTask);
                ResponseEntity<DistroTaskResponse> responseEntity = restTemplate.exchange(url + path,
                        httpProducer.queryMethod(), requestEntity, DistroTaskResponse.class);
                return responseEntity.getBody();
            });
            result.add(httpDistroTask);
        }

        return result;
    }

    private List<DistroTask> buildParams(Object[] methodArgs) {

        if (methodArgs == null) {
            throw new RuntimeException("入参不能为空");
        }
        if (methodArgs.length > 1) {
            throw new RuntimeException("入参需唯一");
        }
        Object obj = methodArgs[0];
        List<DistroTask> result = new ArrayList<>();
        if (obj instanceof List) {

            List list = (List) obj;
            for (int i = 0; i < list.size(); i++) {
                Object o = list.get(i);
                if (o instanceof DistroTask) {
                    result.add((DistroTask) o);
                }
            }
        } else if (obj instanceof DistroTask) {
            result.add((DistroTask) obj);
        }

        if (result.size() < 1) {
            throw new RuntimeException("没有能处理的任务");
        }
        return result;
    }

    /**
     * 实际发送请求
     */
    public <T> void reqApi(String url, DistroTask<T> distroTask, String method, Class<?> responseClazz) {
        String result = restTemplate.postForObject(url, distroTask, String.class);
        System.out.println(result);
    }


}
