package com.springboot.learning.interceptor.beforeController;

import org.aspectj.lang.annotation.Pointcut;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ControllerI {


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
        throw new RuntimeException("Delete user");
    }
}
