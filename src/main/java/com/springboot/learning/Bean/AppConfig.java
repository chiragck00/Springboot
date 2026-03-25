package com.springboot.learning.Bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public User createUser1(){
        return new User("name1", "email1");
    }

    @Bean
    public User createUser2(){
        return new User("name2", "email2");
    }
}
