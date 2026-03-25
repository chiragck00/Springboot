package com.springboot.learning.Bean;

public class User {
    String name, email;

    public User(String name, String email){
        System.out.println("Invoke User Parameterized");
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
