
package Entities;

import Services.Enumerations.EnergyConsumption;

public class DomesticAppliance {
    
    EnergyConsumption[] energyConsumptions = EnergyConsumption.values();
    
    protected Double price;
    protected String color;
    protected char energyConsumption;
    protected Double weight;

    public DomesticAppliance() {
    }

    public DomesticAppliance(Double price, String color, char energyConsumption, Double weight) {
        this.price = price;
        this.color = color;
        this.energyConsumption = energyConsumption;
        this.weight = weight;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getEnergyConsumption() {
        return energyConsumption;
    }

    public void setEnergyConsumption(char energyConsumption) {
        this.energyConsumption = energyConsumption;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }
    
    
    public Double finalPrice() {
        Double energyPrice = 0d;
        Double weightPrice;
        Double sum;
        
        for (int i = 0; i < 6; i++) {
            if (energyConsumption == energyConsumptions[i].name().charAt(0)) {
                energyPrice = energyConsumptions[i].getValue();
                break;
            }
        }

        if (weight >= 1 && weight <= 19) {
            weightPrice = 100d;
        } else {
            if (weight >= 20 && weight <= 49) {
                weightPrice = 500d;
            } else {
                if (weight >= 50 && weight <= 79) {
                    weightPrice = 800d;
                } else {
                    weightPrice = 1000d;
                }
            }
        }
        
        sum = 1000 + energyPrice + weightPrice;
        return sum;
    }   
}