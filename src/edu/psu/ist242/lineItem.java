package edu.psu.ist242;

/* 
  created by irainaL on 2/25/2018
*/

public class LineItem{

  public int id;
  public String item;
  public int qty;

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
  
  
