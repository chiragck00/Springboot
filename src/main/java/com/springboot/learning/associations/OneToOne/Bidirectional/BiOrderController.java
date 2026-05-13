package com.springboot.learning.associations.OneToOne.Bidirectional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bi/order")
public class BiOrderController {
    @Autowired
    BiOrderService orderService;

    @GetMapping("/get/{id}")
    public BiOrder getOrder(@PathVariable Long id){
        return orderService.getOrder(id);
    }

    @PostMapping("/save")
    public BiOrder saveOrder(@RequestBody BiOrder order){
        return orderService.saveOrder(order);
    }

    @PutMapping("/update/{id}")
    public BiOrder updateOrder(@PathVariable Long id, @RequestBody BiOrder order){
        return orderService.updateOrder(id, order);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteOrder(@PathVariable Long id){
        orderService.deleteOrder(id);
        return ResponseEntity.noContent().build();
    }

}
