/*
Project Final Project
Purpose Details: Ordering kiosk???
Course: IST 242
Author: Charles McKee
Date Developed:
Last Date Changed:
 */
/**
 * <h1>Technician Class</h1>
 * This deals with all the basic information from the Technician.
 * <p>
 *     @author Charles McKee
 * </p>
 */
package edu.psu.ist242;

public class Technician {
    /**Declaring variables*/
    private String Techuser, Techpass;
    /**Accessor methods*/
    public String getTechpass() {
        return Techpass;
    }
    public String getTechuser() {
        return Techuser;
    }
    /**Mutator Methods*/
    public void setTechpass(String techpass) {
        Techpass = techpass;
    }
    public void setTechuser(String techuser) {
        Techuser = techuser;
    }
}
