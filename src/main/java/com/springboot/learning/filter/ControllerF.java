package com.springboot.learning.filter;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ControllerF {


    @GetMapping("/get")
    public void getUser(){
        System.out.println("Get user");
    }

    @PostMapping("/post")
    public void postUser(){
        System.out.println("Post user");
    }

    @PutMapping("/put")
    public void putUser(){
        System.out.println("Put user");
    }

    @DeleteMapping("/delete")
    public void deleteUser(){
        System.out.println("Delete user");
    }
}

