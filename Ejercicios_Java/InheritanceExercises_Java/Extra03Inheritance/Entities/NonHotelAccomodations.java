
package Entities;

public class NonHotelAccomodations extends Accomodation{
    
    protected boolean privacy;
    protected Double squareMeters;

    public NonHotelAccomodations() {
    }

    public NonHotelAccomodations(boolean privacy, Double squareMeters, String name, String address, String location, String manager) {
        super(name, address, location, manager);
        this.privacy = privacy;
        this.squareMeters = squareMeters;
    }

    public boolean isPrivacy() {
        return privacy;
    }

    public void setPrivacy(boolean privacy) {
        this.privacy = privacy;
    }

    public Double getSquareMeters() {
        return squareMeters;
    }

    public void setSquareMeters(Double squareMeters) {
        this.squareMeters = squareMeters;
    }
}