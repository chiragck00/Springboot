package com.springboot.learning.OneToOne.entity.SinglePK;

public class UserDetailsDTO {
    public Long id;
    public String name;
    public String phone;
    public String email;
    public String street, city, state;;

    public UserDetailsDTO(UserDetails userDetails) {
        this.id = userDetails.getId();
        this.name = userDetails.getName();
        this.phone = userDetails.getPhone();
        this.email = userDetails.getEmail();
        this.street = userDetails.getUserAddress().getStreet();
        this.city = userDetails.getUserAddress().getCity();
        this.state = userDetails.getUserAddress().getState();
    }
}
