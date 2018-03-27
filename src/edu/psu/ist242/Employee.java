/*
Project: Team4 Project
Purpose Details: ordering kiosk
Course: IST 242
Author: Charles McKee
Date Developed: 2-24-2018
Last Date Changed: 2-24-2018
 */
/**
*<h1> Employee Class</h1>
*This Class sets Employee information
*<p>
*@author Charles McKee
*/


package edu.psu.ist242;
import java.util.*;

public class Employee {
    /**Declared Variables*/
    private int id;
    private String shipAddress;
    private String phone;
    private String email;
    private String title;
    private int permission;

    /**Accessor Methods*/
    public int getId() {
        return id;
    }
    public String getPhone() {
        return phone;
    }
    public String getShipAddress() {
        return shipAddress;
    }
    public String getEmail() {
        return email;
    }
    public String getTitle() {
        return title;
    }
    public int getPermission() {
        return permission;
    }
    /**Mutator Methods*/
    public void setId(int id) {
        this.id = id;
    }
    public void setShipAddress(String shipAddress) {
        this.shipAddress = shipAddress;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setPermission(int permission) {
        this.permission = permission;
    }
}
