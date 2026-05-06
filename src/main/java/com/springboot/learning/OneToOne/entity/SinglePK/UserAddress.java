package com.springboot.learning.OneToOne.entity.SinglePK;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;

@Entity
@Table(name = "user_address", schema = "entity_learning")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "user_address_id")

public class UserAddress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long user_address_id;

    String street, city, state;

    @OneToOne(mappedBy = "userAddress", fetch = FetchType.EAGER)
//    @JsonBackReference
    public UserDetails userDetails;
    public UserAddress(){

    }

    public Long getUser_address_id() {
        return user_address_id;
    }

    public void setUser_address_id(Long user_address_id) {
        this.user_address_id = user_address_id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
