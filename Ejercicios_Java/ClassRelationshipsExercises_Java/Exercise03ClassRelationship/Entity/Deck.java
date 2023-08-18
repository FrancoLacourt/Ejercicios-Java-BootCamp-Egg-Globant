
package Entity;

import java.util.ArrayList;

public class Deck {
    
    private ArrayList<Card> deck = new ArrayList();

    public Deck() {
    }
    
    public Deck(ArrayList<Card> deck) {
        this.deck = deck;
    }

    public ArrayList<Card> getDeck() {
        return deck;
    }

    public void setDeck(ArrayList<Card> deck) {
        this.deck = deck;
    }
}