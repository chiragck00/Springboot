package com.springboot.learning.associations.OneToOne.Bidirectional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BiOrderService {

    @Autowired
    BiOrderRepo orderRepo;

    public BiOrder saveOrder(BiOrder order){
        return orderRepo.save(order);
    }

    public BiOrder getOrder(Long id){
        return orderRepo.findById(id).get();
    }

    public BiOrder updateOrder(Long id, BiOrder order){
        return orderRepo.save(order);
    }

    public void deleteOrder(Long id){
        orderRepo.deleteById(id);
    }
}
