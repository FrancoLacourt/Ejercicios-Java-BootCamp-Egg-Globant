
package Services;

import Entities.LuxuryYacht;
import Entities.MotorBoat;
import Entities.Sailboat;
import Entities.Ship;

public class ShipService {

    //I have all create-related methods on the same class, because they are similar and considering these methods are not really complex,
    //I can easily manage all of them from the same class.
    
    public Ship createShip(String registration, Double length, int yearOfProduction, String boatType) {
        
        Ship ship = new Ship(registration, length, yearOfProduction, boatType);
        return ship;
    }
    
    public Sailboat createSailboat(int mastNumber, String registration, Double length, int yearOfProduction, String type) {
        
        Sailboat sailboat = new Sailboat(mastNumber, registration, length, yearOfProduction, type);
        return sailboat;
    }
    
    public MotorBoat createMotorBoat(int enginePowerInHP, String registration, Double length, int yearOfProduction, String type) {
        
        MotorBoat motorBoat = new MotorBoat(enginePowerInHP, registration, length, yearOfProduction, type);
        return motorBoat;
    }
    
    public LuxuryYacht createYacht(int cabinNumber, int enginePowerInHP, String registration, Double length, int yearOfProduction, String type) {
        
        LuxuryYacht yacht = new LuxuryYacht(cabinNumber, enginePowerInHP, registration, length, yearOfProduction, type);
        return yacht;
    }   
}