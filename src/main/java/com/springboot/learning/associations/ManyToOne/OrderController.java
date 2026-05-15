package com.springboot.learning.associations.ManyToOne;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/order")
public class OrderController {
    @Autowired
    OrderRepo orderRepo;

    @GetMapping("/get/{id}")
    public Order getUser(@PathVariable Long id){
        return orderRepo.findById(id).get();
    }

    @PostMapping("/save")
    public Order saveUser(@RequestBody Order order){
        return orderRepo.save(order);
    }

    @PutMapping("/update/{id}")
    public Order updateUser(@PathVariable Long id, Order order){
        return orderRepo.save(order);
    }

    @GetMapping("/getAll")
    public List<Order> getAll(){
        return orderRepo.findAll();
    }
}
