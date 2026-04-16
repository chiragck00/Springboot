package com.springboot.learning.JPA.SpringbootJDBC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public void createTable(){
        userRepository.createTable();
    }

    public void insertUsers(){
        userRepository.createUser("Chirag", 20);
        userRepository.createUser("Muskaan", 25);
        userRepository.createUser("Shresth", 30);
    }

    public List<User> fetchUser(){
        return userRepository.fetchUsers();
    }

    public List<String> fetchAllNames(){
        return userRepository.fetchAllNames();
    }

    public int countUsers(){
        return userRepository.countOfUsers();
    }
}
