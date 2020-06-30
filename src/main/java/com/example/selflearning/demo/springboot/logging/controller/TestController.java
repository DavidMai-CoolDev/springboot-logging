package com.example.selflearning.demo.springboot.logging.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    Logger logger = LoggerFactory.getLogger(TestController.class);
    @GetMapping("/hey")
    public String hello(){
        if (true){
            throw new RuntimeException("Exception is emited");
        }
        logger.trace("A TRACE Message Test Controller");
        logger.debug("A DEBUG Message Test Controller");
        logger.info("An INFO Message Test Controller");
        logger.warn("A WARN Message Test Controller");
        logger.error("An ERROR Message Test Controller");
        return "hello everyone !!!";
    }
    @GetMapping("/hey12")
    public String hello1(){
//        logger.trace("A TRACE Message Test Controller");
//        logger.debug("A DEBUG Message Test Controller");
//        logger.info("An INFO Message Test Controller");
//        logger.warn("A WARN Message Test Controller");
//        logger.error("An ERROR Message Test Controller");
        return "hello everyone hello12 !!!";
    }
}
