package com.springboot.learning.interceptor.afterController;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Component
@Aspect
public class LoggingAspect {

    @Around("@annotation(com.springboot.learning.interceptor.afterController.MyCustom)")
    public void loggingAspect(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Before Controller");
        MyCustom myCustom = ((MethodSignature)joinPoint.getSignature()).getMethod().getAnnotation(MyCustom.class);
        System.out.println(myCustom.arr() + " " + myCustom.name() + " " + myCustom.val());
        joinPoint.proceed();
        System.out.println("After Controller");
    }
}
