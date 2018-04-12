/*
Project Final Project
Purpose Details: Ordering kiosk???
Course: IST 242
Author: Charles McKee
Date Developed:
Last Date Changed:
 */
/**
 * <h1>Main Loop + methods</h1>
 * This is where everything happens
 * <p>
 *     @author Charles McKee
 * </p>
 */
package edu.psu.ist242;
import java.text.DecimalFormat;
import java.util.*;

public class Main {

    /** Creating a bunch of Arraylists for everything to use + some ints for counters*/
    private static ArrayList<Customer> customerList = new ArrayList<Customer> ();
    private static ArrayList<Employee> employeeList = new ArrayList<Employee>();
    private static ArrayList<Manager> managerList = new ArrayList<Manager>();
    private static ArrayList<Technician> techList = new ArrayList<Technician>();
    private static ArrayList<Order> orderlist = new ArrayList<Order>();
    private static List<Item> menuList = createMenu();
    private static int id = 3;
    private static int orderid = 1;
    private static int managerid = 3;

    public static void main(String[] args) {

        createbasicusers();
        Scanner scan = new Scanner(System.in);
        int choice = 0;
        while (choice != 5) {
            System.out.printf("Enter which view you would like to use:\n1. Customer\n2. Employee\n3. Manager\n4. Technical\n5. Exit\n");
            choice = scan.nextInt();
            switch (choice) {
                case 1: {
                    Customerview();
                    break;
                }
                case 2: {
                    Employeeview();
                    break;
                }
                case 3: {
                    Managerview();
                    break;
                }
                case 4: {
                    Technicalview();
                    break;
                }
                case 5: {
                    break;
                }
                default: {
                    break;
                }
            }
        }
    }

