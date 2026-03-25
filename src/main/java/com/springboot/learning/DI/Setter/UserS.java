package com.springboot.learning.DI.Setter;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserS {

    OrderS o;

    public UserS(){
        System.out.println("User initialized");
    }

    @Autowired
    public void setOrder(OrderS o1){
        this.o = o1;
    }

    @PostConstruct
    public void init(){
        System.out.println(this.hashCode() + " " + o.hashCode());
    }
}
