package com.springboot.learning.Async.AsyncException;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;

@Service
public class ServiceAsync {

    @Async
    public Future<String> testUser(int num){
        if(num > 1) {
            return new AsyncResult<>("Testing");
        }
        else {
            throw new RuntimeException("Error");
        }
    }

    @Async
    public CompletableFuture<String> testing(int num){
        if(num > 1) {
            return CompletableFuture.completedFuture("Testing");
        }
        else {
            throw new RuntimeException("Error");
        }
    }

    @Async
    public void testingError(int num){
        try{
            if(num > 1) {
                System.out.println("Completed");
            }else{
                throw new RuntimeException("Error");
            }
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    @Async
    public void testingError1(int num){
        if(num > 1) {
            System.out.println("Completed");
        }else {
            throw new RuntimeException("Error");
        }
    }
}
