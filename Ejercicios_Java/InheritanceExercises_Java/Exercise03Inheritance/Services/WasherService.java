
package Services;

import Entities.DomesticAppliance;
import Entities.Washer;

public class WasherService extends DomesticApplianceService {
    
    public Washer createWasher(String color, char energyConsumption, Double weight, Double load) {
        
        DomesticAppliance da = super.createDomesticAppliance(color, energyConsumption, weight);
        
        Washer w = new Washer(load, da.getPrice(), da.getColor(), da.getEnergyConsumption(), weight);
        
        w.setPrice(w.finalPrice());
        
        return w;
    }
}