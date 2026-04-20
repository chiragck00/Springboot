package com.springboot.learning.exception.ResponseStatus;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Missing Something")
public class MyCustomException extends RuntimeException{

    public MyCustomException(String message){
        super(message);
    }
}
