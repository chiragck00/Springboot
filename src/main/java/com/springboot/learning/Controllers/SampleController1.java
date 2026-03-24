package com.springboot.learning.Controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.DataBinder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/1")
public class SampleController1 {

    @InitBinder
    public void init(DataBinder binder){
        binder.registerCustomEditor(String.class, "firstName", new FirstNamePropertyEditor());
    }

    @GetMapping("/fetchUser")
    public String getUser(){
        return "User fetched successfully";
    }

    @GetMapping("/fetch/user")
    public String fetchUser(@RequestParam(name = "fName") String firstName,
                            @RequestParam(name = "lName", required = false) String lastName,
                            @RequestParam(name = "age") int age){
        return "First name: " + firstName + " last name: " + lastName + " age: " + age;
    }

    @GetMapping("/fetch/user/{num}")
    public ResponseEntity<Integer> fetchUser(@PathVariable(name = "num") int age){
        return ResponseEntity.status(HttpStatus.OK).body(age);
    }

    @GetMapping("/getUser")
    public String getUserDetails(@RequestBody User user){
        return user.getEmail() + " " + user.getName();
    }
}
