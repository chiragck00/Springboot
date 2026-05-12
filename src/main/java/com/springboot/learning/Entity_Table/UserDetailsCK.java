package com.springboot.learning.Entity_Table;

import java.io.Serializable;
import java.util.Objects;

public class UserDetailsCK implements Serializable {
    String email, phone;

    public UserDetailsCK() {
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(!(obj instanceof UserDetailsCK)) return false;

        UserDetailsCK check = (UserDetailsCK) obj;
        return this.email.equals(check.email) && this.phone.equals(check.phone);
    }

    @Override
    public int hashCode(){
        return Objects.hash(email, phone);
    }
}
