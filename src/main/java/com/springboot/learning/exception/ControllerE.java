package com.springboot.learning.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/api")
public class ControllerE {

//    This will throw with 500, path, timestamp and error no control as in both apis
//    DefaultErrorAttributes generates error
    @GetMapping("/get")
    public void getUser(){
        throw new NullPointerException("Throw NPE");
    }

    @GetMapping("/gett")
    public void get(){
        throw new CustomException("Custom Exception", HttpStatus.BAD_REQUEST);
    }


//    Proper control over exception
    @GetMapping("/try-error")
    public ResponseEntity<?> tryError(){
        try{
            throw new CustomException("Custom Exception", HttpStatus.BAD_REQUEST);
        }catch (CustomException ex){
            ErrorClass error = new ErrorClass(ex.message, ex.status.value(), new Date());
            return new ResponseEntity<>(error, ex.status);
        }
    }
}
