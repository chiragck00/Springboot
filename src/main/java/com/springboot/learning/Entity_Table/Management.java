package com.springboot.learning.Entity_Table;

import jakarta.persistence.*;

@Entity
@Table(name = "MANAGEMENT_DETAILS", schema = "entity")
public class Management {

    @Column(name = "management_name", unique = true, nullable = false, length = 255)
    String name;
    @EmbeddedId ManagementDetailsCK managementDetailsCK;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ManagementDetailsCK getManagementDetailsCK() {
        return managementDetailsCK;
    }

    public void setManagementDetailsCK(ManagementDetailsCK managementDetailsCK) {
        this.managementDetailsCK = managementDetailsCK;
    }
}
