/*
Project: MTO System
Purpose Details: Creating an order class
Course: IST 242
Author: Iraina Lambe
Date Developed: 2/25/2018
Last Date Changed:3/13/2018
Rev:
*/

/*
 *<h1>Order.java</h1>
 *This Class sets up the Order information
 *<p>
 *@author Iraina Lambe
 */

package edu.psu.ist242;

public class Order{

  /** Declared Variables */
  public int id;
  public String item;
  private String orderStatus;
  public float payment;

  /*constructer method*/
  public Order(int id, String item, String orderStatus, float payment){

  }

  /*accessor methods*/
  public int getOrderID(){
    return id;
  }
  public String getOrderStatus(){
    return (orderStatus);
  }



  /*mutator methods*/
  public void setOrderID(int id){
    this.id = id;
  }
  public void setOrderStatus(String order, int id){
    this.orderStatus = order;
    this.id = id;
  }
}

/*
  Basket basket = new Basket(int basket_id, String date);
  public String createOrder(){
    basket.createBasket();
  }

  public String viewOrder(){
    return basket.viewBasket();
  }

  public editOrder(){
    System.out.println("What would you like to do 'add' or 'delete'");
    String op = next.Line();
    switch(
    case "add":
      basket.addItem();
      break;
    case "delete":
    basket.deleteItem();
  }

  public cancelOrder(){
    basket.deleteItem();
    System.out.println("Your order has been canceled");
  }

  public addLineItem(String item){
    lineItem.setItem(item);
  }

  public String viewLineItem(id){
    return lineItem.getItem();
  }

  public editLineItem(id){
    lineItem.getItem();
  }

  public delLineItem(id){
    lineItem.getItem();
    lineItem.setItem();
  }

}//end of class
*/
