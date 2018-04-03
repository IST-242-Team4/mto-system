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
 *This Class tests Customer
 *<p>
 *@author Charles McKee
 */

package edu.psu.ist242;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class TestMcKee {
    public static void main(String[] args) throws Exception{
        testCustomer();
        }
            public static void testCustomer() {
        Customer cust = new Customer();
        cust.setId(1);
        cust.setShipAddress("123 A St");
        cust.setPhone("111-111-1111");
        cust.setEmail("abc@gmail.com");
        cust.setPermission(1);
        if(cust.getId()==1) {
            if(cust.getShipAddress().equals("123 A St")) {
                if(cust.getPhone().equals("111-111-1111")) {
                    if(cust.getEmail().equals("abc@gmail.com")) {
                        if(cust.getPermission()==1){
                            System.out.println("Test on Customer: Passed");
                        }
                        else { System.out.println("Test on get/set Permission: Failed"); }
                    }
                    else { System.out.println("Test on get/set Email: Failed"); }
                }
                else { System.out.println("Test on get/set Phone: Failed"); }
            }
            else { System.out.println("Test on get/set ShipAddress: Failed"); }
        }
        else { System.out.println("Test on get/set ID: Failed"); }
    }
    }
