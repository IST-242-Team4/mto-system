package edu.psu.ist242;

/* 
  created by irainaL on 2/25/2018
*/

public class Basket{

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
