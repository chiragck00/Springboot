package com.springboot.learning.Generation.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "USER_ENTITY", schema = "entity",
        uniqueConstraints = {
            @UniqueConstraint(columnNames = "email"),
            @UniqueConstraint(columnNames = {"phone", "FULL_NAME"})},
        indexes = {
            @Index(columnList = "email", name = "email_idx"),
            @Index(columnList = "phone, FULL_NAME", name = "phone_name_idx")
        }
)
public class User_Copy {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name="uq_user_seq", sequenceName = "db_sequence", initialValue = 100, allocationSize = 20)
    Long id;
    @Column(name="FULL_NAME", length = 100, unique = false, nullable = false)
    String name;
    String email, phone;
    int age;

    public User_Copy() {
    }
}
