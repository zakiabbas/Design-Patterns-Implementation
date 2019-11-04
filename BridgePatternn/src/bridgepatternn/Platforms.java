/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridgepatternn;

/**
 *
 * @author Administrator
 */
public interface Platforms {
    
    abstract public void plat();
    
}

class Windows implements Platforms { 
    @Override
    public void plat() 
    { 
        System.out.print("Windows"); 
    } 
} 


class Unix implements Platforms { 
    @Override
    public void plat() 
    { 
        
        System.out.println(" Unix."); 
    } 
}


class JVM implements Platforms { 
    @Override
    public void plat() 
    { 
        System.out.print(" And"); 
        System.out.println(" JVM."); 
    } 
}