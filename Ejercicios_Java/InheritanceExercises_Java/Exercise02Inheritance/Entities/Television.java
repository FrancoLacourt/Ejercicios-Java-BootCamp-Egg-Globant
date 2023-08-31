
package Entities;

public class Television extends DomesticAppliance{
    
    protected int resolution;
    protected boolean DttTuner;

    public Television() {
    }

    public Television(int resolution, boolean DttTuner, Double price, String color, char energyConsumption, Double weight) {
        super(price, color, energyConsumption, weight);
        this.resolution = resolution;
        this.DttTuner = DttTuner;
    }

    public int getResolution() {
        return resolution;
    }

    public void setResolution(int resolution) {
        this.resolution = resolution;
    }

    public boolean isDttTuner() {
        return DttTuner;
    }

    public void setDttTuner(boolean DttTuner) {
        this.DttTuner = DttTuner;
    }
    
    
    @Override
    public Double finalPrice() {
        
        Double finalPrice = super.finalPrice();
        
        if (resolution > 40) {
            finalPrice += 300d;
        }
        
        if (DttTuner) {
            finalPrice += 500d;
        }
        
        return finalPrice;
    }   
}