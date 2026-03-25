package com.springboot.learning.DI.Constructor;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class User {

    Order o;
    Invoice i;

    @Autowired
    public User(Order o1){
        this.o = o1;
        System.out.println("User initialized with order");
    }

    public User(Invoice i1){
        this.i = i1;
        System.out.println("User initialized with invoice");
    }


    @PostConstruct
    public void init(){
        System.out.println(this.hashCode() + " " + o.hashCode());
    }
}
