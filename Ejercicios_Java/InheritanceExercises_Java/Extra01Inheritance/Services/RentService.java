
package Services;

import Entities.Rent;
import Entities.Ship;
import java.time.LocalDate;

public class RentService {
    
    public Rent createRent(String clientName, String clientId, LocalDate rentalDate, LocalDate returnDate, String mooringPosition, Ship ship) {
        Rent rent = new Rent(clientName, clientId, rentalDate, returnDate, mooringPosition, ship);
        return rent;
    }   
}