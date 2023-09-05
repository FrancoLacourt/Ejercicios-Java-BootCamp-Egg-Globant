
package Services;

import Entities.Rectangle;

public class RectangleService {
    
    public Rectangle createRectangle(Double base, Double height) {
        
        Rectangle r = new Rectangle(base, height);
        
        Double area = r.calculateArea();
        Double perimeter = r.calculatePerimeter();
        
        String type = "rectangle";
        
        r.setArea(area);
        r.setPerimeter(perimeter);
        r.setType(type);
        
        return r;
    }
}