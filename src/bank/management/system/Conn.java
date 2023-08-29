package bank.management.system;

import java.sql.*;

public class Conn {
    Connection connection;
    Statement statement;
    public Conn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/bankmanagementsystem";
            String username = "root";
            String password = "redhat";

            connection = DriverManager.getConnection(url,username,password);
            statement = connection.createStatement();
        } catch (Exception e){
            System.out.println(e);
        }
    }

}
