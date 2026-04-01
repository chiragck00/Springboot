package com.springboot.learning.Transactional.Programmatic.Approach2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

@Component
public class secondWay {
    @Autowired
    TransactionTemplate temp;

    public void update(){
        TransactionCallback<TransactionStatus> db = (TransactionStatus s) ->{
            System.out.println("Update Logic");
            return s;
        };
        TransactionStatus status = temp.execute(db);
    }
}
