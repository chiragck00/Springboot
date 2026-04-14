package com.springboot.learning.JPA.PlainJDBC;

import java.sql.*;

public class UserDAO {

    public void createUserTable(){
        try{
            Connection connection = new DBConnection().getConnection();
            Statement st = connection.createStatement();
            String sql = "CREATE TABLE users(user_id INT AUTO_INCREMENT PRIMARY KEY, user_name VARCHAR(100), age INT)";
            st.executeUpdate(sql);
        }catch(SQLException e){
        }finally{
        }
    }

    public void createUser(String user_name, int age){
        try{
            Connection connection = new DBConnection().getConnection();
            String sql = "INSERT INTO users(user_name, age) VALUES(?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(2, age);
            preparedStatement.setString(1, user_name);
            preparedStatement.executeUpdate();
        }catch(SQLException e){
        }finally{
        }
    }

    public void fetchAll(){
        try{
            Connection connection = new DBConnection().getConnection();
            String sql = "SELECT * FROM users";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet output = preparedStatement.executeQuery();
            while(output.next()){
                String userDetails = output.getInt("user_id") + " " + output.getString("user_name") + " " + output.getInt("age");
                System.out.println(userDetails);
            }
        }catch(SQLException e){
        }finally{
        }
    }
}
