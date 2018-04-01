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

public class TestItem{
    public static void testItem() {
        Item item = new Item();
        String[] array = {"Sandwiches", "Drinks"};
        item.setDescription("Grilled chicken with an Italian bread");
        item.setName("Chicken Sandwich");
        item.setPrice(4f);
        item.setGroups(array);
        if (item.getDescription().equals("Grilled chicken with an Italian bread")) {
            if (item.getName().equals("Chicken Sandwich")) {
                if (item.getPrice() == 4) {
                    if (item.getGroups() == array) {
                        System.out.println("Test on Item: Passed");
                    } else {
                        System.out.println("Test on get/set Groups: Failed");
                    }
                } else {
                    System.out.println("Test on get/set Price: Failed");
                }
            } else {
                System.out.println("Test on get/set Name: Failed");
            }
        } else {
            System.out.println("Test on get/set Description: Failed");
        }
    }
}


