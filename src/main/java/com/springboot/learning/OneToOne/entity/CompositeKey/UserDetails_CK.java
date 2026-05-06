package com.springboot.learning.OneToOne.entity.CompositeKey;

import jakarta.persistence.*;

@Entity
@Table(name = "user_details_copy", schema = "entity_learning")
public class UserDetails_CK {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    String name, phone, email;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumns({
            @JoinColumn(name = "user_address_street", referencedColumnName = "street"),
            @JoinColumn(name = "user_address_city", referencedColumnName = "city")
    })
    UserAddress_CK userAddress;

    public UserDetails_CK(){

    }

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

    public UserAddress_CK getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(UserAddress_CK userAddress) {
        this.userAddress = userAddress;
    }
}
