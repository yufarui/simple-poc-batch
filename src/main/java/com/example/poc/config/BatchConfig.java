package com.example.poc.config;

import com.example.poc.consistency.BeatInfo;
import com.example.poc.consistency.ConsistencyService;
import org.springframework.batch.core.configuration.annotation.BatchConfigurer;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;


@Configuration
@EnableBatchProcessing
public class BatchConfig {

    @Autowired
    private ConsistencyService consistencyService;

    /**
     * todo 节点的注册，此处只是示例
     */
    @PostConstruct
    public void init() {
        registeFollower("10.243.140.40");
        registeFollower("10.243.140.51");
    }

    @Bean
    public BatchConfigurer batchConfigurer() {
        return new MyBatchConfig();
    }

    private BeatInfo registeFollower(String ip) {
        BeatInfo beatInfo = new BeatInfo();
        beatInfo.setIp(ip);
        beatInfo.setPort("8001");
        consistencyService.put(beatInfo);
        return beatInfo;
    }
}
