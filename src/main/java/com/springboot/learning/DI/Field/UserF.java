package com.springboot.learning.DI.Field;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserF {

    @Autowired
    final OrderF o = null;

    public UserF(){
        System.out.println("User initialized");
    }

    @PostConstruct
    public void init(){
        System.out.println(this.hashCode() + " " + o.hashCode());
    }
}
