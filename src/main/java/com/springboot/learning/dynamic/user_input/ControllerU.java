package com.springboot.learning.dynamic.user_input;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api")
public class ControllerU {
    @Qualifier("onlineOrder")
    @Autowired
    Order online;

    @Qualifier("offlineOrder")
    @Autowired
    Order offline;

    ControllerU(){
        System.out.println("Controller bean created successfully");
    }

    @GetMapping
    public ResponseEntity<String> createOrder(@RequestParam boolean isOnline){
        String output = isOnline ? online.createOrder() : offline.createOrder();
        return ResponseEntity.status(HttpStatus.OK).body(output);
    }
}
