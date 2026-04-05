package com.springboot.learning.Async;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

@Configuration
public class AppConfig {

    AtomicInteger counter = new AtomicInteger(1);

    ThreadFactory customFactory = r -> {
        Thread t = new Thread(r);
        t.setName("My-thread-" + counter.getAndIncrement());
        return t;
    };

    @Bean("customThreadPoolExecutor")
    public Executor manualThreadPool(){
        int minPoolSize = 2;
        int maxPoolSize = 4;
        int queueSize = 5;

        return new ThreadPoolExecutor(minPoolSize, maxPoolSize, 1, TimeUnit.HOURS, new ArrayBlockingQueue<>(queueSize), customFactory);
    }

    @Bean("customExecutor")
    public Executor taskExecutor(){
        ThreadPoolTaskExecutor threadPoolTaskExecutor = new ThreadPoolTaskExecutor();
        threadPoolTaskExecutor.setCorePoolSize(3);
        threadPoolTaskExecutor.setMaxPoolSize(5);
        threadPoolTaskExecutor.setQueueCapacity(2);
        threadPoolTaskExecutor.setThreadNamePrefix("My-Thread-Custom-");
        threadPoolTaskExecutor.initialize();
        return threadPoolTaskExecutor;
    }
}