    /** Creating each 'Views' of the program */
    public static void Customerview() {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Enter option:\n1. Exisiting Customer\n2. New Customer\n");
        int newcust = scan.nextInt();
        if (newcust == 1) {
            System.out.println("Enter User ID: ");
            String user = scan.next();
            System.out.println("Enter Password:");
            String pass = scan.next();
            if (CustAuth(user, pass)) {
                int choice = 0;
                while (choice != 3) {
                    System.out.printf("Enter what option you would like to do:\n1. Create Order\n2. Cancel Order\n3. Exit\n");
                    choice = scan.nextInt();
                    switch (choice) {
                        case 1: {
                            CreateOrder(user);
                            break;
                        }
                        case 2: {
                            CancelOrder(user);
                            break;
                        }
                        case 3:
                        {
                            break;
                        }
                        default: {
                            break;
                        }
                    }
                }} else{
                    System.out.println("Invalid User ID/Password");
                }
        } else if (newcust == 2) {
            Customer cust = new Customer();
            System.out.println("Please Enter a User Name:");
            String user = scan.next();
            cust.setCustuser(user);
            System.out.println("Please Enter a Password:");
            String pass = scan.next();
            cust.setCustpass(pass);
            System.out.println("Please Enter your Address:");
            String address = scan.next();
            cust.setCustaddress(address);
            System.out.println("Please Enter your Phone number: ");
            String number = scan.next();
            cust.setCustphone(number);
            customerList.add(cust);
        } else {
            System.out.println("Invalid Choice");
        }
    }
    public static void Employeeview() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter User ID: ");
        String empuser = scan.next();
        System.out.println("Enter Password:");
        String emppass = scan.next();
        if (EmpAuth(empuser, emppass)) {
            int choice = 0;
            while(choice !=3) {
            System.out.printf("Enter what option you would like to do:\n1. View Order\n2. Mark order complete\n3. Exit");
            System.out.println();
            choice = scan.nextInt();
            switch (choice) {
                case 1: {
                    ViewOrder();
                    break;
                }
                case 2: {
                    CompleteOrder();
                    break;
                }
                default: {
                    break;
                }
            }
        }} else {
            System.out.println("Invalid User ID/Password");
        }
    }
    public static void Managerview() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter User ID: ");
        String mnguser = scan.next();
        System.out.println("Enter Password:");
        String mngpass = scan.next();
        if (ManagerAuth(mnguser, mngpass)) {
            int choice = 0;
            while (choice != 7) {
            System.out.println("Enter what option you would like to do:\n1. View Order\n2. Mark order complete\n3. Create new menu item\n4. Add New Employee\n5. Remove Employee\n6. View Current Employees\n7. Exit");
            choice = scan.nextInt();
            switch (choice) {
                case 1: {
                    ViewOrder();
                    break;
                }
                case 2: {
                    CompleteOrder();
                    break;
                }
                case 3: {
                    AddtoMenu();
                    break;
                }
                case 4: {
                    AddEmployee();
                    break;
                }
                case 5 : { RemoveEmployee(); break; }
                case 6 : { ViewEmployees(); break; }
                case 7: {break; }

                default: {
                    break;
                }
            }
        }} else {
            System.out.println("Invalid User ID/Password");
        }
    }
    public static void Technicalview() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter User ID: ");
        String adminuser = scan.next();
        System.out.println("Enter Password:");
        String adminpass = scan.next();
        if (TechAuth(adminuser, adminpass)) {
            int choice = 0;
            while(choice !=4){
            System.out.println("Enter what option you would like to do:\n1. Create Manager \n2. Remove Manager\n3. View Managers\n4. Exit");
            choice = scan.nextInt();
            switch (choice) {
                case 1: {
                    CreateManager();
                    break;
                }
                case 2: {
                    RemoveManager();
                    break;
                }
                case 3: {
                    ViewManagers();
                    break;
                }
                case 4: { break; }
                default: {
                    break;
                }
            }}
        }
    }

    /**creating the preset menu */
    private static List<Item> createMenu() {
        List<Item> menu = new ArrayList<Item>();
        Item item1 = new Item();
        item1.setName("Lamp");
        item1.setPrice(13.50f);
        menu.add(item1);
        Item item2 = new Item();
        item2.setName("Chair");
        item2.setPrice(16.00f);
        menu.add(item2);
        Item item3 = new Item();
        item3.setName("Table");
        item3.setPrice(16.50f);
        menu.add(item3);
        return menu;
    }
    public static void AddtoMenu() {
        Scanner scan = new Scanner(System.in);
        Item newItem = new Item();
        System.out.printf("\nEnter item name to add\n");
        String name = scan.next();
        System.out.println("Enter price of the item");
        float price = scan.nextFloat();
        newItem.setName(name);
        newItem.setPrice(price);
        menuList.add(newItem);
        System.out.println("Item added succesfully");
    }

    /** Creating preset users, This is for quick testing of program */
    public static void createbasicusers() {
        Customer cust = new Customer();
        cust.setCustuser("cust");
        cust.setCustpass("pass");
        cust.setCustaddress("123 Sample St.");
        cust.setCustphone("000-000-0000");
        customerList.add(cust);
        Employee emp = new Employee();
        emp.setEmpnumber(0);
        emp.setEmpuser("Emp");
        emp.setEmppass("pass");
        emp.setEmpaddress("123 Sample St.");
        emp.setEmpphone("000-000-0000");
        employeeList.add(emp);
        Employee emp2 = new Employee();
        emp2.setEmpnumber(1);
        emp2.setEmpuser("Emp2");
        emp2.setEmppass("pass");
        emp2.setEmpaddress("123 Sample St.");
        emp2.setEmpphone("000-000-0001");
        employeeList.add(emp2);
        Employee emp3 = new Employee();
        emp3.setEmpnumber(2);
        emp3.setEmpuser("Emp3");
        emp3.setEmppass("pass");
        emp3.setEmpaddress("123 Sample St.");
        emp3.setEmpphone("000-000-0002");
        employeeList.add(emp3);
        Manager manager = new Manager();
        manager.setManagerId(0);
        manager.setManageruser("Manager");
        manager.setManagerpass("pass");
        manager.setManageraddress("123 Sample St.");
        manager.setManagerphone("000-000-0000");
        managerList.add(manager);
        Manager manager2 = new Manager();
        manager2.setManagerId(1);
        manager2.setManageruser("Manager2");
        manager2.setManagerpass("pass");
        manager2.setManageraddress("123 Sample St.");
        manager2.setManagerphone("000-000-0001");
        managerList.add(manager2);
        Manager manager3 = new Manager();
        manager3.setManagerId(2);
        manager3.setManageruser("Manager");
        manager3.setManagerpass("pass");
        manager3.setManageraddress("123 Sample St.");
        manager3.setManagerphone("000-000-0002");
        managerList.add(manager3);
        Technician tech = new Technician();
        tech.setTechuser("Tech");
        tech.setTechpass("pass");
        techList.add(tech);
    }

    /** Creating methods called from views in the program */
    public static void CreateOrder(String user) {
        DecimalFormat df = new DecimalFormat("###.##");
        Scanner scan = new Scanner(System.in);
        Menu menu = new Menu(menuList);
        System.out.printf("\n Menu:\n");
        int itemnumber = 1;
        for (Item item : menuList) {
            System.out.println(itemnumber + ": item: " + item.getName() + " price: $" + df.format(item.getPrice()));
            itemnumber++;
        }
        float subprice =0.00f;
        String choosing = "y";
        ArrayList<Item> ordereditems = new ArrayList<Item>();
        Order order = new Order();
        order.setOrderId(orderid);
        orderid++;
        while(choosing.equals("y")) {
            System.out.println("Enter item number:");
            int additem = scan.nextInt();
            if (additem > menuList.size()) {
                System.out.println("Invalid Selection, Please try again:");
                additem = scan.nextInt();
            }
            else {
                Item ordereditem = menu.getItems().get(additem - 1);
                System.out.println("Enter how many " + ordereditem.getName() + " you would like.");
                int quanity = scan.nextInt();
                for (int i = 0; i < quanity; i++) {
                    ordereditems.add(ordereditem);
                    order.setItems(ordereditems);
                    subprice = subprice + ordereditem.getPrice();
                }
                System.out.println("Would you like to add another item?(y or n)");
                choosing = scan.next();
            }
        }
        order.setStatus(Status.open);
        order.setCust(user);
        orderlist.add(order);
        System.out.println("Your order:");
        for(Item item : ordereditems) {
            System.out.println(item.getName());
        }
        float totalprice = ((subprice*.06f)+subprice);
        System.out.println("Total price: $" + df.format(totalprice));
    }
    public static void CancelOrder(String cust) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter which Order you would like to Cancel: ");
        for(Order order: orderlist) {
            if(order.getCust().equals(cust)){
                System.out.print(order.getOrderId());
                for(Item items: order.getItems()) {
                    System.out.print(" "+ items.getName());
                }
            }
        }
        System.out.println();
        int orderclose = scan.nextInt();
        for(Order order: orderlist){
            if(order.getOrderId()==orderclose){
                order.setStatus(Status.cancelled);
                System.out.println("Order has been Cancelled");
            }
        }
    }
    public static void ViewOrder() {
        for(Order order: orderlist) {
            if(order.getStatus()== Status.open){
                System.out.print(order.getOrderId());
                for(Item items: order.getItems()) {
                    System.out.print(" "+ items.getName()+", ");
                }
                System.out.print("  Ordered by:" + order.getCust());
                System.out.println();
            }
        }
    }
    public static void CompleteOrder() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter which Order you would like to Close: ");
        int orderclose = scan.nextInt();
        for(Order order: orderlist){
            if(order.getOrderId()==orderclose){
                order.setStatus(Status.complete);
                System.out.println("Order has been marked Completed");
            }
        }
    }
    public static void AddEmployee() {
        Scanner scan = new Scanner(System.in);
        Employee emp = new Employee();
        System.out.println("Please Enter Employee's Name:");
        String user = scan.next();
        emp.setEmpuser(user);
        System.out.println("Please Enter a Password:");
        String pass = scan.next();
        emp.setEmppass(pass);
        System.out.println("Please Enter Employee's Address:");
        String address = scan.next();
        emp.setEmpaddress(address);
        System.out.println("Please Enter Employee's Phone number: ");
        String number = scan.next();
        emp.setEmpphone(number);
        emp.setEmpnumber(id);
        employeeList.add(emp);
        id++;
    }
    public static void RemoveEmployee() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Employee's ID you wish to remove:");
        int idremove = scan.nextInt();
        for(Employee emp: employeeList){
            if(emp.getEmpnumber()==idremove) {
                employeeList.remove(emp);
                System.out.println("Employee Removed");
            }
        }
    }
    public static void CreateManager() {
        Scanner scan = new Scanner(System.in);
        Manager manager = new Manager();
        System.out.println("Please Enter Manager's Name:");
        String user = scan.next();
        manager.setManageruser(user);
        System.out.println("Please Enter a Password:");
        String pass = scan.next();
        manager.setManagerpass(pass);
        System.out.println("Please Enter Manager's Address:");
        String address = scan.next();
        manager.setManageraddress(address);
        System.out.println("Please Enter Manager's Phone number: ");
        String number = scan.next();
        manager.setManagerphone(number);
        manager.setManagerId(managerid);
        managerList.add(manager);
        managerid++;
    }
    public static void RemoveManager() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Manager's ID you wish to remove:");
        int idremove = scan.nextInt();
        for(Manager manager: managerList){
            if(manager.getManagerId()==idremove) {
                managerList.remove(manager);
            }
        }
    }
    public static void ViewManagers() {
        System.out.println("ID# Name     Address         Phone#");
        for(Manager man: managerList) {
            System.out.println(man.getManagerId() +"   "+man.getManageruser()+"  "+ man.getManageraddress()+"   " + man.getManagerphone());
        }
    }
    public static void ViewEmployees() {
        System.out.println("ID# Name     Address         Phone#");
        for(Employee emp: employeeList) {
            System.out.println(emp.getEmpnumber() +"   "+ emp.getEmpuser()+"  "+ emp.getEmpaddress()+"   " + emp.getEmpphone());
        }
    }

    /** Creating login checks for each view */
    public static boolean CustAuth(String username, String password) {
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getCustuser().compareTo(username) == 0 && customerList.get(i).getCustpass().compareTo(password) == 0) {
                return true;
            }
        }
        return false;
    }
    public static boolean EmpAuth(String username, String password) {
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getEmpuser().compareTo(username) == 0 && employeeList.get(i).getEmppass().compareTo(password) == 0) {
                return true;
            }
        }
        return false;
    }
    public static boolean ManagerAuth(String username, String password) {
        for (int i = 0; i < managerList.size(); i++) {
            if (managerList.get(i).getManageruser().compareTo(username) == 0 && managerList.get(i).getManagerpass().compareTo(password) == 0) {
                return true;
            }
        }
        return false;
    }
    public static boolean TechAuth(String username, String password) {
        for (int i = 0; i < techList.size(); i++) {
            if (techList.get(i).getTechuser().compareTo(username) == 0 && techList.get(i).getTechpass().compareTo(password) == 0) {
                return true;
            }
        }
        return false;
    }


}

