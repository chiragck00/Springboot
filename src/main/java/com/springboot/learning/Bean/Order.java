package com.springboot.learning.Bean;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Order {
    public Order(){
        System.out.println("Invoke Order");
    }

    @PostConstruct
    public void init(){
        System.out.println("Post Order");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Destroy Order");
    }
}
