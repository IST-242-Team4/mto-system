package edu.psu.ist242;

/* 
  created by irainaL on 2/25/2018
*/
  
  import java.util.Arrays;
  public class Item{

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
  
  
