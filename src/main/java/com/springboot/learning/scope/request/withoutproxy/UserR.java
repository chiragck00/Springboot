package com.springboot.learning.scope.request.withoutproxy;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("request")
public class UserR {
    UserR(){
        System.out.println("User bean initialized");
    }

    @PostConstruct
    public void init(){
        System.out.println("User hashcode: " + this.hashCode());
    }
}
