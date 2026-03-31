package com.springboot.learning.AOP.around;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    @Around("execution(* com.springboot.learning.AOP.Controller.*())")
    public Object logging(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Before any controller with 0 arguments");
        Object result = joinPoint.proceed();
        System.out.println("After any controller with 0 arguments");
        return result;
    }

}
