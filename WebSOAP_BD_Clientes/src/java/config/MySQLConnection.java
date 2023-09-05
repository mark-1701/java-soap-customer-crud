package config;

import java.sql.*;

public class MySQLConnection {
    java.sql.Connection con;
    String url="jdbc:mysql://localhost:3306/bd_clientes?useTimeZone=true&serverTimezone=UTC&autoReconnect=true&useSSL=false";
    String user="root";
    String pass="12345";
    public java.sql.Connection getConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection(url,user,pass);
        } catch (Exception e) {
            System.out.println("err: " + e);
        }      
        return con;   
    }
    public int suma(int num1, int num2) {
        return num1 + num2;
    }
}
