/*
Project: Team4 Project
Purpose Details: ordering kiosk
Course: IST 242
Author: Charles McKee
Date Developed: 2-24-2018
Last Date Changed: 2-24-2018
 */
/**
*<h1> Customer Class</h1>
*This Class sets customer information
*<p>
*@author Charles McKee
*/


package edu.psu.ist242;
import java.util.*;

public class Customer {

    /**Declared Variables*/
    private int id;
    private String shipAddress; 
    private String phone;
    private String email;
    private int permission;


    /**Accessor methods*/
    public int getId() {
        return id;
    }
    public String getShipAddress() {
        return shipAddress;
    }
    public String getEmail() {
        return email;
    }
    public String getPhone() {
        return phone;
    }
    public int getPermission() {
        return permission;
    }
    /**Mutator Methods*/
    public void setId(int id) {
        this.id = id;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public void setShipAddress(String shipAddress) {
        this.shipAddress = shipAddress;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPermission(int permission) {
        this.permission = permission;
    }
}
