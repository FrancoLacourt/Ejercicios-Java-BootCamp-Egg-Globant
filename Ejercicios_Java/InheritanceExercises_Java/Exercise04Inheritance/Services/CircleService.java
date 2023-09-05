
package Services;

import Entities.Circle;

public class CircleService {
    
    public Circle createCircle(Double radio, Double diameter) {
        
        Circle c = new Circle(radio, diameter);
        
        Double area = c.calculateArea();
        Double perimeter = c.calculatePerimeter();
        
        String type = "Rectangle";
        
        c.setArea(area);
        c.setPerimeter(perimeter);
        c.setType(type);
        
        return c;
    }
}