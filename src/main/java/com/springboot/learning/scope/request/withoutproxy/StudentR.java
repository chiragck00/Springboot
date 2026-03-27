package com.springboot.learning.scope.request.withoutproxy;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class StudentR {

    @Autowired
    UserR u;

    StudentR(){
        System.out.println("Student bean initialized");
    }

    @PostConstruct
    public void init(){
        System.out.println("Student hashcode: " + this.hashCode() + " User hashcode: " + u.hashCode());
    }
}
