/*
Project: Team4 Project
Purpose Details: ordering kiosk
Course: IST 242
Author: Charles McKee
Date Developed: 2-24-2018
Last Date Changed: 2-24-2018
 */
/**
*<h1>Account.java</h1>
*This Class sets up the Account information
*<p>
*@author Charles McKee
*/


package edu.psu.ist242;
import java.util.*;


public class Account {
    /** Declared Variables */
    private int id;
    private String billingAddress;
    private Boolean isClosed;
    private Date opened;
    private Date closed;
    
    /**Accessor Methods */
    public int getId() {
        return id;
    }
    public String getBillingAddress() {
        return billingAddress;
    }
    public Boolean getisClosed() {
        return isClosed;
    }
    public Date getClosed() {
        return closed;
    }
    public Date getOpened() {
        return opened;
    }
    /**mutator Methods*/
    public void setId(int id) {
        this.id = id;
    }
    public void setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress;
    }
    public void setisClosed(Boolean closed) {
        isClosed = closed;
    }
    public void setClosed(Date closed) {
        this.closed = closed;
    }
    public void setOpened(Date opened) {
        this.opened = opened;
    }
}
