/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author Dang Minh Quan
 */
public class Order {
    private int orderId;
    private LocalDate orderDate;
    private Customer customer;
    private boolean status;
    private Sale sale;
    private List<OrderItem> items;

    public Order() {
    }

    public Order(int orderId, LocalDate orderDate, Customer customer, boolean status, Sale sale, List<OrderItem> items) {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.customer = customer;
        this.status = status;
        this.sale = sale;
        this.items = items;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Sale getSale() {
        return sale;
    }

    public void setSale(Sale sale) {
        this.sale = sale;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void setItems(List<OrderItem> items) {
        this.items = items;
    }
    
    
}
