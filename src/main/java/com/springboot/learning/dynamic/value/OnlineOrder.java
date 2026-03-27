package com.springboot.learning.dynamic.value;

public class OnlineOrder implements Order{

    OnlineOrder(){
        System.out.println("Online order bean created successfully");
    }

    public String createOrder(){
        return "Online order created successfully";
    }
}
