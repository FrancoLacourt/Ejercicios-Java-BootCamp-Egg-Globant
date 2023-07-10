package Service;

import Entity.StringPhrase;
import java.util.Scanner;

public class StringService {
    Scanner input = new Scanner(System.in);
    
    StringPhrase s1 = new StringPhrase();
    
    public StringPhrase createString() {
        
        String phrase;
        
        System.out.println("Ingrese una frase.");
        
        phrase = input.nextLine();
        s1.setPhrase(phrase);
        s1.setStringLength(phrase.length());
        
        return s1;
    }

    public void showVowels() {
        int vowelsCounter = 0;
        String phrase = s1.getPhrase();

        for (int i = 0; i < s1.getStringLength(); i++) {
            String vowel = phrase.substring(i, i + 1);

            if (vowel.equalsIgnoreCase("A") || vowel.equalsIgnoreCase("E") || vowel.equalsIgnoreCase("I") || vowel.equalsIgnoreCase("O") || vowel.equalsIgnoreCase("U")) {
                vowelsCounter++;
            }

        }
        System.out.println("En la frase ingresada hay " + vowelsCounter + " vocales.");
    }

    public void invertPhrase() {
        String phrase = s1.getPhrase().toLowerCase();

        System.out.println("La frase ingresada al revés queda de la siguiente manera");
        for (int i = s1.getStringLength() - 1; i >= 0; i--) {
            System.out.print(phrase.charAt(i));
        }
        System.out.println("");
    }

    public void timesRepeated() {
        String character;
        String phrase = s1.getPhrase();
        int characterCounter = 0;

        System.out.println("Ingrese el caracter que desea saber cuántas veces aparece en la frase.");
        character = input.nextLine();

        for (int i = 0; i < s1.getStringLength(); i++) {
            if (phrase.substring(i, i + 1).equalsIgnoreCase(character)) {
                characterCounter++;
            }
        }

        System.out.println("El caracter " + character + " se repite " + characterCounter + " veces.");
    }

    public void compareLengths() {
        String newPhrase;

        System.out.println("Ingrese otra frase para verificar si tiene la misma longitud que la frase original.");
        newPhrase = input.nextLine();

        if (newPhrase.length() == s1.getStringLength()) {
            System.out.println("La frase ingresada tiene la misma longitud que la frase original.");
        } else {
            System.out.println("La frase ingresada NO tiene la misma longitud que la frase original.");
        }
    }

    public void mixPhrases() {
        String newPhrase;
        String phrase = s1.getPhrase();

        System.out.println("Ingrese otra frase que desee unir a la frase original.");
        newPhrase = input.nextLine();

        System.out.println(phrase.concat(newPhrase));
    }

    public void replace() {
        String character;
        String phrase = s1.getPhrase().toLowerCase();

        System.out.println("Ingrese el caracter por el cual desea reemplazar todas las `a` ");
        character = input.nextLine();

        System.out.println(phrase.replace("a", character));
        //Antes tendría que haber hecho que una vez ingresado el texto, lo pase a minúsculas. Para no tener problemas por si es mayúscula o minúscula.
    }

    public boolean contains() {
        String phrase = s1.getPhrase();
        String letter;

        System.out.println("Ingrese la letra que desee verificar si se encuentra en la frase.");
        letter = input.nextLine();

        return phrase.contains(letter);
    }
}