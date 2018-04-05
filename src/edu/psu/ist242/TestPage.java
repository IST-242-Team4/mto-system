/*
Project: Team4 Project
Purpose Details: This Class tests Page classes
Course: IST 242
Author: Ruijian Li
Date Developed: 3-15-2018
Last Date Changed: 
 */
   

    
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
