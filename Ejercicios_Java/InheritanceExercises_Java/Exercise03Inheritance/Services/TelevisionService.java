
package Services;

import Entities.DomesticAppliance;
import Entities.Television;

public class TelevisionService extends DomesticApplianceService {
    
    public Television createTelevision(String color, char energyConsumption, Double weight, boolean dttTuner, int resolution) {
        
        DomesticAppliance da = super.createDomesticAppliance(color, energyConsumption, weight);
        
        Television t = new Television(resolution, dttTuner, da.getPrice(), da.getColor(), da.getEnergyConsumption(), weight);
        
        t.setPrice(t.finalPrice());
        
        return t;
    }
}