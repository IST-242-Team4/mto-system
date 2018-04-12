/*
Project Final Project
Purpose Details: Ordering kiosk???
Course: IST 242
Author: Charles McKee
Date Developed:
Last Date Changed:
 */
/**
 * <h1>Order Class</h1>
 * This inherits from item. This also pull enum Status
 * <p>
 *     @author Charles McKee
 * </p>
 */
package edu.psu.ist242;
import java.util.*;

public class Order {
    /**Declaring variables*/
    private int orderId;
    private List<Item> items;
    private String cust;
    private Status status;


    /**Accessor Methods*/
    public String getCust() {
        return cust;
    }
    public Status getStatus() {
        return status;
    }
    public int getOrderId() {
        return orderId;
    }
    public List<Item> getItems() {
        return items;
    }
    /**Mutator Methods*/
    public void setCust(String cust) {
        this.cust = cust;
    }
    public void setStatus(Status status) {
        this.status = status;
    }
    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }
    public void setItems(List<Item> items) {
        this.items = items;
    }
}