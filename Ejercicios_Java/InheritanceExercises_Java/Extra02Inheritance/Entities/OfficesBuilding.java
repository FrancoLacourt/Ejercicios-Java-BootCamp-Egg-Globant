
package Entities;

import Entities.Interface.BuildingCalculations;

public class OfficesBuilding extends Building implements BuildingCalculations {
    
    private int officeNumber;
    private int peoplePerOffice;
    private int floorNumber;

    public OfficesBuilding() {
    }

    public OfficesBuilding(int officeNumber, int peoplePerOffice, int floorNumber, Double width, Double height, Double length) {
        super(width, height, length);
        this.officeNumber = officeNumber;
        this.peoplePerOffice = peoplePerOffice;
        this.floorNumber = floorNumber;
    }

    public OfficesBuilding(int officeNumber, int peoplePerOffice, int floorNumber, Double width, Double height, Double length, Double area, Double volume) {
        super(width, height, length, area, volume);
        this.officeNumber = officeNumber;
        this.peoplePerOffice = peoplePerOffice;
        this.floorNumber = floorNumber;
    }
    
    

    public int getOfficeNumber() {
        return officeNumber;
    }

    public void setOfficeNumber(int officeNumber) {
        this.officeNumber = officeNumber;
    }

    public int getPeoplePerOffice() {
        return peoplePerOffice;
    }

    public void setPeoplePerOffice(int peoplePerOffice) {
        this.peoplePerOffice = peoplePerOffice;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    @Override
    public Double calculateArea() {
        return length * width;
    }

    @Override
    public Double calculateVolume() {
        return length * width * height;
    }
    
    public int peoplePerFloor() {
        return peoplePerOffice * officeNumber;
    }
    
    public int peopleOnTheBuilding() {
        return floorNumber * peoplePerFloor();
    }

    @Override
    public String toString() {
        return "Offices Building." + " Offices per floor: " + officeNumber + ". People per office: " 
               + peoplePerOffice + ". Number of floors: " + floorNumber + ". Area: " + area + "m^2. Volume: "
               + volume + "m^3. People per floor: " + peoplePerFloor() + ". People on the entire building: " + peopleOnTheBuilding();
    }   
}