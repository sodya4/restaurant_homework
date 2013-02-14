/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;

/**
 *
 * @author scottodya
 */
public class FakeDatabase {
    
    
    
    static MenuItems[] menuItems = {
        new MenuItems ("Pasta", 11.95),
        new MenuItems ("Hamburger", 7.99),
        new MenuItems ("Pizza", 13.95),
        new MenuItems ("Mozzarella Sticks", 4.99),
        new MenuItems ("Quesadillas", 5.99),
        new MenuItems ("Beer", 3.99),
        new MenuItems ("Soda", 1.49),
        new MenuItems ("Wine", 5.99)
    };

    public MenuItems[] getMenuItems() {
        
        return menuItems;
    }
    
    
}
