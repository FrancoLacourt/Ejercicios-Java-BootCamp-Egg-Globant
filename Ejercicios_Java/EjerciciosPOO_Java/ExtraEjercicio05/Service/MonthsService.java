
package Service;

import Entity.Months;
import java.util.Scanner;

public class MonthsService {
    Months game = new Months();
    Scanner sc = new Scanner(System.in);
    
    public Months createGame() {
        String[] months = game.getMonths();
        game.setSecretMonth(months[(int)(Math.random()*10+1)]);
        
        return game;
    }
    
    public void playGame() {
        String guess;
        String secretMonth = game.getSecretMonth();
        System.out.println("Bienvenido al juego");
        System.out.println("Debe adivinar el mes secreto.");
        
        guess = sc.nextLine();
        
        while(!guess.equalsIgnoreCase(secretMonth)) {
            System.out.println("Incorrecto. Intente nuevamente.");
            guess = sc.nextLine();
        }
        
        System.out.println("FELICIDADES! Ha adivinado el mes secreto!");
    }
}