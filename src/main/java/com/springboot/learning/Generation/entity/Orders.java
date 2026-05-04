package com.springboot.learning.Generation.entity;

import com.springboot.learning.Generation.entity.EmbeddedWithId.OrderDetailsCK;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;

@Entity
@IdClass(OrderDetailsCK.class)
public class Orders {

    Long id;
    @Column(name="FULL_NAME", length = 100, unique = false, nullable = false)
    String name;
    @Id String email;
    @Id String phone;
    int age;

    public Orders() {
    }
}
