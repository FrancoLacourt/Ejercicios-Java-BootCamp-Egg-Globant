
package Entities;

public class LuxuryYacht extends Ship {
    
    private int cabinNumber;
    private int enginePowerInHP;

    public LuxuryYacht() {
    }

    public LuxuryYacht(int cabinNumber, int enginePowerInHP, String registration, Double length, int yearOfProduction, String type) {
        super(registration, length, yearOfProduction, type);
        this.cabinNumber = cabinNumber;
        this.enginePowerInHP = enginePowerInHP;
    }
    
    public int getCabinNumber() {
        return cabinNumber;
    }

    public void setCabinNumber(int cabinNumber) {
        this.cabinNumber = cabinNumber;
    }

    public int getEnginePowerInHP() {
        return enginePowerInHP;
    }

    public void setEnginePowerInHP(int enginePowerInHP) {
        this.enginePowerInHP = enginePowerInHP;
    }
    

    @Override
    public String toString() {
        return "LuxuryYacht. Registration: " + registration + ". Length(m): " + length + ". Year of production: " + yearOfProduction + ". Engine Power in HP: " +
        enginePowerInHP + ". Number of cabins: " + cabinNumber;
        
    }
}