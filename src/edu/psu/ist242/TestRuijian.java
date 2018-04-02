/*
Project: Team4 Project
Purpose Details: This Class tests Address, Page, Receipt and Search classes
Course: IST 242
Author: Ruijian Li
Date Developed: 2-27-2018
Last Date Changed: 
 */
   
   public static void testAddress() {
        Address addr = new Address();
        addr.setStreet("1019 Sigel St");
        addr.setCity("Philadelphia");
        addr.setState("PA");
        addr.setZip(19148);
    
        if(addr.getStreet().equals("1019 Sigel St")){
            if(addr.getCity().equals("Philadelphia")){
                if(addr.getState().equals("PA")){
                    if(addr.getZip() == 19148){
                       System.out.println("Test on Address: Passed");
                    }
                    else {System.out.println("Test on get/set Zip: Failed");}
                }
                else {System.out.println("Test on get/set State: Failed");}
            }
            else {System.out.println("Test on get/set City: Failed");}
        }
        else {System.out.println("Test on get/set Street: Failed");}
    }
    
    
    
    
   public static void testPage() {
        Page pg = new Page();
        pg.setPageID(1);
        pg.setPageName("Special Offer");
        pg.setPermission(1);

        if(pg.getPageID() == 1){
            if(pg.getPageName().equals("Special Offer")){
                if(pg.getPermission == 1){
                   System.out.println("Test on Page: Passed");
                }
                else {System.out.println("Test on get/set Permission: Failed");}
            }
            else {System.out.println("Test on get/set PageName: Failed");}
        }
        else {System.out.println("Test on get/set PageID: Failed");}
    }
    
    
    
    
    
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




   public static void testSearch() {
        Search ser = new Search();
        ser.setCustomerInput("Sausage");
        ser.setSearching("Match");
        ser.setPermission(1);

        if(ser.getCustomerInput().equals("Sausage")){
            if(ser.getSearching().equals("Match")){
                if(ser.getPermission == 1){
                   System.out.println("Test on Search: Passed");
                }
                else {System.out.println("Test on get/set Permission: Failed");}
            }
            else {System.out.println("Test on get/set Searching: Failed");}
        }
        else {System.out.println("Test on get/set CustomerInput: Failed");}
    }

