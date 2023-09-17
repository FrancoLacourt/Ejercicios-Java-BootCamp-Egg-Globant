package Services;

import Entities.Camping;
import Entities.Hotel4Stars;
import Entities.Hotel5Stars;
import Entities.Residence;

public class AccomodationService {

    public Hotel4Stars create4StarsHotel(String gymCategory, String restaurantName, int restaurantCapacity, int numberOfRooms,
            int numberOfBeds, int numberOfFloors, String name, String address, String location, String manager) {
        Hotel4Stars h = new Hotel4Stars(gymCategory, restaurantName, restaurantCapacity, numberOfRooms, numberOfBeds, numberOfFloors, 0d, name, address, location, manager);

        h.setRoomPrice(h.finalPrice());

        return h;
    }

    public Hotel5Stars create5StarsHotel(int numberOfConferenceRooms, int numberOfSuites, int numberOfLimousines, String gymCategory, String restaurantName,
            int restaurantCapacity, int numberOfRooms, int numberOfBeds, int numberOfFloors, String name, String address, String location, String manager) {

        Hotel5Stars h = new Hotel5Stars(numberOfConferenceRooms, numberOfSuites, numberOfLimousines, gymCategory, restaurantName, restaurantCapacity, numberOfRooms,
                numberOfBeds, numberOfFloors, 0d, name, address, location, manager);

        h.setRoomPrice(h.finalPrice());

        return h;
    }

    public Camping createCamping(int maxNumberOfTents, int numberOfBathrooms, boolean hasRestaurant, boolean privacy, Double squareMeters, String name,
            String address, String location, String manager) {

        Camping c = new Camping(maxNumberOfTents, numberOfBathrooms, hasRestaurant, privacy, squareMeters, name, address, location, manager);

        return c;
    }

    public Residence createResidence(int numberOfBedrooms, boolean discountForUnions, boolean sportsField, boolean privacy, Double squareMeters, String name, String address,
            String location, String manager) {
        
        Residence r = new Residence(numberOfBedrooms, discountForUnions, sportsField, privacy, squareMeters, name, address, location, manager);
        
        return r;
    }
}