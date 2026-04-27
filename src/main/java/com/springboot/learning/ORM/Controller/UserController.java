package com.springboot.learning.ORM.Controller;

import com.springboot.learning.ORM.Repo.Users;
import com.springboot.learning.ORM.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

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
}
