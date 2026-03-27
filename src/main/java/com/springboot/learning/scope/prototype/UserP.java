package com.springboot.learning.scope.prototype;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class UserP {
    UserP(){
        System.out.println("User bean initialized");
    }

    @PostConstruct
    public void init(){
        System.out.println("User hashcode: " + this.hashCode());
    }
}
