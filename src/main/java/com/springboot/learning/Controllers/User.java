package com.springboot.learning.Controllers;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {
    @JsonProperty(value = "fName", required = false)
    String name;
    String email;


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
