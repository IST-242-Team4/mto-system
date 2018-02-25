package edu.psu.ist242;

/* 
  created by irainaL on 2/25/2018
*/

public class lineItem{
  
  public int id;
  public String item;
  public int qty;
  
  public lineItem(int id, String item, int qty){
    this.id = null;
    this.item = "";
    this.qty = null;
  }
    
  public int getId(){
    return id;
  }
  
  public void setId(int id){
    this.id = id;
  }
  
  public int getItem(){
    return getItem;
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
  
  
