package com.springboot.learning.exception.Global;

import com.springboot.learning.exception.CustomException;
import com.springboot.learning.exception.ErrorClass;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Date;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<ErrorClass> throwRun(RuntimeException ex){
        ErrorClass error = new ErrorClass(ex.getMessage() + " Global", HttpStatus.BAD_REQUEST.value(), new Date());
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(CustomException.class)
    public ResponseEntity<ErrorClass> throwError(CustomException ex){
        ErrorClass error = new ErrorClass(ex.getMessage() + " Global", ex.getStatus().value(), new Date());
        return new ResponseEntity<>(error, ex.getStatus());
    }
}
