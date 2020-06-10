package com.example.poc.config;

import lombok.extern.slf4j.Slf4j;
import org.h2.server.web.WebServlet;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.h2.H2ConsoleProperties;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @date: 2020/6/8 14:10
 * @author: farui.yu
 */
@Configuration
@EnableConfigurationProperties(H2ConsoleProperties.class)
@Slf4j
public class H2Config {

    @Bean
    public ServletRegistrationBean<WebServlet> h2Console(H2ConsoleProperties properties,
                                                         ObjectProvider<DataSource> dataSource) {
        String path = properties.getPath();
        String urlMapping = path + (path.endsWith("/") ? "*" : "/*");
        ServletRegistrationBean<WebServlet> registration = new ServletRegistrationBean<>(new WebServlet(), urlMapping);
        H2ConsoleProperties.Settings settings = properties.getSettings();
        if (settings.isTrace()) {
            registration.addInitParameter("trace", "");
        }

        // 开启
        registration.addInitParameter("webAllowOthers", "");

        dataSource.ifAvailable((available) -> {
            try (Connection connection = available.getConnection()) {
                log.info("H2 console available at '" + path + "'. Database available at '"
                        + connection.getMetaData().getURL() + "'");
            } catch (SQLException ex) {
                // Continue
            }
        });
        return registration;
    }
}
