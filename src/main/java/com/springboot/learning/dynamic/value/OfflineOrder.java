package com.springboot.learning.dynamic.value;

public class OfflineOrder implements Order{

    OfflineOrder(){
        System.out.println("Offline order bean created successfully");
    }

    public String createOrder(){
        return "Offline order created successfully";
    }
}
