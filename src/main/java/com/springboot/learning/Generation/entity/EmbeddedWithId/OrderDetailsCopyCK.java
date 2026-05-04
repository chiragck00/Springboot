package com.springboot.learning.Generation.entity.EmbeddedWithId;

import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class OrderDetailsCopyCK implements Serializable{

    String phone, email;

    public OrderDetailsCopyCK(){

    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(!(o instanceof OrderDetailsCopyCK)) return false;

        OrderDetailsCopyCK other = (OrderDetailsCopyCK) o;
        return Objects.equals(phone, other.phone) &&
                Objects.equals(email, other.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phone, email);
    }
}
