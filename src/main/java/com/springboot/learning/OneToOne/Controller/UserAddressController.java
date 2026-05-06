package com.springboot.learning.OneToOne.Controller;

import com.springboot.learning.OneToOne.Service.UserAddressService;
import com.springboot.learning.OneToOne.entity.SinglePK.UserAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user-address")
public class UserAddressController {
    @Autowired
    UserAddressService userAddressService;

    @GetMapping("/get/{id}")
    public UserAddress getUser(@PathVariable Long id){
        return userAddressService.getUser(id);
    }

    @PostMapping("/save")
    public UserAddress saveUser(@RequestBody UserAddress userAddress){
        return userAddressService.saveUser(userAddress);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable Long id){
        userAddressService.deleteUser(id);
    }

    @PutMapping("/update/{id}")
    public UserAddress updateUser(@PathVariable Long id, @RequestBody UserAddress userAddress){
        return userAddressService.update(id, userAddress);
    }
}
