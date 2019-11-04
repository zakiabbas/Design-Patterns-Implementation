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
public  class GlassHouse extends HouseTemplate
{
    
    GlassHouse()
    {
        
    }

    @Override
    public void build_windows() {
      
        System.out.println("Glass windows has been created.\n");
        
    }

    @Override
    public void build_walls() {
        
        System.out.println("Glass Walls has been created.");
        
    }

    @Override
    public void build_foundations() {
        
        System.out.println("Glass foundations has been created.");
        
    }

    @Override
    public void build_pillars() {
        
        System.out.println("Glass pillars has been created.");
    
    }
    














}
