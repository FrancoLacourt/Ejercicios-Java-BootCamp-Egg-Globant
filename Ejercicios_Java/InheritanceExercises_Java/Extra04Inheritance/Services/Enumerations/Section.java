
package Services.Enumerations;

public enum Section {
    
    FACILITIES("Facilities"), SECURITY("Security"), SERVICES("Services"), DINING("Dining"), ADVISING("Advising"), LIBRARY("Library"), IT("It");
    
    private String value;

    private Section(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
    
}
