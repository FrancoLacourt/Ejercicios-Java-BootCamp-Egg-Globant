
package Entities;

public class Building {
    
    protected Double width;
    protected Double height;
    protected Double length;
    protected Double area;
    protected Double volume;

    public Building() {
    }

    public Building(Double width, Double height, Double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public Building(Double width, Double height, Double length, Double area, Double volume) {
        this.width = width;
        this.height = height;
        this.length = length;
        this.area = area;
        this.volume = volume;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }    

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }   
}