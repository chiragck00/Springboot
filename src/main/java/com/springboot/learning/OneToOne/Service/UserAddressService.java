package com.springboot.learning.OneToOne.Service;

import com.springboot.learning.OneToOne.Repository.UserAddressRepo;
import com.springboot.learning.OneToOne.entity.SinglePK.UserAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserAddressService {

    @Autowired
    UserAddressRepo userAddressRepo;

    public UserAddress saveUser(UserAddress userDetails){
        return userAddressRepo.save(userDetails);
    }

    public UserAddress getUser(Long id){
        return userAddressRepo.findById(id).get();
    }

    public void deleteUser(Long id){
        userAddressRepo.deleteById(id);
    }

    public UserAddress update(Long id, UserAddress userDetails){
        return userAddressRepo.save(userDetails);
    }
}
