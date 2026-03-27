package com.springboot.learning.dynamic.user_input;

import org.springframework.stereotype.Component;

@Component
public class OnlineOrder implements Order{

    OnlineOrder(){
        System.out.println("Online order bean created successfully");
    }

    public String createOrder(){
        return "Online order created successfully";
    }
}
