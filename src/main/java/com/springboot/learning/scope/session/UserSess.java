package com.springboot.learning.scope.session;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class UserSess {

    UserSess(){
        System.out.println("User bean initialized");
    }

    @PostConstruct
    public void init(){
        System.out.println("User hashcode: " + this.hashCode());
    }
}
