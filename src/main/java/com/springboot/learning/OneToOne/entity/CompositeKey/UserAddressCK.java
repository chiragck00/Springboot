package com.springboot.learning.OneToOne.entity.CompositeKey;

import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class UserAddressCK implements Serializable {
    public String street, city;


    public UserAddressCK() {
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(street, city);
    }
    
    @Override 
    public boolean equals(Object ob){
        if(this == ob) return true;
        if(!(ob instanceof UserAddressCK)) return false;
        
        UserAddressCK test = (UserAddressCK) ob;
        return this.street.equals(test.street) && this.city.equals(test.city);
    }
}
