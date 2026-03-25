package com.springboot.learning.Bean;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Man {
    @Autowired
    Order o;

    public Man(){
        System.out.println("Invoke man");
    }

    @PostConstruct
    public void init(){
        System.out.println("Post man");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Destroy man");
    }
}
