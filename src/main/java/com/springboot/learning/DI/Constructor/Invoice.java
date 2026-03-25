package com.springboot.learning.DI.Constructor;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class Invoice {
    public Invoice(){
        System.out.println("Order initialized");
    }

    @PostConstruct
    public void init(){
        System.out.println(this.hashCode());
    }
}
