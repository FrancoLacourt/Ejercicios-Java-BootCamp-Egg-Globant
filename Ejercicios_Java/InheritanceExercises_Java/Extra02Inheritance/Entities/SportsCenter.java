
package Entities;

import Entities.Interface.BuildingCalculations;

public class SportsCenter extends Building implements BuildingCalculations{
    
    private String centerName;
    private String installationType;

    public SportsCenter() {
    }

    public SportsCenter(String centerName, String installationType, Double width, Double height, Double length) {
        super(width, height, length);
        this.centerName = centerName;
        this.installationType = installationType;
    }

    public SportsCenter(String centerName, String installationType, Double width, Double height, Double length, Double area, Double volume) {
        super(width, height, length, area, volume);
        this.centerName = centerName;
        this.installationType = installationType;
    }
    

    public String getCenterName() {
        return centerName;
    }

    public void setCenterName(String centerName) {
        this.centerName = centerName;
    }

    public String getInstallationType() {
        return installationType;
    }

    public void setInstallationType(String installationType) {
        this.installationType = installationType;
    }

    @Override
    public Double calculateArea() {
        return length * width;
    }

    @Override
    public Double calculateVolume() {
        return length * width * height;
    }

    @Override
    public String toString() {
        return "Sports Center. " + "Center name: " + centerName + ". Installation type: " + installationType + ". Area: " + area + "m^2. Volume: " + volume + "m^3.";
    }   
}