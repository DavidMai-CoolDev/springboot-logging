package com.example.selflearning.demo.springboot.logging.controller2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class TestController2 {
    Logger logger = LoggerFactory.getLogger(TestController2.class);
    @GetMapping("/ho")
    public String hello(){
        if (true){
            throw new RuntimeException("Exception is emited from controller2");
        }
        logger.trace("A TRACE Message Test Controller");
        logger.debug("A DEBUG Message Test Controller");
        logger.info("An INFO Message Test Controller");
        logger.warn("A WARN Message Test Controller");
        logger.error("An ERROR Message Test Controller");
        return "hello everyone from controller2 !!!";
    }
}
