/*
Project Final Project
Purpose Details: Ordering kiosk???
Course: IST 242
Author: Charles McKee
Date Developed:
Last Date Changed:
 */
/**
 * <h1>Customer Class</h1>
 * This deals with all the basic information from the Customer.
 * <p>
 *     @author Charles McKee
 * </p>
 */
package edu.psu.ist242;

public class Customer {
    /**Declaring variables*/
    private String custuser, custpass, custaddress, custphone;
    /**Accessor methods*/
    public String getCustaddress() {
        return custaddress;
    }
    public String getCustpass() {
        return custpass;
    }
    public String getCustphone() {
        return custphone;
    }
    public String getCustuser() {
        return custuser;
    }
    /**Mutator Methods*/
    public void setCustaddress(String custaddress) {
        this.custaddress = custaddress;
    }
    public void setCustpass(String custpass) {
        this.custpass = custpass;
    }
    public void setCustphone(String custphone) {
        this.custphone = custphone;
    }
    public void setCustuser(String custuser) {
        this.custuser = custuser;
    }
}
