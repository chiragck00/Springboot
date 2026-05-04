package com.springboot.learning.Generation.entity;

import com.springboot.learning.Generation.entity.EmbeddedWithId.OrderDetailsCK;
import com.springboot.learning.Generation.entity.EmbeddedWithId.OrderDetailsCopyCK;
import jakarta.persistence.*;

@Entity
public class Order_Copy {

    Long id;
    @Column(name="FULL_NAME", length = 100, unique = false, nullable = false)
    String name;
    @EmbeddedId
    OrderDetailsCopyCK orderDetailsCopyCK;
    int age;

    public Order_Copy() {
    }
}
