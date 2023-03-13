package com.autumn;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author shishaofei
 * @since 2023/2/13
 */
@Slf4j
@SpringBootApplication
public class SpringbootDemo {

    private final static Logger logger = LoggerFactory.getLogger("com.autumn");

    public static void main(String[] args) {
        logger.info(" SpringbootDemo run ");
        SpringApplication.run(SpringbootDemo.class);
    }
}
