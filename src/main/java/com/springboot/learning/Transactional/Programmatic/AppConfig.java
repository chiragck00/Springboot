package com.springboot.learning.Transactional.Programmatic;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.support.TransactionTemplate;

import javax.sql.DataSource;

@Configuration
public class AppConfig {
    @Bean
    public DataSource dataSource(){
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setUrl("jdbc:h2:mem:testdb");
        ds.setDriverClassName("org.h2.Driver");
        ds.setUsername("sa");
        ds.setPassword("");
        return ds;
    }
    @Bean
    public PlatformTransactionManager userManager(DataSource ds){
        return new DataSourceTransactionManager(ds);
    }
    @Bean
    public TransactionTemplate transactionTemplate(PlatformTransactionManager manager){
        TransactionTemplate transactionTemplate = new TransactionTemplate(manager);
        transactionTemplate.setName("Transaction Name");
        transactionTemplate.setPropagationBehavior(TransactionDefinition.PROPAGATION_MANDATORY);
        return new TransactionTemplate(manager);
    }
}
