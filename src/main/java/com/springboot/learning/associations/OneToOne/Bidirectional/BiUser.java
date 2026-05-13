package com.springboot.learning.associations.OneToOne.Bidirectional;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;

@Entity
@Table(name = "BI_USER_DETAILS")
@JsonIdentityInfo(property = "id", generator = ObjectIdGenerators.PropertyGenerator.class)

public class BiUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name, phone, email;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "ORDER_ID", referencedColumnName = "OrderId")
//    @JsonManagedReference
//    @JsonIgnore
    BiOrder order;

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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public BiOrder getOrder() {
        return order;
    }

    public void setOrder(BiOrder order) {
        this.order = order;
    }
}
