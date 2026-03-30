package com.springboot.learning.AOP.args;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    @Before("args(int, int)")
    public void before(){
        System.out.println("All methods having int, int");
    }
}
