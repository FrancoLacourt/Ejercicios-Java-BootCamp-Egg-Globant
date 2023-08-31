
package Entities;

public class Washer extends DomesticAppliance{
    
    protected Double load;

    public Washer() {
    }

    public Washer(Double load, Double price, String color, char energyConsumption, Double weight) {
        super(price, color, energyConsumption, weight);
        this.load = load;
    }

    public Double getLoad() {
        return load;
    }

    public void setLoad(Double load) {
        this.load = load;
    }
    
    @Override
    public Double finalPrice() {
        
        Double finalPrice = super.finalPrice();
        
        if (load > 30) {
            finalPrice += 500d;
        }
        return finalPrice;
    }

    @Override
    public String toString() {
        return "Washer information. Color: " + color + ". Energy consumption: " + energyConsumption + ". Weight: "
                + weight + "kg. Load: " + load + "kg. Price: $" + price + ". ";
    }
}