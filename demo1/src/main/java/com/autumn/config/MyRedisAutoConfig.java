package com.autumn.config;

import com.autumn.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author shishaofei
 * @since 2023/2/11
 */
@Configuration
public class MyRedisAutoConfig {

    @Bean
    public UserService userService() {
        return new UserService();
    }
}
