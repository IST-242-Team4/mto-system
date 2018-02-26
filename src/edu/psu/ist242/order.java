package edu.psu.ist242;

/* 
  created by irainaL on 2/25/2018
*/

public class order{
  
  public int id;
  public items = lineItems();
  public orderStatus;
  public payment = payment();
  
  public order(int id){
    this.id = id;
  }
    
  public int getOrderID(id){
    return id;
  }
  
  public void setOrderID(int id){
    this.id = id;
  }
  
  public getOrderStatus(order, id){
    return order,id;
  }
  
  public void setOrderStatus(String order, int id){
    this.orderStatus = orderStatus;
    this.id = id;
  }
  
  public createOrder(){
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
