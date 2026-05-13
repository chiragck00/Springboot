package com.springboot.learning.associations.OneToOne.Bidirectional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BiUserService {

    @Autowired
    BiUserRepo userRepo;

    public BiUser saveUser(BiUser user){
        return userRepo.save(user);
    }

    public BiUser getUser(Long id){
        return userRepo.findById(id).get();
    }

    public BiUser updateUser(Long id, BiUser user){
        return userRepo.save(user);
    }

    public void deleteUser(Long id){
        userRepo.deleteById(id);
    }
}
