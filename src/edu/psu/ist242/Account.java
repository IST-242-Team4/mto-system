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
import java.lang.Object;
import javax.mail.Address; //MUST HAVE JAVAMAIL API IN JAR FILES

public class Account {

    private int id;
    private Address billingAddress; //IF THIS ISNT WORKING YOU DIDNT PUT JAVAMAIL API IN JAR FILES
    private Boolean isClosed;
    private Date opened;
    private Date closed;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Address getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }

    public Boolean getisClosed() {
        return isClosed;
    }
    public void setisClosed(Boolean closed) {
        isClosed = closed;
    }

    public Date getClosed() {
        return closed;
    }

    public void setClosed(Date closed) {
        this.closed = closed;
    }

    public Date getOpened() {
        return opened;
    }

    public void setOpened(Date opened) {
        this.opened = opened;
    }
}