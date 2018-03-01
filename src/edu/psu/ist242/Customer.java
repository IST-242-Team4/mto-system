/*
Project: Team4 Project
Purpose Details: ordering kiosk
Course: IST 242
Author: Charles McKee
Date Developed: 2-24-2018
Last Date Changed: 2-24-2018
 */


package edu.psu.IST242;
import java.util.*;

public class Customer {

    private int id;
    private String shipAddress; //IF THIS ISNT WORKING YOU DIDNT PUT JAVAMAIL API IN JAR FILES
    private String phone;
    private String email;
    private int permission;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getShipAddress() {
        return shipAddress;
    }

    public void setShipAddress(String shipAddress) {
        this.shipAddress = shipAddress;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPermission() {
        return permission;
    }

    public void setPermission(int permission) {
        this.permission = permission;
    }
}
