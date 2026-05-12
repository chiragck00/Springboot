package com.springboot.learning.Entity_Table;

import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ManagementDetailsCK implements Serializable {
    String email, phone;

    public ManagementDetailsCK() {
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(!(obj instanceof ManagementDetailsCK)) return false;

        ManagementDetailsCK check = (ManagementDetailsCK) obj;
        return this.email.equals(check.email) && this.phone.equals(check.phone);
    }

    @Override
    public int hashCode(){
        return Objects.hash(email, phone);
    }
}
