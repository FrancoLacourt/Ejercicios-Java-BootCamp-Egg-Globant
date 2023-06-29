
package Entity;


public class Nif {
    
    private long id;
    private String letter;
    

    public Nif() {
    }

    public Nif(long id, String letter) {
        this.id = id;
        this.letter = letter;
    }

    public long getId() {
        return id;
    }

    public String getLetter() {
        return letter;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setLetter(String letter) {
        this.letter = letter;
    }
}