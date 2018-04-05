/*
Project: Team4 Project
Purpose Details: ordering kiosk
Course: IST 242
Author: Ruijian Li
Date Developed: 2-27-2018
Last Date Changed: 
 */

package edu.psu.ist242;
 
public class Receipt {

 /* Declared Variables */
public int orderID;
public int ePrintReceipt;
public int permission;


/*Accessor methods*/
public int getOrderID(){
return orderID;
}
public int getEPrintReceipt(){
return ePrintReceipt;
}
public int getPermission(){
return permission;
}
  
 
/*Mutator Methods*/
public void setOrderID(int orderID){
this.orderID = orderID;
}
public void setEPrintReceipt(int ePrintReceipt){
this.ePrintReceipt = ePrintReceipt;
}
public void setPermission(int permission){
this.permission = permission;
} 
 
 }//Close
