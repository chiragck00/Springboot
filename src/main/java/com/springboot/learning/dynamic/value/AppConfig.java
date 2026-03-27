package com.springboot.learning.dynamic.value;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Order orderBean(@Value("${isOnline}") boolean isOnline){
        return isOnline ? new OnlineOrder() : new OfflineOrder();
    }
}
