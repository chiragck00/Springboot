package com.springboot.learning.dynamic.user_input;

import org.springframework.stereotype.Component;

@Component
public class OfflineOrder implements Order{

    OfflineOrder(){
        System.out.println("Offline order bean created successfully");
    }

    public String createOrder(){
        return "Offline order created successfully";
    }
}
