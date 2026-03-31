package com.springboot.learning.AOP.AtRateWithin;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    @Before("@within(org.springframework.web.bind.annotation.RestController)")
    public void beforeAllRestContoller(){
        System.out.println("For all controller methods");
    }

    @Before("@within(org.springframework.stereotype.Service)")
    public void beforeAllService(){
        System.out.println("For all service methods");
    }
}
