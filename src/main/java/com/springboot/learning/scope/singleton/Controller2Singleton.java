package com.springboot.learning.scope.singleton;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller2Singleton {
    @Autowired
    User u;

    Controller2Singleton(){
        System.out.println("Controller 1 bean initialized");
    }

    @PostConstruct
    public void init(){
        System.out.println("Controller 1 hashcode : " + this.hashCode() + " User hashcode: " + u.hashCode());
    }
}
