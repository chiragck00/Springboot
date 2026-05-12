package com.springboot.learning.Entity_Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerOrder {
    @Autowired
    OrderRepo orderRepo;

    @PostMapping("/save")
    public Order saveUser(@RequestBody Order order){
        return orderRepo.save(order);
    }
}
