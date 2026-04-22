package com.springboot.learning.JPA.SpringbootJDBC;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class Appconfig {

    @Bean
    public DataSource dataSource(){
        HikariDataSource hs = new HikariDataSource();
        hs.setMaximumPoolSize(10);
        hs.setMinimumIdle(5);
        hs.setPassword("");
        hs.setUsername("sa");
        hs.setJdbcUrl("jdbc:h2:mem:userDb");
        hs.setDriverClassName("org.h2.Driver");
        return hs;
    }

}
