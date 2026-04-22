package com.springboot.learning.JPA.SpringbootJDBC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public void createTable(){
        userRepository.createTable();
    }

    public void insertIntoTable(String user_name, int age){
        userRepository.insertIntoTable(user_name, age);
    }

    public List<User> getAllUsers(){
        return userRepository.getAllUsers();
    }

    public void insert(String user_name, int age){
        userRepository.insert(user_name, age);
    }

    public List<String> getAllNames(){
        return userRepository.getAllNames();
    }

    public int count(){
        return userRepository.countUsers();
    }
}
