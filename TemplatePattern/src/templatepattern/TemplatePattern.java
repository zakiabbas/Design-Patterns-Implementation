package templatepattern;

public class TemplatePattern {
    
    public static void main(String[] args) {
        HouseTemplate object1 = new GlassHouse();
        HouseTemplate object2 = new WoodenHouse();
        
        
        object1.build_house();
        
        object2.build_house();
    }
    
}
