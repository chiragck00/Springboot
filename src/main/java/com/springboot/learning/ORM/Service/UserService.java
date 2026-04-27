package com.springboot.learning.ORM.Service;


import com.springboot.learning.ORM.Repo.UserRepository;
import com.springboot.learning.ORM.Repo.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public void saveUser(Users user) {
        userRepository.save(user);
    }

    public List<Users> getAllUsers() {
        return userRepository.findAll();
    }

    public Users getUsersById(Long id){
        return userRepository.findById(id).orElse(null);
    }
}
