package com.springboot.learning.L2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class Controller {

    @Autowired
    OrderService orderService;

    @GetMapping("/get/{id}")
    public OrderEntity get(@PathVariable long id){
        return orderService.get(id);
    }

    @PostMapping("/save")
    public void save(@RequestBody OrderEntity order){
        orderService.save(order);
    }

    @PutMapping("/update")
    public void update(@RequestBody OrderEntity order){
        orderService.update(order);
    }
}
