package com.springboot.learning.scope.request.proxyerror;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "request", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class UserRError {
    UserRError(){
        System.out.println("User bean initialized");
    }

    @PostConstruct
    public void init(){
        System.out.println("User hashcode: " + this.hashCode());
    }

    public void dummy(){

    }
}
