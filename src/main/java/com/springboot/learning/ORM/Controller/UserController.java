package com.springboot.learning.ORM.Controller;

import com.springboot.learning.ORM.Repo.Users;
import com.springboot.learning.ORM.Service.UserService;
import com.springboot.learning.ORM.Service.UserServiceOwn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @Autowired
    UserServiceOwn userServiceOwn;

    @GetMapping("/getAll")
    public List<Users> getAll(){
        return userService.getAllUsers();
    }

    @GetMapping("/get/{id}")
    public Users get(@PathVariable Long id){
        return userService.getUsersById(id);
    }

    @PostMapping("/save")
    public void saveUser(@RequestBody Users user){
        userService.saveUser(user);
    }

    @GetMapping("/save-get")
    public Users saveGet(@RequestBody Users user){
        userService.saveUser(user);
        return userService.getUsersById(1L);
    }

    @GetMapping("/get-get")
    public Users GetGet(){
        userService.getUsersById(1L);
        return userService.getUsersById(1L);
    }

    @GetMapping("/save-get-emf")
    public Users saveGetEmf(@RequestBody Users user){
        return userServiceOwn.save(user);
    }
}
