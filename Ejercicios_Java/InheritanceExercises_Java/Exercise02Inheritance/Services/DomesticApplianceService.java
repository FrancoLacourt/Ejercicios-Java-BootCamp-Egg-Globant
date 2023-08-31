
package Services;

import Entities.DomesticAppliance;
import Services.Enumerations.Color;
import Services.Enumerations.EnergyConsumption;

public class DomesticApplianceService {
    
    EnergyConsumption[] energyConsumptions = EnergyConsumption.values();
    Color[] colors = Color.values();
    
    public DomesticAppliance createDomesticAppliance(String color, char energyConsumption, Double weight) {
        
        Double price = 1000d;
        
        if (!checkEnergyConsumption(energyConsumption)) {
            energyConsumption = 'F';
        }
        
        if (!checkColor(color)) {
            color = "White";
        }
        
        DomesticAppliance da = new DomesticAppliance(price, color, energyConsumption, weight);
        return da;
    }
    
    public boolean checkEnergyConsumption(char energyConsumption) {
        
        for (int i = 0; i < 6; i++) {
            if (energyConsumption == energyConsumptions[i].name().charAt(0)) {
                return true;
            }
        }
        return false;
    }
    
    public boolean checkColor(String color) {
        
        for (int i = 0; i < 5; i++) {
            if (color.equalsIgnoreCase(colors[i].getValue())) {
                return true;
            }
        }
        return false;
    }   
}