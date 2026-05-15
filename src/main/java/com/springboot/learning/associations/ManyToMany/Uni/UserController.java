package com.springboot.learning.associations.ManyToMany.Uni;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping(path = "/user")
public class UserController {

    @Autowired
    UserRepo userRepo;

    @Autowired
    OrderRepo orderRepo;

    @GetMapping("/get/{id}")
    public User getUser(@PathVariable Long id){
        return userRepo.findById(id).get();
    }

    @PostMapping("/save")
    public User saveUser(@RequestBody User user){
        List<Order> orders = user.getOrders().stream()
                .map(order -> orderRepo.findById(order.getProductId()))
                .flatMap(Optional::stream)
                .collect(Collectors.toList());
        user.setOrders(orders);
        return userRepo.save(user);
    }

    @PutMapping("/update/{id}")
    public User updateUser(@PathVariable Long id, User user){
        return userRepo.save(user);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable Long id){
        userRepo.deleteById(id);
    }
}
