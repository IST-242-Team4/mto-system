/*
Project: MTO System
Purpose Details: Creating an test for basket
Course: IST 242
Author: Iraina Lambe
Date Developed: 3/25/2018
Last Date Changed:4/1/2018
Rev:
*/
package edu.psu.ist242;

import java.util.ArrayList;

public class TestBasket{

    public static void testBasket() {
        Basket basket = new Basket();
        ArrayList<String>  array = new ArrayList<>();
        array.add("Coke");
        array.add("Chicken Sandwich");
        basket.setBasketID(2);
        basket.setOrderedItems(array);
        if (basket.getBasketID()== 2) {
            if (basket.getItemsInBasket().equals(array)) {
                System.out.println("Test on Item: Passed");
            } else {
                System.out.println("Test on get/set Items in Basket: Failed");
            }
        } else {
            System.out.println("Test on get/set BasketId: Failed");
        }

        basket.createBasket();
        if (basket.getItemsInBasket().size() == 2){
            System.out.println("Test Passed: Basket was created");
        }
        else
            System.out.println("Test Failed: Basket was not created");

        basket.viewBasket();
        if(basket.getItemsInBasket().size() > 0){
            System.out.println("Test Passed: Basket has items to display.");
        }
        else
            System.out.println("Test Failed: Basket does not have any items and will not display anything.");

    }
}


