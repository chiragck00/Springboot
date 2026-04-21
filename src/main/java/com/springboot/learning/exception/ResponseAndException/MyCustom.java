package com.springboot.learning.exception.ResponseAndException;

import org.springframework.http.HttpStatus;

public class MyCustom extends RuntimeException {
    HttpStatus status;
    String message;

    public MyCustom(){

    }

    public MyCustom(HttpStatus status, String message){
        this.status = status;
        this.message = message;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
