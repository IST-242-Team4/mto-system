/*
Project: Team4 Project
Purpose Details: ordering kiosk
Course: IST 242
Author: Ruijian Li
Date Developed: 2-27-2018
Last Date Changed: 
 */
 
 package edu.psu.IST242;

 
 public class LoginState {
 
 String [] loginState = new String []{"authenticated", "unauthenticated", "disabled"};


    public void setLoginState(String loginState) {
        this.loginState = loginState;
    }

    public int getLoginState() {
        return loginState;
    }
 
 }//close
