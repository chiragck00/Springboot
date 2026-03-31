package com.springboot.learning.AOP.within;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    @Before("within(com.springboot.learning.AOP.Controller)")
    public void beforeAllController(){
        System.out.println("Before All controller methods");
    }

    @Before("within(com.springboot..*)")
    public void beforeAllInSpringboot(){
        System.out.println("Before All controller methods in springboot");
    }
}
