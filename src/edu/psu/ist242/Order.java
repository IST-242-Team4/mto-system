package edu.psu.ist242;

//not completed
public class Order{

  public int id;
  public String item;
  public String orderStatus;
  public float payment;

  public Order(int id, String item, String orderStatus, float payment){
    this.id = 0;
    this.item = "";
    this.orderStatus = "";
    this.payment = 0f;
  }


  public int getOrderID(){
    return id;
  }

  public void setOrderID(int id){
    this.id = id;
  }


  public String getOrderStatus(){
    return (orderStatus+id);
  }

  public void setOrderStatus(String order, int id){
    this.orderStatus = orderStatus;
    this.id = id;
  }
}

//These methods should be in main
/*
  Basket basket = new Basket(int basket_id, String date);
  public String createOrder(){
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
*/
