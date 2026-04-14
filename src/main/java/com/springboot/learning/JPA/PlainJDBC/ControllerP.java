package com.springboot.learning.JPA.PlainJDBC;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ControllerP {
    @GetMapping("/plain")
    public void execute(){
        UserDAO userDAO = new UserDAO();
        userDAO.createUserTable();
        userDAO.createUser("ch", 32);
        userDAO.createUser("ms", 30);
        userDAO.fetchAll();
    }
}
