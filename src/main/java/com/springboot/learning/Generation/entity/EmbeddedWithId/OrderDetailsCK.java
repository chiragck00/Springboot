package com.springboot.learning.Generation.entity.EmbeddedWithId;

import java.io.Serializable;
import java.util.Objects;

public class OrderDetailsCK implements Serializable{

    String phone, email;

    public OrderDetailsCK(){

    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(!(o instanceof OrderDetailsCK)) return false;

        OrderDetailsCK other = (OrderDetailsCK) o;
        return Objects.equals(phone, other.phone) &&
                Objects.equals(email, other.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phone, email);
    }
}
