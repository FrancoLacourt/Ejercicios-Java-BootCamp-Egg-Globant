package Entities;

public class Residence extends NonHotelAccomodations {

    private int numberOfBedrooms;
    private boolean discountForUnions;
    private boolean sportsField;

    public Residence() {
    }

    public Residence(int numberOfBedrooms, boolean discountForUnions, boolean sportsField, boolean privacy, Double squareMeters, String name, String address, String location, String manager) {
        super(privacy, squareMeters, name, address, location, manager);
        this.numberOfBedrooms = numberOfBedrooms;
        this.discountForUnions = discountForUnions;
        this.sportsField = sportsField;
    }

    public int getNumberOfBedrooms() {
        return numberOfBedrooms;
    }

    public void setNumberOfBedrooms(int numberOfBedrooms) {
        this.numberOfBedrooms = numberOfBedrooms;
    }

    public boolean isDiscountForUnions() {
        return discountForUnions;
    }

    public void setDiscountForUnions(boolean discountForUnions) {
        this.discountForUnions = discountForUnions;
    }

    public boolean isSportsField() {
        return sportsField;
    }

    public void setSportsField(boolean sportsField) {
        this.sportsField = sportsField;
    }

    @Override
    public String toString() {
        String booleanPrivacy = privacy ? "Yes. " : "No. ";
        String booleanDiscountForUnions = discountForUnions ? "Yes. " : "No. ";
        String booleanSportsField = sportsField ? "Yes. " : "No. ";

        return "Residence name: " + name + ". Address: " + address + ". Location: " + location + ". Manager: " + manager + "\n"
                + "Privacy: " + booleanPrivacy + "Square meters: " + squareMeters + ". Number of bedrooms: " + numberOfBedrooms
                + ". Discount for unions: " + booleanDiscountForUnions + "Sports field: " + booleanSportsField + ".";
    }
}