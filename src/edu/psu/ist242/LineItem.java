/*
Project: MTO System
Purpose Details: Creating a LineItem class
Course: IST 242
Author: Iraina Lambe
Date Developed: 2/25/2018
Last Date Changed:3/13/2018
Rev:
*/

/*
 *<h1>LineItem.java</h1>
 *This Class sets up the LineItem information
 *<p>
 *@author Iraina Lambe
 */
package edu.psu.ist242;

public class LineItem{

  /** Declared Variables */
  public int id;
  public String item;
  private int qty;

  public LineItem(int id, String item, int qty){
    this.id = 0;
    this.item = "";
    this.qty = 0;
  }

  public int getId(){
    return id;
  }

  public void setId(int id){
    this.id = id;
  }

  public String getItem(){
    return item;
  }

  public void setItem(String item){
    this.item = item;
  }

   public int getQty(){
    return qty;
  }

  public void setQty(int qty){
    this.qty = qty;
  }

  
}
  
  
