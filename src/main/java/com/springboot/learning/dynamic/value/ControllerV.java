package com.springboot.learning.dynamic.value;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api")
public class ControllerV {

    @Autowired
    Order order;

    ControllerV(){
        System.out.println("Controller bean created successfully");
    }

    @GetMapping
    public ResponseEntity<String> createOrder(){
        return ResponseEntity.status(HttpStatus.OK).body(order.createOrder());
    }
}
