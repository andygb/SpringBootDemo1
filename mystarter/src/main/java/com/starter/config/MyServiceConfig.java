package com.starter.config;

import com.starter.service.MyService;
import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author shishaofei
 * @since 2023/3/12
 */
//@Configuration
public class MyServiceConfig {
    private static Logger logger = LoggerFactory.getLogger(MyServiceConfig.class);

    public MyServiceConfig() {
        logger.warn("MyServiceConfig construct method called .....");
    }

    @Bean
    public MyService myService() {
        return new MyService();
    }
}
