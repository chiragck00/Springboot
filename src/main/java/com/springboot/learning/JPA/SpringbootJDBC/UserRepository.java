package com.springboot.learning.JPA.SpringbootJDBC;

import com.springboot.learning.JPA.PlainJDBC.DBConnection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.List;

@Repository
public class UserRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;
    public void createTable(){
        jdbcTemplate.execute("CREATE TABLE users(user_id INT AUTO_INCREMENT PRIMARY KEY, user_name VARCHAR(100), age INT)");
    }
    public void createUser(String user_name, int age){
        String insertQuery = "INSERT into users(user_name, age) VALUES(?, ?)";
        jdbcTemplate.update(insertQuery, user_name, age);
    }
    public List<User> fetchUsers(){
        String selectQuery = "SELECT * FROM users";
        return jdbcTemplate.query(selectQuery, (rs, row) ->{
            User user = new User();
            user.setUser_id(rs.getInt("user_id"));
            user.setUser_name(rs.getString("user_name"));
            user.setAge(rs.getInt("age"));
            return user;
        });
    }
    public List<String> fetchAllNames(){
        String selectQuery = "SELECT user_name FROM users";
        return jdbcTemplate.queryForList(selectQuery, String.class);
    }
    public int countOfUsers(){
        String countQuery = "SELECT COUNT(*) FROM users";
        return jdbcTemplate.queryForObject(countQuery, Integer.class);
    }
}
