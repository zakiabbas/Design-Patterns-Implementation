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
public abstract  class HouseTemplate {
    
    //Constructor//
    HouseTemplate()
    {
        
    }
    
    
    public void build_house()
    {
        build_foundations();
        build_pillars();
        build_walls();
        build_windows();
    }
    
    public abstract void build_windows();
    public abstract void build_walls();
    public abstract void build_foundations();
    public abstract void build_pillars();

    
    
    
    
    
    
    
    
    
    
    
    
}
