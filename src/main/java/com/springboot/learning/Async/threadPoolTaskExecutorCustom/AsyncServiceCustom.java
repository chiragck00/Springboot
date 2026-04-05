package com.springboot.learning.Async.threadPoolTaskExecutorCustom;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncServiceCustom {

    @Async("customExecutor")
    public void updateUser(){
        System.out.println("Inside update" + Thread.currentThread().getName());
        try{
            Thread.sleep(10000);
        }catch (Exception ex){

        }finally {
            System.out.println("Inside update" + Thread.currentThread().getName() + " execution completed");
        }
    }
}
