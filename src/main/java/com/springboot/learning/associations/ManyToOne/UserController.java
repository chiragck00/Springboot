package com.springboot.learning.associations.ManyToOne;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/user")
public class UserController {

    @Autowired
    UserRepo userRepo;

    @GetMapping("/get/{id}")
    public User getUser(@PathVariable Long id){
        return userRepo.findById(id).get();
    }

    @PostMapping("/save")
    public User saveUser(@RequestBody User user){
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
