/*
Project: Team4 Project
Purpose Details: This Class tests Search classes
Course: IST 242
Author: Ruijian Li
Date Developed: 3-15-2018
Last Date Changed: 
 */
   

  

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
