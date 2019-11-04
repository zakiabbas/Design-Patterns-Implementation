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
public class ShapeFactory extends AbstractFactory{
 
   //getShape method returns object of input type shape
   
   public Shape getShape(String shapeType){
      if(shapeType == null){
         return null;
      }		
      if(shapeType.equalsIgnoreCase("Circle")){
         return (Shape) new Circle();
 
      } else if(shapeType.equalsIgnoreCase("Rectangle")){
         return new Rectangle();
 
      } else if(shapeType.equalsIgnoreCase("Square")){
         return new Square();
      }
 
      return null;
   }
 
   Color getColor(String color) {
      return null;
   }
}