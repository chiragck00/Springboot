package com.springboot.learning.Async.AsyncException;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;

@Configuration
public class appconfig implements AsyncConfigurer {

    @Autowired
    AsyncUncaughtExceptionHandler asyncUncaughtExceptionHandler;

    @Override
    public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler(){
        return this.asyncUncaughtExceptionHandler;
    }
}

