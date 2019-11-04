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
public class Abstractfacttorydemopattren {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         AbstractFactory shapeFactory = FactoryGenerator.getFactory("Shape");
 
	      //Get Circle class object
	      Shape shape1 = shapeFactory.getShape("Circle");
 
	      //call drawShape method of Circle
	      shape1.drawShape();
 
	      //Get Rectangle class object
	      Shape shape2 = shapeFactory.getShape("Rectangle");
 
	      //call drawShape method of Rectangle
	      shape2.drawShape();
 
	      //Get Square class object
	      Shape shape3 = shapeFactory.getShape("Square");
 
	      //call drawShape method of Square
	      shape3.drawShape();
 
	      //get color factory
	      AbstractFactory colorFactory = FactoryGenerator.getFactory("Color");
 
	      //get an object of Color Red
	      Color color1 = colorFactory.getColor("Red");
 
	      //call fillColor method of Red
	      color1.fillColor();
 
	      //get an object of Color Green
	      Color color2 = colorFactory.getColor("Green");
 
	      //call fillColor method of Green
	      color2.fillColor();
 
	      //get an object of Color Blue
	      Color color3 = colorFactory.getColor("Blue");
 
	      //call fillColor method of Color Blue
	      color3.fillColor();
	}
    }
    

