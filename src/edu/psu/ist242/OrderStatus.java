/*
Project: Team4 Project
Purpose Details: ordering kiosk
Course: IST 242
Author: Ruijian Li
Date Developed: 2-27-2018
Last Date Changed: 
 */
 
 package edu.psu.IST242;
 
 public class OrderStatus {

    String [] orderStatus = new String []{"new", "paid", "cancelled", "inProcess", "completed", "shipped"};


    public void setStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public int getStatus() {
        return orderStatus;
    }
    
    
}//Close
