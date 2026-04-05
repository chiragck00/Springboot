package com.springboot.learning.Async.IndustryStandardExecutor;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

@Configuration
public class Appconfig implements AsyncConfigurer {
    AtomicInteger counter = new AtomicInteger(1);

    ThreadFactory customFactory = r -> {
        Thread t = new Thread(r);
        t.setName("My-thread-Industry-" + counter.getAndIncrement());
        return t;
    };

    public Executor executor;

    @Override
    public synchronized Executor getAsyncExecutor(){
        if(executor == null){
            int minPoolSize = 2;
            int maxPoolSize = 4;
            int queueSize = 5;

            executor = new ThreadPoolExecutor(minPoolSize, maxPoolSize, 1, TimeUnit.HOURS, new ArrayBlockingQueue<>(queueSize), customFactory);
        }
        return executor;
    }
}
