/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Dang Minh Quan
 */
public class DbConnect {
    private String dbName = "";
    private String username = "";
    private String password = "";
    
    public Connection makeConnection(){
        Connection connector ;
        try {
            // JDBC type 4 : native protocol
            // 
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            // Tạo đối tượng connector 
            String url = "jdbc:sqlserver://localhost:1433;databaseName = " + dbName;
            connector = DriverManager.getConnection(url,username,password);
            return connector;
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
