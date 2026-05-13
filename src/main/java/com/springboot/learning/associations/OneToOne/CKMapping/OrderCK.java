package com.springboot.learning.associations.OneToOne.CKMapping;

import jakarta.persistence.*;

@Entity
@Table(name = "ORDER_CK_DETAILS")
public class OrderCK {
    @EmbeddedId
    OrderDetailsCK orderDetailsCK;

    String state, zipCode;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public OrderDetailsCK getOrderDetailsCK() {
        return orderDetailsCK;
    }

    public void setOrderDetailsCK(OrderDetailsCK orderDetailsCK) {
        this.orderDetailsCK = orderDetailsCK;
    }
}
