package com.springboot.learning.ConditionalOnProperty;

import jakarta.annotation.PostConstruct;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(prefix = "connection", value = "enabled", havingValue = "noSql", matchIfMissing = false)
public class NoSQLConnection {

    NoSQLConnection(){
        System.out.println("No Sql connection bean initialized");
    }

    @PostConstruct
    public void init(){
        System.out.println("No SQL connection: " + this.hashCode());
    }
}
