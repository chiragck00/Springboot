package com.springboot.learning.exception.ResponseAndException;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/api/both")
public class ControllerB {

    @GetMapping("/get")
    public ResponseEntity<?> getUser(){
        throw new MyCustom(HttpStatus.BAD_REQUEST, "Bad Request");
    }

    @ExceptionHandler(MyCustom.class)
    @ResponseStatus(value = HttpStatus.FORBIDDEN, reason = "Forbidden")
    public ResponseEntity<Object> myCustom(MyCustom ex){
        return new ResponseEntity<>("Unauthorized", HttpStatus.UNAUTHORIZED);
    }

    @ExceptionHandler(MyCustom.class)
    @ResponseStatus(value = HttpStatus.FORBIDDEN, reason = "Forbidden")
    public void myCustomEx(HttpServletResponse response, MyCustom ex) throws IOException {
        response.sendError(HttpStatus.UNAUTHORIZED.value(), "Unauthorized");
    }
}

