package com.springboot.learning.scope.request.proxyerror;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller1RequestError {
    @Autowired
    UserRError u;

    Controller1RequestError(){
        System.out.println("Controller 1 bean initialized");
    }

    @PostConstruct
    public void init(){
        System.out.println("Controller 1 hashcode : " + this.hashCode() + " User hashcode: " + u.hashCode());
    }

    @GetMapping("/api")
    public String get(){
        u.dummy();
        System.out.println("Fetched");
        return "fetched";
    }
}


