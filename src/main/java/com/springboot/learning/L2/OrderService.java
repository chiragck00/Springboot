package com.springboot.learning.L2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private OrderRepo orderRepo;

    public void save(OrderEntity order){
        orderRepo.save(order);
    }

    public void update(OrderEntity order){
        orderRepo.save(order);
    }

    public OrderEntity get(Long id){
        return orderRepo.findById(id).orElse(null);
    }
}
