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
    private String dbName = "SWP391_ShoppingProject_SE1501";
    private String username = "admin2";
    private String password = "minhquan";
    
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
    
    public static void main(String[] args) {
        DbConnect dbConnect = new DbConnect();
        Connection conn = dbConnect.makeConnection();
        System.out.println(conn);
    }
}
