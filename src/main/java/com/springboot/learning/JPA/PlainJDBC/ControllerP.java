package com.springboot.learning.JPA.PlainJDBC;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ControllerP {

    @GetMapping("plain-jdbc")
    public void plain(){
        UserDAO userDAO = new UserDAO();
        userDAO.createTable();
        userDAO.insertIntoTable("First", 22);
        userDAO.insertIntoTable("Second", 21);
        userDAO.getUsers();
    }
}
