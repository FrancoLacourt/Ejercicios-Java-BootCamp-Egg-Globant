
package Entities;

public abstract class Shape {
    
    protected Double area;
    protected Double perimeter;
    protected String type;

    public Shape() {
    }

    public Shape(Double area, Double perimeter, String type) {
        this.area = area;
        this.perimeter = perimeter;
        this.type = type;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public Double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(Double perimeter) {
        this.perimeter = perimeter;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }   
}