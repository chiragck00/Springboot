package com.springboot.learning.Async.AsyncException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;

@RestController
public class ControllerAsync {

    @Autowired
    ServiceAsync serviceAsync;

    @GetMapping("/testUser")
    public void test(@RequestParam int num){
        Future<String> result = serviceAsync.testUser(num);
        System.out.println("Controller done");
        try{
            System.out.println(result.get() + " " + result.isDone());
        }catch (Exception ex){
            System.out.println("Exception caught");
        }
    }

    @GetMapping("/testing")
    public void testing(@RequestParam int num){
        CompletableFuture<String> result = serviceAsync.testing(num);
        System.out.println("Controller done");
        try{
            System.out.println(result.get() + " " + result.isDone());
        }catch (Exception ex){
            System.out.println("Exception caught");
        }
    }

    @GetMapping("/test1")
    public void test1(@RequestParam int num){
        serviceAsync.testingError1(num);
        System.out.println("Controller done");
    }

}
