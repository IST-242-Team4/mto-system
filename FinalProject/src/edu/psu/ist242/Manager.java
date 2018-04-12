/*
Project Final Project
Purpose Details: Ordering kiosk???
Course: IST 242
Author: Charles McKee
Date Developed:
Last Date Changed:
 */
/**
 * <h1>Manager Class</h1>
 * This deals with all the basic information from the Manager.
 * <p>
 *     @author Charles McKee
 * </p>
 */
package edu.psu.ist242;

public class Manager {
    /**Declaring variables*/
    private String Manageruser, Managerpass, Manageraddress, Managerphone;
    private int ManagerId;

    /**Accessor methods*/
    public int getManagerId() {
        return ManagerId;
    }
    public String getManageraddress() {
        return Manageraddress;
    }
    public String getManagerpass() {
        return Managerpass;
    }
    public String getManagerphone() {
        return Managerphone;
    }
    public String getManageruser() {
        return Manageruser;
    }
    /**Mutator Methods*/
    public void setManagerId(int managerId) {
        ManagerId = managerId;
    }
    public void setManageraddress(String manageraddress) {
        Manageraddress = manageraddress;
    }
    public void setManagerpass(String managerpass) {
        Managerpass = managerpass;
    }
    public void setManagerphone(String managerphone) {
        Managerphone = managerphone;
    }
    public void setManageruser(String manageruser) {
        Manageruser = manageruser;
    }
}

