package com.springboot.learning.Bean;

import org.springframework.stereotype.Component;

@Component
public class ComponentUser {
    String name, email;

    public ComponentUser(){
        System.out.println("Invoke User Default");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
