/*
Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número entre 1
y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta clase debe
contener un método toString() que retorne el número de carta y el palo. La baraja estará
compuesta por un conjunto de cartas, 40 exactamente.
Las operaciones que podrá realizar la baraja son:
• barajar(): cambia de posición todas las cartas aleatoriamente.
• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
se haya llegado al final, se indica al usuario que no hay más cartas.
• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
debemos indicárselo al usuario.
• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
indicárselo al usuario
• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
luego se llama al método, este no mostrara esa primera carta.
 */
package exercise03classrelationship;

import Entity.Card;
import Entity.Deck;
import Service.CardService;
import Service.DeckService;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise03ClassRelationship {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean exit = false;
        int menuOption;
        String option;
        int count;
        
        CardService cs = new CardService();
        DeckService ds = new DeckService();
        
        cs.createAndAdd();
        ds.createDeck(cs);
        ArrayList<Card> deck = ds.getDeckList();
        ArrayList<String> discardPile = ds.getDiscardPile();

        while (!exit) {
            System.out.println("1. Shuffle deck.");
            System.out.println("2. Deal next card.");
            System.out.println("3. Show number of available cards.");
            System.out.println("4. Show available cards.");
            System.out.println("5. Deal cards.");
            System.out.println("6. Show discard pile.");
            System.out.println("7. Exit.");

            System.out.println("Enter the option you want to do.");
            menuOption = sc.nextInt();
            sc.nextLine();

            switch (menuOption) {
                case 1:
                    if (deck.size() == 0) {
                        System.out.println("There are no more cards left.");
                    } else {
                        ds.shuffleDeck();
                    System.out.println("The deck was successfully shuffled.");
                    }
                    System.out.println("");
                    break;

                case 2:
                    if (deck.size() == 0) {
                        System.out.println("There are no more cards left.");
                    } else {
                        if ((deck.size() - 1) == 0) {
                            System.out.println("Congratulations. You got the last card of the deck.");
                            System.out.println(deck.get(0).getCard());
                            ds.nextCard();

                        } else {
                            System.out.println(deck.get(0).getCard());
                            ds.nextCard();
                        }
                    }

                    System.out.println("");
                    break;
                case 3:
                    if (deck.size() == 0) {
                        System.out.println("There are no more cards left.");
                    } else {
                        System.out.println("This is the number of available cards.");
                        System.out.println(ds.availableCards());
                    }

                    System.out.println("");
                    break;
                case 4:
                    if (deck.size() == 0) {
                        System.out.println("There are no more cards left.");
                    } else {
                        System.out.println("These are the cards in the deck");
                        for (Card cards : deck) {
                            System.out.println(cards.getCard());
                        }
                    }

                    System.out.println("");
                    break;
                case 5:
                    System.out.println("How many cards you want to deal?");
                    count = sc.nextInt();
                    sc.nextLine();

                    if (ds.availableCards() - count < 0) {
                        System.out.println("There are not enough cards to deal.");
                    } else {
                        ds.dealCards(count);
                    }
                    System.out.println("");
                    break;
                case 6:
                    if (discardPile.size() == 0) {
                        System.out.println("There are no cards on the discard pile yet.");
                    } else {
                        for (String cards : discardPile) {
                            System.out.println(cards);
                        }
                    }
                    System.out.println("");
                    break;
                case 7:
                    System.out.println("Exiting the menu...");
                    exit = true;
                    break;
                default:
                    System.out.println("Error. You must choose a valid option.");
                    System.out.println("");
            }
        }
    }
}