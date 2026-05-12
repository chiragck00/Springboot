package com.springboot.learning.Entity_Table;

import jakarta.persistence.*;

@Entity
@Table(name = "ORDER_DETAILS", schema = "entity",
        uniqueConstraints = {
            @UniqueConstraint(columnNames = "Order_name", name = "uq_name"),
            @UniqueConstraint(columnNames = {"email", "phone"}, name = "uq_email_phone")},
        indexes = {
            @Index(name = "idx_name", columnList = "Order_name"),
            @Index(name ="idx_email_phone", columnList = "email, phone")
        }
)
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "uq_name")
    @SequenceGenerator(name = "uq_name", sequenceName = "sq_name", initialValue = 100, allocationSize = 3)
    Long id;

    @Column(name = "Order_name", unique = true, nullable = false, length = 255)
    String name;
    String email, phone;
    int age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
