
package Entities;

import Entities.Interfaces.ShapeCalculations;

public class Rectangle extends Shape implements ShapeCalculations {

    private Double base;
    private Double height;

    public Rectangle() {
    }

    public Rectangle(Double base, Double height) {
        this.base = base;
        this.height = height;
    }

    public Rectangle(Double base, Double height, Double area, Double perimeter, String type) {
        super(area, perimeter, type);
        this.base = base;
        this.height = height;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    @Override
    public Double calculateArea() {
        return base * height;
    }

    @Override
    public Double calculatePerimeter() {
        return (base + height) * 2;
    }

    @Override
    public String toString() {
        String formattedPerimeter = String.format("%.3f", perimeter);
        String formattedArea = String.format("%.3f", area);
        return "Rectangle. " + "Base: " + base + ". Height: " + height + ". Perimeter: " + formattedPerimeter + ". Area: " + formattedArea;
    }
}