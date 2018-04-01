/*
Project: MTO System
Purpose Details: Creating an test for item class
Course: IST 242
Author: Iraina Lambe
Date Developed: 3/25/2018
Last Date Changed:4/1/2018
Rev:
*/
package edu.psu.ist242;

public class TestLineItem {

    public class TestItem {
        public void testLineItem() {
            LineItem lineItem = new LineItem();
            lineItem.setId(413);
            lineItem.setItem("Sandwich");
            lineItem.setQty(2);
            if (lineItem.getId()== 413) {
                if (lineItem.getItem().equals("Sandwich")) {
                    if (lineItem.getQty() == 4) {
                        System.out.println("Test on Item: Passed");
                    } else {
                        System.out.println("Test on get/set Quantity: Failed");
                    }
                } else {
                        System.out.println("Test on get/set Item: Failed");
                }
            } else {
                    System.out.println("Test on get/set Id: Failed");
            }
        }
    }

}

