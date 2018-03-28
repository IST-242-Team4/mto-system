/*
Project: MTO System
Purpose Details: creating a basket class
Course: IST 242
Author: Iraina Lambe
Date Developed: 2/25/2018
Last Date Changed:3/13/2018
Rev:
*/

/**
 *<h1>Basket.java</h1>
 *This Class sets up the Basket information
 *<p>
 *@author Iraina Lambe
 */

package edu.psu.ist242;

import java.util.ArrayList;

public class Basket extends Item{

  /** Declared Variables */
  private int basketID;
  private ArrayList<String> itemsInBasket;

  /** Constructer*/
  public Basket(){
    this.basketID = 0;
  }

  /** Accessor methods*/
  public int getBasketID(){
    return basketID;
  }

  public ArrayList<String> getItemsInBasket() {
    return itemsInBasket;
  }

  /** Mutator methods*/
  public void setBasketID(int basketID){
    this.basketID = basketID;
  }

  public void setOrderedItems(ArrayList<String> itemsInBasket) {
    this.itemsInBasket = itemsInBasket;
  }

  public void createBasket(){
    itemsInBasket =  new ArrayList<>(3);
    System.out.println("Your basket is ready to use!");
  }

  public String viewBasket(){
    for (String i:itemsInBasket) {
      System.out.println(i);
    }
      return null;
  }


}
