package com.university.management.system;
import java.sql.*;
public class Conn {
    //connection variable
    Connection c;
    //statement
    Statement s;
    Conn(){
        try{
            // 1 register
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 2 connection
            c=DriverManager.getConnection(
                    "jdbc:mysql:///universitymanagementsystem","root","#abdul786");
            // 3 statement
            s=c.createStatement();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
