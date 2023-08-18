
package exercise01classrelationship.Enumerations;

public enum Breed {
    AUSTRALIAN_SHEPHERD("Australian Shepherd"), BEAGLE("Beagle"), DALMATIAN("Dalmatian"), SIBERIAN_HUSKY("Siberian Husky");
    
    private String value;

    private Breed(String value) {
        this.value = value;
    }
    
    public String getValue() {
        return value;
    }
}