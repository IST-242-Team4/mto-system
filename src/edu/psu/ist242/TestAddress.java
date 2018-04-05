
/*
Project: Team4 Project
Purpose Details: This Class tests Address classes
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
    
