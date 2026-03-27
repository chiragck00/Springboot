package com.springboot.learning.scope.prototype;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Scope("prototype")
public class Controller1Pro {
    @Autowired
    StudentP s;

    @Autowired
    UserP u;

    Controller1Pro(){
        System.out.println("Controller 1 bean initialized");
    }

    @PostConstruct
    public void init(){
        System.out.println("Controller 1 hashcode : " + this.hashCode() + " User hashcode: " + u.hashCode() + " Student hashcode: " + s.hashCode());
    }

    @GetMapping("/api")
    public String get(){
        return "fetched";
    }
}


