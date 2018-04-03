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
 *This Class tests Employee
 *<p>
 *@author Charles McKee
 */

package edu.psu.ist242;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class TestMcKee {
    public static void main(String[] args) throws Exception{
        testEmployee();
        }
           public static void testEmployee(){
        Employee emp = new Employee();
        emp.setId(1);
        emp.setShipAddress("123 A St");
        emp.setPhone("000-000-0000");
        emp.setEmail("abc@gmail.com");
        emp.setTitle("Mr.");
        emp.setPermission(2);
        if(emp.getId()==1){
            if(emp.getShipAddress().equals("123 A St")) {
                if(emp.getPhone().equals("000-000-0000")) {
                    if(emp.getEmail().equals("abc@gmail.com")) {
                        if(emp.getTitle().equals("Mr.")) {
                            if(emp.getPermission()==2){
                                System.out.println("Test on Employee: Passed");
                            }
                            else { System.out.println("Test on get/set Permission: Failed"); }
                        }
                        else { System.out.println("Test on get/set Title: Failed"); }
                    }
                    else { System.out.println("Test on get/set Email: Failed"); }
                }
                else { System.out.println("Test on get/set Phone: Failed"); }
            }
            else { System.out.println("Test on get/set ShipAddress: Failed"); }
        }
        else { System.out.println("Test on get/set Id: Failed"); }
    }
    }
