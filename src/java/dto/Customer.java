/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import java.time.LocalDate;

/**
 *
 * @author Dang Minh Quan
 */
public class Customer extends User {

    public Customer() {
        super();
        super.setRole(new Role());
    }

    public Customer(String email, String password, String avatarLink, String address, String fullName, String phoneNumber, String gender, LocalDate creationDate, String status) {
        super(email, password, avatarLink, address, fullName, phoneNumber, gender, creationDate, status);
        super.setRole(new Role());
    }
    
    
    
    
}
