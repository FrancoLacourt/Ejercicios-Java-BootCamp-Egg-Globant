
package Services.Enumerations;

public enum Department {
    
    MATHEMATICS("Mathematics"), HISTORY("History"), ENGINEERING("Engineering"), SOCIOLOGY("Sociology"), BIOLOGY("Biology"), PSICHOLOGY("Psychology"), BUSINESS("Business");
    
    private String value;

    private Department(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
    
}
