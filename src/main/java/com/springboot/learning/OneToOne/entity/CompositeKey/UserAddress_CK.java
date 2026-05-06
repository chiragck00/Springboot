package com.springboot.learning.OneToOne.entity.CompositeKey;

import jakarta.persistence.*;

@Entity
@Table(name = "user_address_copy", schema = "entity_learning")
public class UserAddress_CK {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    public Long user_address_id;

    public UserAddressCK getUserAddressCK() {
        return userAddressCK;
    }

    public void setUserAddressCK(UserAddressCK userAddressCK) {
        this.userAddressCK = userAddressCK;
    }

    @EmbeddedId UserAddressCK userAddressCK;
    String state;
    public UserAddress_CK(){

    }

//    public Long getUser_address_id() {
//        return user_address_id;
//    }
//
//    public void setUser_address_id(Long user_address_id) {
//        this.user_address_id = user_address_id;
//    }

//    public String getStreet() {
//        return street;
//    }
//
//    public void setStreet(String street) {
//        this.street = street;
//    }
//
//    public String getCity() {
//        return city;
//    }
//
//    public void setCity(String city) {
//        this.city = city;
//    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
