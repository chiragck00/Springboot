package com.springboot.learning.exception.Global;

import com.springboot.learning.exception.CustomException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/2")
public class Controller2 {

    @GetMapping("/get")
    public ResponseEntity<?> getUser(){
        throw new RuntimeException("Throwing RunTime Exception");
    }

    @GetMapping("/try-error")
    public ResponseEntity<?> get(){
        throw new CustomException("Custom Exception", HttpStatus.FORBIDDEN);
    }
}
