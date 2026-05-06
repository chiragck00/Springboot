package com.springboot.learning.OneToOne.entity.SinglePK;

import com.fasterxml.jackson.annotation.*;
import jakarta.persistence.*;

@Entity
@Table(name = "user_details", schema = "entity_learning")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    String name, phone, email;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    @JsonIgnore
//    @JsonManagedReference
    @JoinColumn(name = "user_address_id", referencedColumnName = "user_address_id")
    UserAddress userAddress;

    public UserDetails(){

    }

    public UserDetailsDTO userDetailsDTO(){
        return new UserDetailsDTO(this);
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

    public UserAddress getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(UserAddress userAddress) {
        this.userAddress = userAddress;
    }
}
