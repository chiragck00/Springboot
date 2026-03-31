package com.springboot.learning.AOP.multipleplusnamed;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    @Before("execution(String com.springboot.learning..*())" + "&& @annotation(org.springframework.web.bind.annotation.GetMapping)")
    public void init(){
        System.out.println("All controller methods with 0 params with service code calling");
    }

    @Pointcut("execution(String com.springboot.learning..*())")
    public void named(){

    }

    @Before("named()")
    public void beforeAllStringreturn(){
        System.out.println("Before all string return");
    }

    @After("named()")
    public void afterAllStringreturn(){
        System.out.println("After all string return");
    }
}
