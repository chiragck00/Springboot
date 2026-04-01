package com.springboot.learning.Transactional.Programmatic.Approach1;

import org.springframework.stereotype.Component;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;

@Component
public class firstWay {
    PlatformTransactionManager ptm;

    firstWay(PlatformTransactionManager ptm){
        this.ptm = ptm;
    }

    public void update(){
        TransactionStatus status = ptm.getTransaction(null);
        try{
            System.out.println("Logic");
            ptm.commit(status);
        }catch(Exception ex){
            ptm.rollback(status);
        }
    }
}
