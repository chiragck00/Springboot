package com.springboot.learning.ConditionalOnProperty;

import jakarta.annotation.PostConstruct;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(prefix = "connection", value = "enabled", havingValue = "sql", matchIfMissing = false)
public class SQLConnection {

    SQLConnection(){
        System.out.println("Sql connection bean initialized");
    }

    @PostConstruct
    public void init(){
        System.out.println("SQL connection: " + this.hashCode());
    }
}
