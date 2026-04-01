package com.springboot.learning.Transactional.Programmatic.Approach1;

import org.springframework.stereotype.Component;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

@Component
public class firstWay {
    PlatformTransactionManager ptm;

    firstWay(PlatformTransactionManager ptm){
        this.ptm = ptm;
    }

    public void update(){
        DefaultTransactionDefinition defaultTransactionDefinition = new DefaultTransactionDefinition();
        defaultTransactionDefinition.setName("Transaction Name");
        defaultTransactionDefinition.setPropagationBehavior(TransactionDefinition.PROPAGATION_MANDATORY);
        TransactionStatus status = ptm.getTransaction(defaultTransactionDefinition);
        try{
            System.out.println("Logic");
            ptm.commit(status);
        }catch(Exception ex){
            ptm.rollback(status);
        }
    }
}
