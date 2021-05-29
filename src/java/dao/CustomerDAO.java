/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import utils.DbConnect;
import dto.Customer;
import java.time.LocalDate;

/**
 *
 * @author Dang Minh Quan
 */
public class CustomerDAO {
    private DbConnect dbConnect;
    private Connection conn;
    private PreparedStatement prSt;
    private ResultSet rs;
    private String sql;
    
    public CustomerDAO(){
        dbConnect = new DbConnect();
        conn = dbConnect.makeConnection();
        prSt = null;
        rs = null;
        sql = "";
    }
    
    public boolean createCustomer(Customer customer){
        try{
            sql = "INSERT INTO User VALUES (?,?,?,?)";
            prSt = conn.prepareStatement(sql);
            
            // Insert parameters into SQL statement
            
            return prSt.execute();
        }catch(Exception e){
            e.printStackTrace();
        }
        return false;
    }
    
    public Customer getCustomerByEmail(String email){
        try{
            sql = "SELECT * FROM User WHERE Email LIKE ?";
            prSt = conn.prepareStatement(sql);
            
            // Insert parameters into SQL Statement
            
            
            
            // Get customer data queried from database
            
            String password = "";
            String avatarLink = "";
            String address = "";
            String fullName = "";
            String phoneNumber = "";
            String gender = "";
            LocalDate creationDate = LocalDate.now();
            boolean status = true;
            
            return new Customer(email, password, avatarLink, address, fullName, phoneNumber, gender, creationDate, status);
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
    
    public boolean updateCustomer(String email, Customer customer){
        try{
          
            String sql = "UPDATE User SET ";
            prSt = conn.prepareStatement(sql);
            
            // Add Parameter to the SQL Statement
            
            prSt.executeUpdate();
            return true;
            
        }catch(Exception e){
            
        }
        return false;
    }
    
}
