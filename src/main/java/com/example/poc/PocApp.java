package com.example.poc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import javax.sql.DataSource;

@SpringBootApplication
public class PocApp {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(PocApp.class, args);
        System.out.println(context.getBean(DataSource.class));
    }
}
