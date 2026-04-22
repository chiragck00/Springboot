package com.springboot.learning.JPA.PlainJDBC;

import java.sql.*;

public class UserDAO {
    public void createTable(){
        try {
            Connection connection = new DBConnection().getConnection();
            String sql = "CREATE TABLE users(user_id INT AUTO_INCREMENT PRIMARY KEY, user_name VARCHAR(100), age INT)";
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);
        }catch (SQLException ex){

        } finally {

        }
    }

    public void insertIntoTable(String name, int age){
        try{
            Connection connection = new DBConnection().getConnection();
            String sql = "INSERT INTO users(user_name, age) VALUES (?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, name);
            preparedStatement.setInt(2, age);
            preparedStatement.executeUpdate();
        } catch (SQLException ex){

        }finally {

        }
    }

    public void getUsers(){
        try{
            Connection connection = new DBConnection().getConnection();
            String sql = "SELECT * FROM users";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet output = statement.executeQuery();
            while(output.next()){
                System.out.println(output.getInt("user_id") + " " + output.getString("user_name") + " " + output.getInt("age"));
            }
        } catch (SQLException ex){

        }finally {

        }
    }
}
