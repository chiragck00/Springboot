package com.springboot.learning.associations.OneToOne.Bidirectional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bi/user")
public class BiUserController {
    @Autowired
    BiUserService userService;

    @GetMapping("/get/{id}")
    public BiUser getUser(@PathVariable Long id){
        return userService.getUser(id);
    }

    @PostMapping("/save")
    public BiUser saveUser(@RequestBody BiUser user){
        return userService.saveUser(user);
    }

    @PutMapping("/update/{id}")
    public BiUser updateUser(@PathVariable Long id, @RequestBody BiUser user){
        return userService.updateUser(id, user);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable Long id){
        userService.deleteUser(id);
        return ResponseEntity.noContent().build();
    }

}
