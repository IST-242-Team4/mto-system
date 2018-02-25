package edu.psu.ist242;

/* 
  created by irainaL on 2/25/2018
*/

public class basket{
  
  public int basketID;
  public date created;
  
  public basket(int basketID, date created){
    this.basketID = null;
    this.created = null;
  }
    
  public int getBasketID(){
    return basketID;
  }
  
  public void setBasketID(int basketID){
    this.basketID = basketID;
  }
  
  public date getCreated(){
    return created;
  }
  
  public void setCreated(date created){
    this.created = created;
  }
