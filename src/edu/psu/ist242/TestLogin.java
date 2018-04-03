/*
Project: Team4 Project
Purpose Details: ordering kiosk
Course: IST 242
Author: Charles McKee
Date Developed: 3-27-2018
Last Date Changed: 3-27-2018
 */
/**
 *<h1> TestMcKee Class</h1>
 *This Class tests Login
 *<p>
 *@author Charles McKee
 */

package edu.psu.ist242;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class TestMcKee {
    public static void main(String[] args) throws Exception{
        testLogin();
        }
        
    public static void testLogin() {
        Login login = new Login();
        login.setLoginID("user");
        login.setPassword("password");
        login.setState("Authenticated");
        if(login.getLoginID().equals("user")) {
            if(login.getPassword().equals("password")) {
                if(login.getState().equals("Authenticated")) {
                    System.out.println("Test on Login: Passed");
                }
                else { System.out.println("Test on get/set State: Failed"); }
            }
            else { System.out.println("Test on get/set Password: Failed"); }
        }
        else { System.out.println("Test on get/set LoginID: Failed"); }
    }

}
