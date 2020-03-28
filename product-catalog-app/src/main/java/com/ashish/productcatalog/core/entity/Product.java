package com.ashish.productcatalog.core.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * @author Ashish Kapoor
 */
@Entity
public class Product {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    
    @Column(name="NAME")
    private String name;
    
    @Column(name="DESCRIPTION")
    private String description;
    
    @Column(name="TYPE")
    private String type;
    
    @Column(name="BRAND")
    private String brand;
    
    @Column(name="COLOR")
    private String color;
    
    @Column(name="SIZE_NUMBER")
    private int size_number;
    
    @Column(name="SIZE")
    private String size;
    
    @Column(name="SELLER")
    private String seller;
    
    @Column(name="QTY")
    private int qty;
    
    @Column(name="PRICE")
    private double price;
    
    @Column(name="CREATED_DATE")
    private Date created_date;
    
    @Column(name="UPDATED_DATE")
    private Date updated_date;
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public String getType() {
        return type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    public String getBrand() {
        return brand;
    }
    
    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public int getSize_number() {
        return size_number;
    }
    
    public void setSize_number(int size_number) {
        this.size_number = size_number;
    }
    
    public String getSize() {
        return size;
    }
    
    public void setSize(String size) {
        this.size = size;
    }
    
    public String getSeller() {
        return seller;
    }
    
    public void setSeller(String seller) {
        this.seller = seller;
    }
    
    public int getQty() {
        return qty;
    }
    
    public void setQty(int qty) {
        this.qty = qty;
    }
    
    public double getPrice() {
        return price;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    
    public Date getCreated_date() {
        return created_date;
    }
    
    public void setCreated_date(Date created_date) {
        this.created_date = created_date;
    }
    
    public Date getUpdated_date() {
        return updated_date;
    }
    
    public void setUpdated_date(Date updated_date) {
        this.updated_date = updated_date;
    }
}
