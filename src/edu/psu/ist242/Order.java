/*
Project: MTO System
Purpose Details: Creating an order class
Course: IST 242
Author: Iraina Lambe
Date Developed: 2/25/2018
Last Date Changed:3/13/2018
Rev:
*/

/**
 *<h1>Order.java</h1>
 *This Class sets up the Order information
 *<p>
 *@author Iraina Lambe
 */

package edu.psu.ist242;

public class Order extends Basket {

  /**Declared Variables */
  public int id;
  private String orderStatus;
  public String payment;

  /**constructer method*/
  public Order() {
    this.id = 0;
    this.orderStatus = "Not Started";
    this.payment = "Not Complete";

  }

  /** accessor methods */
  public int getOrderID() {
    return id;
  }

  public String getOrderStatus() {
    return orderStatus;
  }


  public String getPayment() {
    return payment;
  }

  /**mutator methods */
  public void setOrderID(int id) {
    this.id = id;
  }

  public void setOrderStatus(String order) {
    this.orderStatus = order;
    this.id = id;
  }

  public void setPayment(String payment) {
    this.payment = payment;
  }
}


