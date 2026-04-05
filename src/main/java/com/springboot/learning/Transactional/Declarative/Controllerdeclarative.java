package com.springboot.learning.Transactional.Declarative;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.sql.Connection;

@RestController
public class Controllerdeclarative {

    @Autowired
    private DataSource dataSource;

    @Transactional(transactionManager = "userManager", propagation = Propagation.REQUIRES_NEW, isolation = Isolation.READ_COMMITTED)
    @GetMapping("/test")
    public void update() throws Exception{
        Connection conn = dataSource.getConnection();
        System.out.println("AutoCommit: " + conn.getAutoCommit());
        conn.close();
    }
}
