package com.springboot.learning.JPA.PlainJDBC;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ControllerP {

    @GetMapping("/plain")
    public void printUser(){
        UserDAO userDAO = new UserDAO();
        userDAO.createTable();
        userDAO.createUser("ch", 23);
        userDAO.createUser("ms", 25);
        userDAO.fetchUsers();
    }

}
