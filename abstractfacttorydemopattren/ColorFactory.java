/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfacttorydemopattren;

/**
 *
 * @author sp16-bse-072
 */
public class ColorFactory extends AbstractFactory{	 
   //getColor method returns object of input type color
  
   Color getColor(String color) {   
      if(color == null){
         return null;
      }		
 
      if(color.equalsIgnoreCase("Red")){
         return new Red();
 
      }else if(color.equalsIgnoreCase("Green")){
         return new Green();
 
      }else if(color.equalsIgnoreCase("Blue")){
         return new Blue();
      }
 
      return null;
   }
 
  
   public Shape getShape(String shapeType){
      return null;
   }
}