package Service;

import Entity.Hangman;
import java.util.Arrays;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.List;

public class HangmanService {

    private List<String> letters = new LinkedList<>();

    Hangman game = new Hangman();
    Scanner sc = new Scanner(System.in);

    public Hangman createGame() {
        System.out.println("Ingrese cuál va a ser la palabra a adivinar.");
        String word = sc.nextLine();
        
        while (word.isEmpty()) {
            System.out.println("No ha ingresado ninguna palabra. Ingrese una palabra por favor.");
            word = sc.nextLine();
        }

        String[] secretWord = new String[word.length()];

        for (int i = 0; i < word.length(); i++) {
            secretWord[i] = word.substring(i, (i + 1));
        }
        game.setWord(secretWord);
        game.setSecretWord(word);

        System.out.println("Ingrese la cantidad de oportunidades máximas.");
        game.setTries(sc.nextInt());
        
        while (game.getTries() <= 0) {
            System.out.println("La cantidad de oportunidades máximas deben ser mayores a 0. Ingrese una nueva cantidad.");
            game.setTries(sc.nextInt());
        }
        
        sc.nextLine();
        game.setFoundLetter(0);

        return game;
    }

    public void length() {
        System.out.println("Longitud de la palabra: " + game.getWord().length);
    }

    public void search(String newLetter) {
        boolean letterFound = false;
        boolean repeatedLetter = false;

        for (String letter : letters) {
            if (newLetter.equalsIgnoreCase(letter)) {
                repeatedLetter = true;
            }
        }

        if (!repeatedLetter) {
            letters.add(newLetter);
            length();
            for (String word : game.getWord()) {
                if (word.equalsIgnoreCase(newLetter)) {
                    letterFound = true;
                }
            }

            if (letterFound) {
                System.out.println("La letra pertenece a la palabra.");
            } else {
                System.out.println("La letra NO pertenece a la palabra.");
            }
            
            found(newLetter);

        } else {
            System.out.println("La letra " + newLetter + " ya ha sido ingresada amteriormente y no la puede volver a ingresar.");
        }

    }

    public void found(String newLetter) {
        int counter = 0;
        boolean letterFound = false;

        for (String word : game.getWord()) {
            if (word.equalsIgnoreCase(newLetter)) {
                letterFound = true;
                counter++;
            }
        }

        if (letterFound) {
            game.setFoundLetter(game.getFoundLetter() + counter);

        } else {
            game.setTries(game.getTries()-1);
        }
        System.out.println("Número de letras (encontradas, faltantes): (" + game.getFoundLetter() + "," + ((game.getWord().length) - game.getFoundLetter()) + ")");
        System.out.println("Número de oportunidades restantes: " + game.getTries());
        System.out.println("-------------------------------------------------------------");
    }

    public void checkSecretWord() {
        System.out.println(Arrays.toString(game.getWord()));
    }
    
    public void game() {
        String letter;
        
        createGame();
        
        while (game.getTries() > 0 && game.getFoundLetter() != game.getWord().length) {
            System.out.println("Ingrese una letra:");
            letter = sc.nextLine();
            
            System.out.println(letter);
            search(letter);
            
            if (game.getFoundLetter() == game.getWord().length) {
                System.out.println("Felicidades! Ha descubierto todas las letras! La palabra era: " + game.getSecretWord().toUpperCase());
            }
            
            if (game.getTries() == 0) {
                System.out.println("Lo sentimos, ya no tiene más intentos :(");
            } 
        }
    }
}