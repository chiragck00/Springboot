package com.springboot.learning.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    ServiceLayer serviceLayer;

    @GetMapping("/updateUser")
    public void updateUser(@RequestParam int num){
        serviceLayer.updateUser(num);
    }
}
