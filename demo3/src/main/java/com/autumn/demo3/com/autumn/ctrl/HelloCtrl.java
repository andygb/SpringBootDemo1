package com.autumn.demo3.com.autumn.ctrl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shishaofei
 * @since 2023/3/5
 */

@RestController
public class HelloCtrl {

    private final Logger logger = LoggerFactory.getLogger(HelloCtrl.class);

//    @Autowired
//    private MyService myService;

    @GetMapping("/hello")
    public String hello(@RequestParam String name, @RequestParam String age, @RequestParam int num) {
        logger.info("name = {}, age:{}, num -> {} ", name, age, num);
        logger.warn("devtools rund  ");
        logger.warn("devtools runx ");
        logger.warn("devtools rune ");

//        myService.sayHello();

        return "hello = " + name + " age = " + age + "  num = " + num;
    }
}
