
package exercise03classrelationship.Enumerations;

public enum Suits {
    SWORDS("Sword"), CUPS("Cups"), GOLD("Gold"), CLUBS("Clubs");
    
    private String value;
    
    private Suits(String value) {
        this.value = value;
    }
    
    public String getValue() {
        return value;
    }   
}