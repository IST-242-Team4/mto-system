/*
Project: Team4 Project
Purpose Details: ordering kiosk
Course: IST 242
Author: Charles McKee
Date Developed: 2-24-2018
Last Date Changed: 2-24-2018
 */
/**
*<h1> Payment Class</h1>
*This Class sets Payment information
*<p>
*@author Charles McKee
*/

package edu.psu.ist242;
import java.util.*;

public class Payment {
    /**Declared Variables*/
    private int id;
    private Date paid;
    private double total;
    private String details;

    /**Accessor Methods*/
    public int getId() {
        return id;
    }
    public Date getPaid() {
        return paid;
    }
    public double getTotal() {
        return total;
    }
    public String getDetails() {
        return details;
    }
    /**Mutator Methods*/
    public void setId(int id) {
        this.id = id;
    }
    public void setPaid(Date paid) {
        this.paid = paid;
    }
    public void setTotal(double total) {
        this.total = total;
    }
    public void setDetails(String details) {
        this.details = details;
    }
}
