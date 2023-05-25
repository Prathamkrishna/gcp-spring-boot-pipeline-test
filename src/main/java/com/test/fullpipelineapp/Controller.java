package com.test.fullpipelineapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public String sayHello() throws InterruptedException {
        Thread.sleep(5000);
        return "hello friend";
    }
}
