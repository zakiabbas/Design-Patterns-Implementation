/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templatepattern;

/**
 *
 * @author hp
 */
public class WoodenHouse extends HouseTemplate {
    
    
    WoodenHouse()
    {
        
    }

    @Override
    public void build_windows() {
        System.out.println("Wooden windows has been created.\n");
        
    }

    @Override
    public void build_walls() {
        
        System.out.println("Wooden walls has been created.");
        
    }

    @Override
    public void build_foundations() {
        
        System.out.println("Wooden foundations has been created.");
        
    }

    @Override
    public void build_pillars() {
        
        System.out.println("Wooden pillars has been created.");
    
    }
    
}
