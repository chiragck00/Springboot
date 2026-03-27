package com.springboot.learning.scope.request.withoutproxy;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Scope("request")
public class Controller1Request {
    @Autowired
    StudentR s;

    @Autowired
    UserR u;

    Controller1Request(){
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


