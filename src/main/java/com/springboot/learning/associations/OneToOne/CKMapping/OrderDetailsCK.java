package com.springboot.learning.associations.OneToOne.CKMapping;

import jakarta.persistence.Embeddable;

import java.util.Objects;

@Embeddable
public class OrderDetailsCK {
    String street, city;

    public OrderDetailsCK(){

    }

    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(!(obj instanceof OrderDetailsCK)) return false;

        OrderDetailsCK ck = (OrderDetailsCK) obj;
        return this.city.equals(ck.city) && this.street.equals(ck.street);
    }

    @Override
    public int hashCode(){
        return Objects.hash(street, city);
    }
}
