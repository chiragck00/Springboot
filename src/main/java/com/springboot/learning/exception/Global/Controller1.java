package com.springboot.learning.exception.Global;

import com.springboot.learning.exception.CustomException;
import com.springboot.learning.exception.ErrorClass;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/api/1")
public class Controller1 {

    @GetMapping("/get")
    public ResponseEntity<?> getUser(){
        throw new RuntimeException("Throwing RunTime Exception");
    }

    @GetMapping("/try-error")
    public ResponseEntity<?> get(){
        throw new CustomException("Custom Exception", HttpStatus.FORBIDDEN);
    }

    @ExceptionHandler(CustomException.class)
    public ResponseEntity<ErrorClass> throwError(CustomException ex){
        ErrorClass error = new ErrorClass(ex.getMessage() + " Controller", ex.getStatus().value(), new Date());
        return new ResponseEntity<>(error, ex.getStatus());
    }
}
