
public class Circle {
    private double radius=1.0;
    private String color="red";
    Circle(){
        radius=2.0;
        color="green";
    }
    Circle(double r){
        this.radius=r;
    }
    Circle(double r,String c){
        this.radius=r;
        this.color="yellow";
    }    
    public double getRadius() {
        return radius;
    }
    public String getColor() {
        return color;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }
        public double getArea() {
            double area;
            area=3.14*radius*radius;
        return area;
    }
}
