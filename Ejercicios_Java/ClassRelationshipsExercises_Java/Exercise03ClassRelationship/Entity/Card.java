
package Entity;

import exercise03classrelationship.Enumerations.Suits;
import java.util.Objects;

public class Card {
    
    private int num;
    private Suits suit;
    private String card;

    public Card() {
    }

    public Card(int num, Suits suit, String card) {
        this.num = num;
        this.suit = suit;
        this.card = card;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Suits getSuit() {
        return suit;
    }

    public void setSuit(Suits suit) {
        this.suit = suit;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }   
}