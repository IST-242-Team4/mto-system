/*
Project Final Project
Purpose Details: Ordering kiosk???
Course: IST 242
Author: Charles McKee
Date Developed:
Last Date Changed:
 */
/**
 * <h1>Employee Class</h1>
 * This deals with all the basic information from the Employee.
 * <p>
 *     @author Charles McKee
 * </p>
 */
package edu.psu.ist242;

public class Employee {
    /**Declaring variables*/
    private String Empuser, Emppass, Empaddress, Empphone;
    private int empnumber;
    /**Accessor Methods*/
    public int getEmpnumber() {
        return empnumber;
    }
    public String getEmpaddress() {
        return Empaddress;
    }
    public String getEmppass() {
        return Emppass;
    }
    public String getEmpphone() {
        return Empphone;
    }
    public String getEmpuser() {
        return Empuser;
    }
    /**Mutator Methods*/
    public void setEmpnumber(int empnumber) {
        this.empnumber = empnumber;
    }
    public void setEmpaddress(String empaddress) {
        Empaddress = empaddress;
    }
    public void setEmppass(String emppass) {
        Emppass = emppass;
    }
    public void setEmpphone(String empphone) {
        Empphone = empphone;
    }
    public void setEmpuser(String empuser) {
        Empuser = empuser;
    }
}
