package com.springboot.learning.DI.Unsatisfied;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class UserU {
    @Autowired
    @Qualifier("Offline")
    OrderU orderU;

    public UserU(){
        System.out.println("User u initialized");
    }
}
