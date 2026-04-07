package com.springboot.learning.interceptor.afterController;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ControllerC {

    @GetMapping("/get")
    @MyCustom
    public void getUser(){
        System.out.println("Get user");
    }

    @PostMapping("/post")
    @MyCustom(val = 10, name = "Chirag", arr = {3, 4, 5})
    public void postUser(){
        System.out.println("Post user");
    }

    @PutMapping("/put")
    @MyCustom
    public void putUser(){
        System.out.println("Put user");
    }

    @DeleteMapping("/delete")
    @MyCustom
    public void deleteUser(){
        throw new RuntimeException("Delete user");
    }
}
