/*
Project: Team4 Project
Purpose Details: ordering kiosk
Course: IST 242
Author: Ruijian Li
Date Developed: 2-27-2018
Last Date Changed: 
 */
 
 package edu.psu.ist242;
 
 
  public class Search {
 
  /* Declared Variables */
  public String customerInput;
  public String searching;
  public int permission;
 
  /*Accessor methods*/
  public String getCustomerInput(){
    return customerInput;
  }
  public String getSearching(){
    return searching;
  }
  public int getPermission(){
    return permission;
  }
  
  /*Mutator Methods*/  
  public void setCustomerInput(int customerInput){
    this.customerInput = customerInput;
  }
  public void setSearching(String searching){
    this.searching = searching;
  }
  public void setPermission(int permission){
    this.permission = permission;
  }
  
 }//close

  
