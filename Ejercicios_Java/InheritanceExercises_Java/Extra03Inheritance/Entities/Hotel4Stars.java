package Entities;

public class Hotel4Stars extends Hotel {

    protected String gymCategory;
    protected String restaurantName;
    protected int restaurantCapacity;

    public Hotel4Stars() {
    }

    public Hotel4Stars(String gymCategory, String restaurantName, int restaurantCapacity, int roomsPerFloor, int bedsPerRoom, int numberOfFloors, Double roomPrice, String name, String address, String location, String manager) {
        super(roomsPerFloor, bedsPerRoom, numberOfFloors, roomPrice, name, address, location, manager);
        this.gymCategory = gymCategory;
        this.restaurantName = restaurantName;
        this.restaurantCapacity = restaurantCapacity;
    }

    public String getGymCategory() {
        return gymCategory;
    }

    public void setGymCategory(String gymCategory) {
        this.gymCategory = gymCategory;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public int getRestaurantCapacity() {
        return restaurantCapacity;
    }

    public void setRestaurantCapacity(int restaurantCapacity) {
        this.restaurantCapacity = restaurantCapacity;
    }

    @Override
    public Double finalPrice() {
        Double finalPrice = super.finalPrice();

        if (restaurantCapacity < 30) {
            finalPrice += 10;
        } else {
            if (restaurantCapacity >= 30 && restaurantCapacity <= 50) {
                finalPrice += 30;
            } else {
                finalPrice += 50;
            }
        }

        if (gymCategory.equalsIgnoreCase("A")) {
            finalPrice += 50;
        } else {
            finalPrice += 30;
        }

        return finalPrice;
    }

    @Override
    public String toString() {
        return "Hotel name: " + name + ". Address: " + address + ". Location: " + location + ". Manager: " + manager + "\n"
                + "Hotel category: 4 Stars. " + "Rooms per floor: " + roomsPerFloor + ". Beds per room: " + bedsPerRoom + ". Number of floors: " + numberOfFloors
                + ". Gym category: " + gymCategory + ". Name of the restaurant: " + restaurantName + ". Capacity of " + restaurantName + ": " + restaurantCapacity
                + ". Price per room: " + roomPrice + ".";
    }
}