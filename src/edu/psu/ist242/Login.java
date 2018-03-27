/*
Project: Team4 Project
Purpose Details: ordering kiosk
Course: IST 242
Author: Charles McKee
Date Developed: 2-24-2018
Last Date Changed: 2-24-2018
 */
/**
*<h1> Login Class</h1>
*This Class sets Login information
*<p>
*@author Charles McKee
*/


package edu.psu.ist242;

public class Login {
    /**Declared variables*/
    private String loginID;
    private String password;
    private String state;

    /**Accessor methods*/
    public String getLoginID() {
        return loginID;
    }
    public String getPassword() {
        return password;
    }
    public String getState() {
        return state;
    }
    /**mutator methods*/
    public void setLoginID(String loginID) {
        this.loginID = loginID;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setState(String state) {
        this.state = state;
    }
}
