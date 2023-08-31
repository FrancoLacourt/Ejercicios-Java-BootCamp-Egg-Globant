
package Entities;

public class Television extends DomesticAppliance{
    
    protected int resolution;
    protected boolean dttTuner;

    public Television() {
    }

    public Television(int resolution, boolean DttTuner, Double price, String color, char energyConsumption, Double weight) {
        super(price, color, energyConsumption, weight);
        this.resolution = resolution;
        this.dttTuner = DttTuner;
    }

    public int getResolution() {
        return resolution;
    }

    public void setResolution(int resolution) {
        this.resolution = resolution;
    }

    public boolean isDttTuner() {
        return dttTuner;
    }

    public void setDttTuner(boolean DttTuner) {
        this.dttTuner = DttTuner;
    }
    
    
    @Override
    public Double finalPrice() {
        
        Double finalPrice = super.finalPrice();
        
        if (resolution > 40) {
            finalPrice += 300d;
        }
        
        if (dttTuner) {
            finalPrice += 500d;
        }
        
        return finalPrice;
    }

    @Override
    public String toString() {
        String answer = dttTuner ? "Yes. " : "No. ";
        return "TV Information. Color: " + color + ". Energy consumption: " + energyConsumption + ". Weight: "
                + weight + "kg. Resolution (Inches): " + resolution + ". DTT Tuner? " + answer + "Price: $" + price;
    }
}