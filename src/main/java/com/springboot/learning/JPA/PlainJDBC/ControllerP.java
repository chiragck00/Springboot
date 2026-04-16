package com.springboot.learning.JPA.PlainJDBC;

import com.springboot.learning.JPA.SpringbootJDBC.User;
import com.springboot.learning.JPA.SpringbootJDBC.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ControllerP {

    @Autowired
    UserService userService;

    @GetMapping("/plain")
    public void printUser(){
        UserDAO userDAO = new UserDAO();
        userDAO.createTable();
        userDAO.createUser("ch", 23);
        userDAO.createUser("ms", 25);
        userDAO.fetchUsers();
    }

    @GetMapping("/jdbc")
    public List<User> jdbcUser(){
        userService.createTable();
        userService.insertUsers();
        return userService.fetchUser();
    }

    @GetMapping("/jdbc-allnames")
    public List<String> fetchAllNames(){
        return userService.fetchAllNames();
    }

    @GetMapping("/jdbc-count")
    public int countUsers(){
        return userService.countUsers();
    }
}
