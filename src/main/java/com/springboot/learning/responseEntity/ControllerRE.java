package com.springboot.learning.responseEntity;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ControllerRE {

    @GetMapping("/get")
    public ResponseEntity<String> fetch(){
        HttpHeaders headers = new HttpHeaders();
        headers.add("Location", "/get-new");
        return ResponseEntity.status(HttpStatus.OK)
                .headers(headers)
                .body("Success");
    }

    @GetMapping("/old-get")
    public ResponseEntity<String> fetchOld(){
        HttpHeaders headers = new HttpHeaders();
        headers.add("Location", "/api/new-get");
        return ResponseEntity.status(HttpStatus.MOVED_PERMANENTLY)
                .headers(headers)
                .build();
    }
    @GetMapping("/new-get")
    public ResponseEntity<String> fetchNew(){
        return ResponseEntity.status(HttpStatus.OK)
                .body("Success");
    }
}
