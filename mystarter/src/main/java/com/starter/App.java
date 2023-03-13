package com.starter;

import com.starter.config.MyServiceConfig;
import com.starter.service.MyService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        AnnotationConfigApplicationContext con = new AnnotationConfigApplicationContext(MyServiceConfig.class);
        MyService myService = (MyService)con.getBean("myService");
        myService.sayHello();
    }
}
