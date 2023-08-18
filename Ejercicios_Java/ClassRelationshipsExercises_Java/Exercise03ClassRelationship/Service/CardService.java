package Service;

import Entity.Card;
import exercise03classrelationship.Enumerations.Suits;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class CardService {

    Suits[] suits = Suits.values();
    Random random = new Random();
    ArrayList<Card> cards = new ArrayList();
    
    public void createAndAdd() {
        int number;
        for (int i = 0; i < suits.length; i++) {
            for (int j = 1; j < 13; j++) {

                if (j != 8 && j != 9) {
                    Suits suit = suits[i];
                    String card = String.valueOf(j) + " of " + suit.getValue();
                    cards.add(new Card(j, suit, card));
                }
            }
        }

    }

    public void addCardToTheList(Card card) {
        cards.add(card);
    }

    public ArrayList<Card> getCards() {
        return cards;
    }
}