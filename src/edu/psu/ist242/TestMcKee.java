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
 *This Class tests Account, Employee, Customer, Login, and Payment classes
 *<p>
 *@author Charles McKee
 */

package edu.psu.ist242;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class TestMcKee {
    public static void main(String[] args) throws Exception{
        testaccount();
        testEmployee();
        testCustomer();
        testLogin();
        testPayment();
    }

    public static void testaccount() {
        SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd");
        Account test = new Account();
        test.setId(1);
        test.setBillingAddress("123 A ST");
        String open= "2018-01-01";
        String closed = "2018-01-02";
        try {
        Date opened=dt.parse(open);
        Date closing=dt.parse(closed);
            test.setOpened(opened);
            test.setClosed(closing);
            test.setisClosed(true);
            if (test.getId() == 1) {
                if (test.getBillingAddress().equals("123 A ST")) {
                    if (test.getOpened().compareTo(opened) == 0) {
                        if (test.getClosed().compareTo(closing)==0) {
                            if (test.getisClosed() == true) {
                                System.out.println("Test on Account.java: Passed");
                            } else {
                                System.out.println("Test on get/set isClosed: Failed");
                            }
                        } else {
                            System.out.println("Test on get/set Closed: Failed");
                        }
                    } else {
                        System.out.println("Test on get/set Opened: Failed");
                    }
                } else {
                    System.out.println("Test on get/set BillingAddress: Failed");
                }
            } else {
                System.out.println("Test on get/set Id: Failed");
            }
        } catch(ParseException e) { e.printStackTrace(); }
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

    public static void testPayment() {
        SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd");
        Payment pay = new Payment();
        pay.setId(1);
        pay.setTotal(10.00);
        pay.setDetails("Paided");
        String paid = "2018-01-03";
        try {
            Date paided = dt.parse(paid);
            pay.setPaid(paided);
            if(pay.getId()==1){
                if(pay.getPaid().compareTo(paided)==0) {
                    if(pay.getTotal()==10.00) {
                        if(pay.getDetails().equals("Paided")) {
                            System.out.println("Test on Payment: Passed");
                        }
                        else { System.out.println("Test on get/set Details: Failed"); }
                    }
                    else { System.out.println("Test on get/set Total: Failed"); }
                }
                else { System.out.println("Test on get/set Paided: Failed"); }
            }
            else { System.out.println("Test on get/set ID: Failed"); }
        } catch (ParseException e) { e.printStackTrace(); }
    }
}
