
package Entities;

public class Ship {
    
    protected String registration;
    protected Double length;
    protected int yearOfProduction;
    protected String type;

    public Ship() {
    }

    public Ship(String registration, Double length, int yearOfProduction, String type) {
        this.registration = registration;
        this.length = length;
        this.yearOfProduction = yearOfProduction;
        this.type = type;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return type + ". Registration: " + registration + ". Length(m): " + length + ". Year of production: " + yearOfProduction;
    }
}