/*
Project: Team4 Project
Purpose Details: ordering kiosk
Course: IST 242
Author: Ruijian Li
Date Developed: 2-27-2018
Last Date Changed: 
 */
 
 package edu.psu.IST242;
 
 
  public class Page {
  
  public int pageID;
  public String name;
  public int permission;
 
  
  public int getpageID(){
    return pageID;
  }
  
  public void setPageID(int pageID){
    this.pageID = pageID;
  }
  
  
  public String getName(){
    return name;
  }
  
  public void setName(String name){
    this.name = name;
  }
  
  
  public int getPermission(){
    return permission;
  }
  
  public void setPermission(int permission){
    this.permission = permission;
  }
  
 }//close
