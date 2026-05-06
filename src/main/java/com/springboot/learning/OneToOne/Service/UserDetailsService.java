package com.springboot.learning.OneToOne.Service;

import com.springboot.learning.OneToOne.Repository.UserDetailsRepo;
import com.springboot.learning.OneToOne.entity.SinglePK.UserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsService {
    @Autowired
    UserDetailsRepo userDetailsRepo;

    public UserDetails saveUser(UserDetails userDetails){
        return userDetailsRepo.save(userDetails);
    }

    public UserDetails getUser(Long id){
        return userDetailsRepo.findById(id).get();
    }

    public void deleteUser(Long id){
        userDetailsRepo.deleteById(id);
    }

    public UserDetails update(Long id, UserDetails userDetails){
        return userDetailsRepo.save(userDetails);
    }
}
