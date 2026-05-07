package com.springboot.learning.Mappings.OneToManyUni;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/oneToMany")
public class controllerAll {
    @Autowired
    ServiceUser serviceUser;

    @PostMapping("/save")
    public User saveUser(@RequestBody User user) {
        return serviceUser.saveUser(user);
    }

    @GetMapping("/get/{id}")
    public User getUser(@PathVariable Long id){
        return serviceUser.getUser(id);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable Long id){
        serviceUser.deleteUser(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/get")
    public User orphanTest(){
        User user = serviceUser.getUser(1L);
        user.getOrders().remove(0);
        return serviceUser.saveUser(user);
    }
}
