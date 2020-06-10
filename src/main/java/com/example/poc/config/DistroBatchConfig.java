package com.example.poc.config;

import com.example.poc.consistency.ConsistencyService;
import com.example.poc.consistency.DemoConsistencyService;
import com.example.poc.executor.autocreate.AutoConfiguredDistroBatchRegistrar;
import com.example.poc.executor.jobbuilder.JobBuilderHelper;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;
import org.springframework.web.client.RestTemplate;

import java.time.Duration;

/**
 * @date: 2020/6/3 17:34
 * @author: farui.yu
 */
@Configuration
@Import(AutoConfiguredDistroBatchRegistrar.class)
public class DistroBatchConfig {

    @ConditionalOnMissingBean
    @Bean
    public ConsistencyService consistencyService() {
        return new DemoConsistencyService();
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder restTemplateBuilder) {
        return restTemplateBuilder
                // 连接主机的超时时间
                .setConnectTimeout(Duration.ofNanos(10000))
                // 读取数据的超时时间
                .setReadTimeout(Duration.ofNanos(10000))
                .interceptors(new RequestResponseLoggingInterceptor())
                .build();
    }

    @Bean
    @Scope("prototype")
    public JobBuilderHelper jobBuilderHelper() {
        return new JobBuilderHelper();
    }
}
