package com.springboot.learning.AOP.target;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    @Before("target(com.springboot.learning.AOP.Service.Servicecode)")
    public void beforeAllServiceCode(){
        System.out.println("Before all methods called via ServiceCode");
    }

}
