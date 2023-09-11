
package Entities;

public class Sailboat extends Ship{
    
    private int mastNumber;

    public Sailboat() {
    }

    public Sailboat(int mastNumber, String registration, Double length, int yearOfProduction, String type) {
        super(registration, length, yearOfProduction, type);
        this.mastNumber = mastNumber;
    }

    public int getMastNumber() {
        return mastNumber;
    }

    public void setMastNumber(int mastNumber) {
        this.mastNumber = mastNumber;
    }

    @Override
    public String toString() {
        return "Sailboat." + " Registration: " + registration + ". Length(m): " + length + ". Year of production: " + yearOfProduction + ". Number of masts: " + mastNumber + ".";
    }   
}