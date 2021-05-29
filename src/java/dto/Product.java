/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

/**
 *
 * @author Dang Minh Quan
 */
public class Product {
    private int id;
    private String name;
    private String thumbnailLink;
    private float originalSalePrice;
    private String details;
    private float salePrice;
    private boolean status;
    private int stock;
    private Category category ;

    public Product() {
    }

    public Product(int id, String name, String thumbnailLink, float originalSalePrice, String details, float salePrice, boolean status, int stock, Category category) {
        this.id = id;
        this.name = name;
        this.thumbnailLink = thumbnailLink;
        this.originalSalePrice = originalSalePrice;
        this.details = details;
        this.salePrice = salePrice;
        this.status = status;
        this.stock = stock;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getThumbnailLink() {
        return thumbnailLink;
    }

    public void setThumbnailLink(String thumbnailLink) {
        this.thumbnailLink = thumbnailLink;
    }

    public float getOriginalSalePrice() {
        return originalSalePrice;
    }

    public void setOriginalSalePrice(float originalSalePrice) {
        this.originalSalePrice = originalSalePrice;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public float getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(float salePrice) {
        this.salePrice = salePrice;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    

    
    
}
