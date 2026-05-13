package com.springboot.learning.associations.OneToOne.Unidirectional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    OrderRepo orderRepo;

    public Order saveOrder(Order order){
        return orderRepo.save(order);
    }

    public Order getOrder(Long id){
        return orderRepo.findById(id).get();
    }

    public Order updateOrder(Long id, Order order){
        return orderRepo.save(order);
    }

    public void deleteOrder(Long id){
        orderRepo.deleteById(id);
    }
}
