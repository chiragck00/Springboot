package com.springboot.learning.scope.singleton;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class User {
    User(){
        System.out.println("User bean initialized");
    }

    @PostConstruct
    public void init(){
        System.out.println("User hashcode: " + this.hashCode());
    }
}
