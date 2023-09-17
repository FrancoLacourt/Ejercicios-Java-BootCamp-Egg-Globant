
package Entities;

public class Camping extends NonHotelAccomodations{
    
    private int maxNumberOfTents;
    private int numberOfBathrooms;
    private boolean hasRestaurant;

    public Camping() {
    }

    public Camping(int maxNumberOfTents, int numberOfBathrooms, boolean hasRestaurant, boolean privacy, Double squareMeters, String name, String address, String location, String manager) {
        super(privacy, squareMeters, name, address, location, manager);
        this.maxNumberOfTents = maxNumberOfTents;
        this.numberOfBathrooms = numberOfBathrooms;
        this.hasRestaurant = hasRestaurant;
    }

    public int getMaxNumberOfTents() {
        return maxNumberOfTents;
    }

    public void setMaxNumberOfTents(int maxNumberOfTents) {
        this.maxNumberOfTents = maxNumberOfTents;
    }

    public int getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    public void setNumberOfBathrooms(int numberOfBathrooms) {
        this.numberOfBathrooms = numberOfBathrooms;
    }

    public boolean isHasRestaurant() {
        return hasRestaurant;
    }

    public void setHasRestaurant(boolean hasRestaurant) {
        this.hasRestaurant = hasRestaurant;
    }
    
    
    @Override
    public String toString() {
        String booleanPrivacy = privacy ? "Yes. " : "No. ";
        
        return "Camping name: " + name + ". Address: " + address + ". Location: " + location + ". Manager: " + manager + "\n"
                + "Privacy: " + booleanPrivacy + "Square meters: " + squareMeters + ". Maximum number of tents: " + maxNumberOfTents
                + ". Number of bathrooms: " + numberOfBathrooms + ". Restaurant: " + hasRestaurant + ".";
    }   
}