
package Entities;

import Entities.Interfaces.ShapeCalculations;

public class Circle extends Shape implements ShapeCalculations {

    private Double radio;
    private Double diameter;

    public Circle() {
    }

    public Circle(Double radio, Double diameter) {
        this.radio = radio;
        this.diameter = diameter;
    }

    public Circle(Double radio, Double diameter, Double area, Double perimeter, String type) {
        super(area, perimeter, type);
        this.radio = radio;
        this.diameter = diameter;
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    public Double getDiameter() {
        return diameter;
    }

    public void setDiameter(Double diameter) {
        this.diameter = diameter;
    }

    @Override
    public Double calculateArea() {
        return pi * Math.pow(radio, 2);
    }

    @Override
    public Double calculatePerimeter() {
        return pi * diameter;
    }

    @Override
    public String toString() {
        String formattedPerimeter = String.format("%.3f", perimeter);
        String formattedArea = String.format("%.3f", area);
        return "Circle. " + "Radio: " + radio + ". Diameter: " + diameter + ". Perimeter: " + formattedPerimeter + ". Area: " + formattedArea;
    }
}