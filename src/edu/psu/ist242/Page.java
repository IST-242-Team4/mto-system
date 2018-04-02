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
  public String pageName;
  public int permission;
 
  /*Accessor methods*/
  public int getPageID(){
    return pageID;
  }
  public String getPageName(){
    return pageName;
  }
  public int getPermission(){
    return permission;
  }
  
  /*Mutator Methods*/  
  public void setPageID(int pageID){
    this.pageID = pageID;
  }
  public void setPageName(String pageName){
    this.pageName = pageName;
  }
  public void setPermission(int permission){
    this.permission = permission;
  }
  
 }//close
