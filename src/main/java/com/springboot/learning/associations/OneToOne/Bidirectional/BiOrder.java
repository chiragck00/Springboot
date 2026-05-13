package com.springboot.learning.associations.OneToOne.Bidirectional;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;

@Entity
@Table(name = "BI_ORDER_DETAILS")
@JsonIdentityInfo(property = "OrderId", generator = ObjectIdGenerators.PropertyGenerator.class)
public class BiOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long OrderId;

    String street, city, state, zipCode;

    public BiUser getUsertable() {
        return usertable;
    }

    public void setUsertable(BiUser usertable) {
        this.usertable = usertable;
    }

    @OneToOne(mappedBy = "order", fetch = FetchType.LAZY)
//    @JsonBackReference
    BiUser usertable;

    public Long getOrderId() {
        return OrderId;
    }

    public void setOrderId(Long orderId) {
        OrderId = orderId;
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

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}
