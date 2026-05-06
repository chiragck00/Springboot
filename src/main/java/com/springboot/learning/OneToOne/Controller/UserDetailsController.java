package com.springboot.learning.OneToOne.Controller;

import com.springboot.learning.OneToOne.Service.UserDetailsService;
import com.springboot.learning.OneToOne.entity.SinglePK.UserDetails;
import com.springboot.learning.OneToOne.entity.SinglePK.UserDetailsDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user-details")
public class UserDetailsController {
    @Autowired
    UserDetailsService userDetailsService;

    @GetMapping("/get/{id}")
    public UserDetailsDTO getUser(@PathVariable Long id){
        return userDetailsService.getUser(id).userDetailsDTO();
    }

    @PostMapping("/save")
    public UserDetailsDTO saveUser(@RequestBody UserDetails userDetails){
        return userDetailsService.saveUser(userDetails).userDetailsDTO();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable Long id){
        userDetailsService.deleteUser(id);
    }

    @PutMapping("/update/{id}")
    public UserDetailsDTO updateUser(@PathVariable Long id, @RequestBody UserDetails userDetails){
        return userDetailsService.update(id, userDetails).userDetailsDTO();
    }

    @GetMapping("/getAll/{id}")
    public UserDetails getUserAll(@PathVariable Long id) {
        return userDetailsService.getUser(id);
    }

}
