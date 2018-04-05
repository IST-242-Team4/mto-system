/*
Project: Team4 Project
Purpose Details: This Class tests Receipt classes
Course: IST 242
Author: Ruijian Li
Date Developed: 3-15-2018
Last Date Changed: 
 */
   
   
    
   public static void testReceipt() {
        Receipt rece = new Receipt();
        rece.setOrderID(1);
        rece.setEPrintReceipt("Order Details");
        rece.setPermission(1);

        if(rece.getOrderID() == 1){
            if(rece.getEPrintReceipt().equals("Order Details")){
                if(rece.getPermission == 1){
                   System.out.println("Test on Page: Passed");
                }
                else {System.out.println("Test on get/set Permission: Failed");}
            }
            else {System.out.println("Test on get/set EPrintReceipt: Failed");}
        }
        else {System.out.println("Test on get/set OrderID: Failed");}
    }
