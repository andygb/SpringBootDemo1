package com.autumn;

import com.autumn.config.MyConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author shishaofei
 * @since 2023/2/11
 */
@Configuration
@ComponentScan(basePackages = "com.autumn")
public class DemoApp {

    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(DemoApp.class);
        System.out.println(ac.getBean("userService"));
    }

}
