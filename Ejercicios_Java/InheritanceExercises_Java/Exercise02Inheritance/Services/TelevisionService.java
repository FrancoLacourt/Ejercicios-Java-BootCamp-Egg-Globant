
package Services;

import Entities.DomesticAppliance;
import Entities.Television;

public class TelevisionService extends DomesticApplianceService {
    
    public Television createTelevision(String color, char energyConsumption, Double weight, boolean DttTuner, int resolution) {
        
        DomesticAppliance da = super.createDomesticAppliance(color, energyConsumption, weight);
        
        Television t = new Television(resolution, DttTuner, da.getPrice(), color, energyConsumption, weight);
        
        t.setPrice(t.finalPrice());
        
        return t;
    }
}