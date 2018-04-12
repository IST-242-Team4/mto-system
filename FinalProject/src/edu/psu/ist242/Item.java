/*
Project Final Project
Purpose Details: Ordering kiosk???
Course: IST 242
Author: Charles McKee
Date Developed:
Last Date Changed:
 */
/**
 * <h1>Item Class</h1>
 * This is the parent class of menu.
 * <p>
 *     @author Charles McKee
 * </p>
 */
package edu.psu.ist242;

public class Item {
    /**Declaring Variables*/
    private String name;
    private float price;
    private int quantity;
    /**Accessor Methods*/
    public String getName() {
        return name;
    }
    public int getQuantity() {
        return quantity;
    }
    public float getPrice() {
        return price;
    }
    /**Mutator Methods*/
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(float price) {
        this.price = price;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}