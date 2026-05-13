package com.springboot.learning.associations.OneToOne.CKMapping;

import jakarta.persistence.*;

@Entity
@Table(name = "USER_CK_DETAILS")
public class UserCK {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name, phone, email;

    public void setOrder(OrderCK order) {
        this.order = order;
    }

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumns({
            @JoinColumn(name = "Order_Street", referencedColumnName = "street"),
            @JoinColumn(name = "Order_City", referencedColumnName = "city")
    })
    OrderCK order;

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
}
