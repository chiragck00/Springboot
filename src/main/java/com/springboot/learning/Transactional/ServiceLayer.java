package com.springboot.learning.Transactional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ServiceLayer {

    @Transactional
    public void updateUser(int num){
        if(num > 0){
            System.out.println("User updated successfully");
        }else {
            throw new RuntimeException();
        }
    }
}
