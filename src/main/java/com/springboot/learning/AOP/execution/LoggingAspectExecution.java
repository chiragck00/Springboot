package com.springboot.learning.AOP.execution;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspectExecution {

    @Before("execution (public String com.springboot.learning.AOP.Controller.fetch1())")
    public void before(){
        System.out.println("Before aspect");
    }

    @Before("execution (* com.springboot.learning.AOP.Controller.*())")
    public void beforeAnyReturn(){
        System.out.println("Before aspect with any return type");
    }

    @Before("execution (* com.springboot.learning.AOP.Controller.*(*))")
    public void beforeAnyReturnAnyArgument(){
        System.out.println("Before aspect with any return type with any parameter with 1 argument");
    }

    @Before("execution (* com.springboot.learning.AOP.Controller.*(..))")
    public void beforeAnyReturnAnyNumberArgument(){
        System.out.println("Before aspect with any return type with any parameter with any number of argument");
    }

    @Before("execution (String com.springboot..*(..))")
    public void beforeAnyPackageAnyReturnAnyNumberArgument(){
        System.out.println("Before aspect with String return type with any parameter with any number of argument in springboot package in any class in all methods");
    }
}
