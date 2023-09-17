
package Services.Enumerations;

public enum Course {
    
    PSYCHOLOGY("Psychology"), ECONOMICS("Economics"), CHEMISTRY("Chemistry"), LITERATURE("Literature"), COMPUTERSCIENCE("Computer Science"), RELATIONS("Relations"), ENVIRONMENTAL("Environmental");
    
    private String value;

    private Course(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
    
}
