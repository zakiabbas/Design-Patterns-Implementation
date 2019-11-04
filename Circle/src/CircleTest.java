

public class CircleTest {

    public static void main(String[] args) {
        Circle object= new Circle();
        System.out.println(object.getArea());
        System.out.println(object.getColor());
        Circle object1= new Circle(6.0);
        System.out.println(object1.getArea());
        System.out.println(object1.getColor());
        Circle object2= new Circle(10.0,"blue");
        System.out.println(object2.getArea());
        System.out.println(object2.getColor());        
    }
}

