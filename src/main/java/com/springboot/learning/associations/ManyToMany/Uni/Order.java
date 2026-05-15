package com.springboot.learning.associations.ManyToMany.Uni;

import jakarta.persistence.*;

@Entity
@Table(name = "Order_Details")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;

    String productName;


    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
