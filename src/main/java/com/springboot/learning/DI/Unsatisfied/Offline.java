package com.springboot.learning.DI.Unsatisfied;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Offline")
public class Offline implements OrderU{
    public Offline(){
        System.out.println("Offline initialized");
    }
}
