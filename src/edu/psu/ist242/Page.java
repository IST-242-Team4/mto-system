/*
Project: Team4 Project
Purpose Details: ordering kiosk
Course: IST 242
Author: Ruijian Li
Date Developed: 2-27-2018
Last Date Changed: 
 */
 
 package edu.psu.ist242;
 
 
  public class Page {
  
  /* Declared Variables */
  public int pageID;
  public String name;
  public int permission;
 
  /*Accessor methods*/
  public int getpageID(){
    return pageID;
  }
  public String getName(){
    return name;
  }
  public int getPermission(){
    return permission;
  }
  
  /*Mutator Methods*/  
  public void setPageID(int pageID){
    this.pageID = pageID;
  }
  public void setName(String name){
    this.name = name;
  }
  public void setPermission(int permission){
    this.permission = permission;
  }
  
 }//close
