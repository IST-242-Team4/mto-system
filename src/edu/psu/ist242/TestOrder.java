/*
Project: MTO System
Purpose Details: Creating an test for order
Course: IST 242
Author: Iraina Lambe
Date Developed: 3/25/2018
Last Date Changed:4/1/2018
Rev:
*/
package edu.psu.ist242;

public class TestOrder {
        public void testOrder() {
            Order ord = new Order();
            String[] array = {"Chicken Sandwich", "Coke"};
            ord.setOrderID(1);
            ord.setOrderStatus("In - Process");
            ord.setPayment("Complete");
            if (ord.getOrderID() == 1) {
                if (ord.getOrderStatus().equals("In-Process")) {
                    if (ord.getPayment() .equals("Complete")) {
                        System.out.println("Test on Item: Passed");
                    } else {
                        System.out.println("Test on get/set Payment: Failed");
                    }
                } else {
                    System.out.println("Test on get/set OrderStatus: Failed");
                }
            } else {
                System.out.println("Test on get/set OrderId: Failed");
            }
        }
    }



