package Entities;

public class Hotel extends Accomodation {

    protected int roomsPerFloor;
    protected int bedsPerRoom;
    protected int numberOfFloors;
    protected Double roomPrice;

    public Hotel() {
    }

    public Hotel(int roomsPerFloor, int bedsPerRoom, int numberOfFloors, Double roomPrice, String name, String address, String location, String manager) {
        super(name, address, location, manager);
        this.roomsPerFloor = roomsPerFloor;
        this.bedsPerRoom = bedsPerRoom;
        this.numberOfFloors = numberOfFloors;
        this.roomPrice = roomPrice;
    }

    public int getNumberOfRooms() {
        return roomsPerFloor;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.roomsPerFloor = roomsPerFloor;
    }

    public int getNumberOfBeds() {
        return bedsPerRoom;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.bedsPerRoom = bedsPerRoom;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public Double getRoomPrice() {
        return roomPrice;
    }

    public void setRoomPrice(Double roomPrice) {
        this.roomPrice = roomPrice;
    }

    public int hotelCapacity() {
        return (bedsPerRoom * roomsPerFloor * numberOfFloors);
    }

    public Double finalPrice() {
        return (50d + (1 * hotelCapacity()));
    }
}