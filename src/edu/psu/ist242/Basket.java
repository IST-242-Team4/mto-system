/*
Project: MTO System
Purpose Details: creating a basket class
Course: IST 242
Author: Iraina Lambe
Date Developed: 2/25/2018
Last Date Changed:3/13/2018
Rev:
*/

/*
 *<h1>Basket.java</h1>
 *This Class sets up the Basket information
 *<p>
 *@author Iraina Lambe
 */

package edu.psu.ist242;

public class Basket{

  /** Declared Variables */
  private int basketID;
  private String created;

  public Basket(int basketID, String created){
    this.basketID = 0;
    this.created = null;
  }

  public int getBasketID(){
    return basketID;
  }

  public void setBasketID(int basketID){
    this.basketID = basketID;
  }

  public String getCreated(){
    return created;
  }

  public void setCreated(String created){
    this.created = created;
  }

}
