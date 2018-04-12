/*
Project Final Project
Purpose Details: Ordering kiosk???
Course: IST 242
Author: Charles McKee
Date Developed:
Last Date Changed:
 */
/**
 * <h1>Menu class</h1>
 * This inherits from item.
 * <p>
 *     @author Charles McKee
 * </p>
 */

package edu.psu.ist242;
import java.util.*;

public class Menu {
    /** Declaring Variables*/
    private List<Item> items;
    /**Constructor Method*/
    public Menu(List<Item> items) {
        super();
        this.items = items;
    }
    /**Accessor Method*/
    public List<Item> getItems() {
        return items;
    }
    /** Mutator Method*/
    public void setItems(List<Item> items) {
        this.items = items;
    }
}