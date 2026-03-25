package com.springboot.learning.DI.Unsatisfied;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Qualifier("Online")
public class Online implements OrderU{
    public Online(){
        System.out.println("Online initialized");
    }
}
