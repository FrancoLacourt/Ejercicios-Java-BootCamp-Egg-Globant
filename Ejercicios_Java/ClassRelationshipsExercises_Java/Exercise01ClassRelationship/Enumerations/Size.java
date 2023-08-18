
package exercise01classrelationship.Enumerations;

public enum Size {
    SMALL("Small"), MEDIUM("Medium"), BIG("Big");
    
    private String value;

    private Size(String value) {
        this.value = value;
    }
    
    public String getValue() {
        return value;
    }
}