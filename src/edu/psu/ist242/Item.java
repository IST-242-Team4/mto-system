/*
Project: MTO System
Purpose Details: Creating an item class
Course: IST 242
Author: Iraina Lambe
Date Developed: 2/25/2018
Last Date Changed:3/13/2018
Rev:
*/

/*
 *<h1>Item.java</h1>
 *This Class sets up the Item information
 *<p>
 *@author Iraina Lambe
 */

package edu.psu.ist242;

  import java.util.Arrays;
  public class Item{

    /** Declared Variables */
  private String name;
  private float price;
  private String description;
  private String[] groups;

  public Item(String name, float price, String description, String[] groups){
    this.name = "";
    this.price = 0f;
    this.description = "";
    this.groups = Arrays.copyOf(groups, groups.length);
  }

  public String getName(){
    return name;
  }

  public void setName(String name){
    this.name = name;
  }

  public float getPrice(){
    return price;
  }

  public void setPrice(float price){
    this.price = price;
  }

  public String getDescription(){
    return description;
  }

  public void setDescription(String description){
    this.description = description;
  }

  public String[] getGroups(){
    return groups;
  }

  public void setGroups(String[] groups){
    this.groups = groups;
  }

}
  
  
