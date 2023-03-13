package com.autumn.com.autumn.controller;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class MyController {

    private final static Logger logger = LoggerFactory.getLogger(MyController.class);

    @GetMapping("/query")
    public String query(@RequestParam(required = false) String name) {
        logger.info("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA , {}", name);
        return "hello, " + name;
    }
}
