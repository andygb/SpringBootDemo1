package com.starter.service;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
/**
 * @author shishaofei
 * @since 2023/3/12
 */
public class MyService {
    private static Logger logger = LoggerFactory.getLogger(MyService.class);


    static {
        logger.warn("my service init {} ......", "1");
    }

    public MyService() {
        logger.warn(" MyService construct method called .....");
    }

    public void sayHello() {
        logger.warn("sayHello ");
    }
}
