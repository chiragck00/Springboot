package com.springboot.learning.scope.prototype;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class StudentP {

    @Autowired
    UserP u;

    StudentP(){
        System.out.println("Student bean initialized");
    }

    @PostConstruct
    public void init(){
        System.out.println("Student hashcode: " + this.hashCode() + " User hashcode: " + u.hashCode());
    }
}
