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
 *This Class tests Account
 *<p>
 *@author Charles McKee
 */

package edu.psu.ist242;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class TestAccount {
    public static void main(String[] args) throws Exception{
        testaccount();
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
    }
