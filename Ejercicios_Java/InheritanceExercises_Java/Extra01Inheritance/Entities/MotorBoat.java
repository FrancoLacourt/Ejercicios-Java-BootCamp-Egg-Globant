
package Entities;

public class MotorBoat extends Ship {
    
    private int enginePowerInHP;

    public MotorBoat() {
    }

    public MotorBoat(int enginePowerInHP, String registration, Double length, int yearOfProduction, String type) {
        super(registration, length, yearOfProduction, type);
        this.enginePowerInHP = enginePowerInHP;
    }

    public int getEnginePowerInHP() {
        return enginePowerInHP;
    }

    public void setEnginePowerInHP(int enginePowerInHP) {
        this.enginePowerInHP = enginePowerInHP;
    }

    @Override
    public String toString() {
        return "MotorBoat. Registration: " + registration + ". Length(m): " + length + ". Year of production: " + yearOfProduction + ". Engine Power in HP: " + enginePowerInHP + ".";
    }
}