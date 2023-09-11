
package Services;

import Entities.OfficesBuilding;
import Entities.SportsCenter;

public class BuildingService {
    //I have all create-related methods on the same class, because they are similar and considering these methods are not really complex,
    //I can easily manage both of them from the same class.
    
    public SportsCenter createSportsCenter(Double width, Double height, Double length, String centerName, String installationType) {
        
        SportsCenter sCenter = new SportsCenter(centerName, installationType, width, height, length);
        
        Double area = sCenter.calculateArea();
        Double volume = sCenter.calculateVolume();
        
        sCenter.setArea(area);
        sCenter.setVolume(volume);
        
        return sCenter;
    }
    
    public OfficesBuilding createOfficesBuilding(int officeNumber, int peoplePerOffice, int floorNumber, Double width, Double height, Double length) {
        
        OfficesBuilding oBuilding = new OfficesBuilding(officeNumber, peoplePerOffice, floorNumber, width, height, length);
        
        Double area = oBuilding.calculateArea();
        Double volume = oBuilding.calculateVolume();
        
        oBuilding.setArea(area);
        oBuilding.setVolume(volume);
        
        return oBuilding;
    }   
}