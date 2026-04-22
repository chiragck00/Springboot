package com.springboot.learning.JPA.SpringbootJDBC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.util.List;

@Repository
public class UserRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public void createTable(){
        String sql = "CREATE TABLE users(user_id INT AUTO_INCREMENT PRIMARY KEY, " + " user_name VARCHAR(100), age INT)";
        jdbcTemplate.execute(sql);
    }

    public void insertIntoTable(String user_name, int age){
        String sql = "INSERT INTO users(user_name, age) VALUES (?, ?)";
        jdbcTemplate.update(sql, user_name, age);
    }

    public void insert(String user_name, int age){
        String sql = "INSERT INTO users(user_name, age) VALUES (?, ?)";
        jdbcTemplate.update(sql, (PreparedStatement ps) ->{
            ps.setString(1, user_name);
            ps.setInt(2, age);
        });
    }

    public List<User> getAllUsers(){
        String sql = "SELECT * FROM users";
        return jdbcTemplate.query(sql, (rs, rowNum) ->{
            User user = new User();
            user.setUser_id(rs.getInt("user_id"));
            user.setUser_name(rs.getString("user_name"));
            user.setAge(rs.getInt("age"));
            return user;
        });
    }

    public List<String> getAllNames(){
        String sql = "SELECT user_name FROM users";
        return jdbcTemplate.queryForList(sql, String.class);
    }

    public int countUsers(){
        String sql = "SELECT COUNT(*) FROM users";
        return jdbcTemplate.queryForObject(sql, Integer.class);
    }


}
