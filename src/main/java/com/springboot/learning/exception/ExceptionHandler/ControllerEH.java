package com.springboot.learning.exception.ExceptionHandler;

import com.springboot.learning.exception.CustomException;
import com.springboot.learning.exception.ErrorClass;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.Date;

@RestController
@RequestMapping("/api/eh")
public class ControllerEH {

    @GetMapping("/get")
    public ResponseEntity<?> getUser(){
        throw new IllegalArgumentException("Throwing Illegal Exception");
    }

    @GetMapping("/try-error")
    public ResponseEntity<?> get(){
        throw new CustomException("Custom Exception", HttpStatus.FORBIDDEN);
    }

//    @ExceptionHandler({CustomException.class, IllegalArgumentException.class})
//    public ResponseEntity<ErrorClass> throwError(Exception ex){
//        ErrorClass error = new ErrorClass(ex.getMessage(), HttpStatus.BAD_GATEWAY.value(), new Date());
//        return new ResponseEntity<>(error, HttpStatus.BAD_GATEWAY);
//    }

//    @ExceptionHandler(CustomException.class)
//    public void handleError(HttpServletResponse response, CustomException ex) throws IOException {
//        response.sendError(ex.getStatus().value(), ex.getMessage() + " ");
//    }

//    @ExceptionHandler(CustomException.class)
//    public ResponseEntity<ErrorClass> throwError(CustomException ex){
//        ErrorClass error = new ErrorClass(ex.getMessage(), ex.getStatus().value(), new Date());
//        return new ResponseEntity<>(error, ex.getStatus());
//    }

//    @ExceptionHandler(IllegalArgumentException.class)
//    public ResponseEntity<ErrorClass> throwError(IllegalArgumentException ex){
//        ErrorClass error = new ErrorClass(ex.getMessage(), HttpStatus.UNAUTHORIZED.value(), new Date());
//        return new ResponseEntity<>(error, HttpStatus.UNAUTHORIZED);
//    }
}
