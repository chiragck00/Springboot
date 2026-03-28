package com.springboot.learning.ConditionalOnProperty;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class DBConnection {
    @Autowired(required = false)
    NoSQLConnection noSQLConnection;

    @Autowired(required = false)
    SQLConnection sqlConnection;

    DBConnection(){
        System.out.println("DB connection bean initialized");
    }

    @PostConstruct
    public void init(){
        System.out.println("DB connection bean initialized");
        System.out.println("No SQL connection bean initialized: " + !Objects.isNull(noSQLConnection));
        System.out.println("SQL connection bean initialized: " + !Objects.isNull(sqlConnection));
    }
}
