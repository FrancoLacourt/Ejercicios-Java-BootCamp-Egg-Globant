package Service;

import Entity.Card;
import Entity.Deck;
import java.util.ArrayList;
import java.util.Collections;

public class DeckService {
    
    Deck d = new Deck();
    ArrayList<String> discardPile = new ArrayList();
    

    public void createDeck(CardService cs) {
        d.setDeck(cs.getCards());
    }

    public void shuffleDeck() {
        Collections.shuffle(d.getDeck());
    }

    public void nextCard() {
        String card = d.getDeck().get(0).getCard();
        discardPile.add(card);
        d.getDeck().remove(0);

    }

    public int availableCards() {
        return d.getDeck().size();
    }

    public void dealCards(int count) {
        for (int i = 0; i < count; i++) {
            String card = d.getDeck().get(0).getCard();
            discardPile.add(card);
            d.getDeck().remove(0);
        }
    }

    public ArrayList<Card> getDeckList() {
        return (d.getDeck());
    }

    public ArrayList<String> getDiscardPile() {
        return discardPile;
    }
}