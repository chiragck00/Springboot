package com.springboot.learning.Async;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@Configuration
public class AppConfig {

    public ThreadPoolExecutor manualThreadPool(){
        int minPoolSize = 2;
        int maxPoolSize = 4;
        int queueSize = 5;

        return new ThreadPoolExecutor(minPoolSize, maxPoolSize, 1, TimeUnit.HOURS, new ArrayBlockingQueue<>(queueSize));
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
