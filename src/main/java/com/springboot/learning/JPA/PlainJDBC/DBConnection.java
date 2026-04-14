package com.springboot.learning.JPA.PlainJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    public Connection getConnection(){
        try{
            Class.forName("org.h2.Driver");
            return DriverManager.getConnection("jdbc:h2:mem:userdb", "sa", "");
        }catch (ClassNotFoundException | SQLException ex){

        }
        return null;
    }
}
