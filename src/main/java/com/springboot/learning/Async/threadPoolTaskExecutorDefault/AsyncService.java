package com.springboot.learning.Async.threadPoolTaskExecutorDefault;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncService {

    @Async
    public void updateUser(){
        System.out.println("Inside update" + Thread.currentThread().getName());
    }
}
