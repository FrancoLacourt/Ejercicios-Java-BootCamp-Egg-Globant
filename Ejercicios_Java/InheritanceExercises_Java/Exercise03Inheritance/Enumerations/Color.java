
package Services.Enumerations;

public enum Color {
    WHITE("White"), BLACK("Black"), RED("Red"), BLUE("Blue"), GREY("Grey");
    
    
    private String value;

    private Color(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }   
}