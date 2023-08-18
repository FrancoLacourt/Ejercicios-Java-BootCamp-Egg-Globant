
package Entities;

public class WaterRevolver {
    
    private int currentPosition;
    private int waterPosition;

    public WaterRevolver() {
    }

    public WaterRevolver(int currentPosition, int waterPosition) {
        this.currentPosition = currentPosition;
        this.waterPosition = waterPosition;
    }

    public int getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(int currentPosition) {
        this.currentPosition = currentPosition;
    }

    public int getWaterPosition() {
        return waterPosition;
    }

    public void setWaterPosition(int waterPosition) {
        this.waterPosition = waterPosition;
    }

    @Override
    public String toString() {
        return "Current position of the cylinder: " + currentPosition + ". Current position of the water: " + waterPosition + ".";
    }   
}