package com.springboot.learning.exception.ResponseStatus;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/response")
public class ControllerR {

    @GetMapping("/get")
    public void get(){
        throw new MyCustomException("My Custom Exception");
    }

}
