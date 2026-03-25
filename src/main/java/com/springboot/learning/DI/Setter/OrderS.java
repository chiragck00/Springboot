package com.springboot.learning.DI.Setter;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class OrderS {
    public OrderS(){
        System.out.println("Order initialized");
    }

    @PostConstruct
    public void init(){
        System.out.println(this.hashCode());
    }
}
