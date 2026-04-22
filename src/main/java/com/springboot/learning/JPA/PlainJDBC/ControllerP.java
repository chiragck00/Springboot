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

    @GetMapping("plain-jdbc")
    public void plain(){
        UserDAO userDAO = new UserDAO();
        userDAO.createTable();
        userDAO.insertIntoTable("First", 22);
        userDAO.insertIntoTable("Second", 21);
        userDAO.getUsers();
    }

    @GetMapping("spring-jdbc")
    public List<User> spring(){
        userService.createTable();
        userService.insertIntoTable("First", 22);
        userService.insertIntoTable("Second", 21);
        return userService.getAllUsers();
    }

    @GetMapping("spring-jdbc-insert")
    public void springInsert(){
        userService.insert("First", 25);
        userService.insert("Second", 20);
    }

    @GetMapping("spring-jdbc-all")
    public List<User> springGetAll(){
        return userService.getAllUsers();
    }

    @GetMapping("spring-jdbc-all-names")
    public List<String> springGetAllNames(){
        return userService.getAllNames();
    }

    @GetMapping("spring-jdbc-count")
    public int springCount(){
        return userService.count();
    }
}
