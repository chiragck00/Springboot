package com.springboot.learning.DI.Field;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class OrderF {
    public OrderF(){
        System.out.println("Order initialized");
    }

    @PostConstruct
    public void init(){
        System.out.println(this.hashCode());
    }
}
