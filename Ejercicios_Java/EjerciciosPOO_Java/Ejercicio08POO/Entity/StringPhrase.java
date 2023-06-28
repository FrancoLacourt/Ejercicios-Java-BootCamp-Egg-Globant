
package Entity;


public class StringPhrase {
    
    private String phrase;
    private int stringLength;


    public StringPhrase() {
    }

    public StringPhrase(String phrase, int stringLength) {
        this.phrase = phrase;
        this.stringLength = stringLength;
    }

    public String getPhrase() {
        return phrase;
    }

    public int getStringLength() {
        return stringLength;
    }

    public void setPhrase(String phrase) {
        this.phrase = phrase;
    }

    public void setStringLength(int stringLength) {
        this.stringLength = stringLength;
    }
}