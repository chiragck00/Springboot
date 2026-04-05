package com.springboot.learning.Async.threadPoolTaskExecutorCustom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AsyncControllerCustom {
    @Autowired
    AsyncServiceCustom asyncService;

    @GetMapping("/getUser")
    public void getUser(){
        System.out.println("Inside controller" + Thread.currentThread().getName());
        asyncService.updateUser();
    }
}
