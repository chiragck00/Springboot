package com.springboot.learning.JPA.PlainJDBC;

import java.sql.*;

public class UserDAO {
    public void createTable(){
        try {
            Connection connection = new DBConnection().getConnection();
            String sql = "CREATE TABLE users(user_id INT AUTO_INCREMENT PRIMARY KEY, user_name VARCHAR(100), age INT)";
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);
        }catch(SQLException ex){

        } finally{

        }
    }
    public void createUser(String user_name, int age){
        try{
            Connection connection = new DBConnection().getConnection();
            String sql = "INSERT into users(user_name, age) VALUES(?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, user_name);
            preparedStatement.setInt(2, age);
            preparedStatement.executeUpdate();
        } catch (SQLException ex){

        } finally {

        }
    }
    public void fetchUsers(){
        try{
            Connection connection = new DBConnection().getConnection();
            String sql = "SELECT * FROM users";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet output = preparedStatement.executeQuery();
            while(output.next()){
                String data = output.getInt("user_id") + " " +
                        output.getString("user_name") + " " +
                        output.getInt("age");

                System.out.println(data);
            }
        }catch (SQLException ex){

        } finally {

        }
    }
}
