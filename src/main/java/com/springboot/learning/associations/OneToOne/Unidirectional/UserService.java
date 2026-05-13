package com.springboot.learning.associations.OneToOne.Unidirectional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepo userRepo;

    public User saveUser(User user){
        return userRepo.save(user);
    }

    public User getUser(Long id){
        return userRepo.findById(id).get();
    }

    public User updateUser(Long id, User user){
        return userRepo.save(user);
    }

    public void deleteUser(Long id){
        userRepo.deleteById(id);
    }
}
