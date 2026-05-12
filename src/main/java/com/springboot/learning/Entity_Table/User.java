package com.springboot.learning.Entity_Table;

import jakarta.persistence.*;

@Entity
@IdClass(UserDetailsCK.class)
@Table(name = "USER_DETAILS", schema = "entity")
public class User {

    @Column(name = "user_name", unique = true, nullable = false, length = 255)
    String name;
    @Id String email;
    @Id String phone;
    int age;

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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
