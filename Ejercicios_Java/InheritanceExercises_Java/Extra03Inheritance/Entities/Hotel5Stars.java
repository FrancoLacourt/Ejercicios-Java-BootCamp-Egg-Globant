package Entities;

public class Hotel5Stars extends Hotel4Stars {

    private int numberOfConferenceRooms;
    private int numberOfSuites;
    private int numberOfLimousines;

    public Hotel5Stars() {
    }

    public Hotel5Stars(int numberOfConferenceRooms, int numberOfSuites, int numberOfLimousines, String gymCategory, String restaurantName, int restaurantCapacity, int roomsPerFloor,
            int bedsPerRoom, int numberOfFloors, Double roomPrice, String name, String address, String location, String manager) {
        super(gymCategory, restaurantName, restaurantCapacity, roomsPerFloor, bedsPerRoom, numberOfFloors, roomPrice, name, address, location, manager);
        this.numberOfConferenceRooms = numberOfConferenceRooms;
        this.numberOfSuites = numberOfSuites;
        this.numberOfLimousines = numberOfLimousines;
    }

    public int getNumberOfConferenceRooms() {
        return numberOfConferenceRooms;
    }

    public void setNumberOfConferenceRooms(int numberOfConferenceRooms) {
        this.numberOfConferenceRooms = numberOfConferenceRooms;
    }

    public int getNumberOfSuites() {
        return numberOfSuites;
    }

    public void setNumberOfSuites(int numberOfSuites) {
        this.numberOfSuites = numberOfSuites;
    }

    public int getNumberOfLimousines() {
        return numberOfLimousines;
    }

    public void setNumberOfLimousines(int numberOfLimousines) {
        this.numberOfLimousines = numberOfLimousines;
    }

    @Override
    public Double finalPrice() {
        Double finalPrice = super.finalPrice();

        return finalPrice + (15 * numberOfLimousines);
    }

    @Override
    public String toString() {
        return "Hotel name: " + name + ". Address: " + address + ". Location: " + location + ". Manager: " + manager + "\n"
                + "Hotel category: 5 Stars. " + "Rooms per floor: " + roomsPerFloor + ". Beds per room: " + bedsPerRoom + ". Number of floors: " + numberOfFloors
                + ". Gym category: " + gymCategory + ". Name of the restaurant: " + restaurantName + ". Capacity of " + restaurantName + ": " + restaurantCapacity
                + ". Number of conference rooms: " + numberOfConferenceRooms + ". Number of suites: " + numberOfSuites + ". Number of limousines: " + numberOfLimousines
                + ". Price per room: " + roomPrice + ".";
    }

}