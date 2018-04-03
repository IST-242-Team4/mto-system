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
 *This Class tests Payment 
 *<p>
 *@author Charles McKee
 */

package edu.psu.ist242;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class TestMcKee {
    public static void main(String[] args) throws Exception{
        testPayment();
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
