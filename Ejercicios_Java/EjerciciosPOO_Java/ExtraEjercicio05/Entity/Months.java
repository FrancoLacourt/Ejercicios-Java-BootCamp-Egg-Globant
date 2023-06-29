
package Entity;


public class Months {
    
    private String months [] = {"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
    private String secretMonth;

    public Months() {
    }

    public Months(String secretMonth) {
        this.secretMonth = secretMonth;
    }

    public String[] getMonths() {
        return months;
    }

    public String getSecretMonth() {
        return secretMonth;
    }

    public void setMonths(String[] months) {
        this.months = months;
    }

    public void setSecretMonth(String secretMonth) {
        this.secretMonth = secretMonth;
    }
}