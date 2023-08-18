/*
Realizar el juego de la ruleta rusa de agua en Java. Como muchos saben, el juego se trata de
un número de jugadores, que, con un revolver de agua, el cual posee una sola carga de agua,
se dispara y se moja. Las clases por hacer del juego son las siguientes:
Clase Revolver de agua: esta clase posee los siguientes atributos: posición actual (posición
del tambor que se dispara, puede que esté el agua o no) y posición agua (la posición del
tambor donde se encuentra el agua). Estas dos posiciones, se generarán aleatoriamente.
Métodos:
• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores
deben ser aleatorios.
• mojar(): devuelve true si la posición del agua coincide con la posición actual
• siguienteChorro(): cambia a la siguiente posición del tambor
• toString(): muestra información del revolver (posición actual y donde está el agua)
Clase Jugador: esta clase posee los siguientes atributos: id (representa el número del
jugador), nombre (Empezara con Jugador más su ID, “Jugador 1” por ejemplo) y mojado (indica
si está mojado o no el jugador). El número de jugadores será decidido por el usuario, pero
debe ser entre 1 y 6. Si no está en este rango, por defecto será 6.
Métodos:
• disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
devuelve true, sino false.
Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de Jugadores) y
Revolver
Métodos:
• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
y el revolver para guardarlos en los atributos del juego.

10
• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
mojar. Al final del juego, se debe mostrar que jugador se mojó.
Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
 */
package exercise02classrelationship;

import Entities.Player;
import Entities.WaterRevolver;
import Services.GameService;
import Services.PlayerService;
import Services.RevolverService;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise02ClassRelationship {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean exit = false;
        int menuOption;
        String option;
        int count;
        
        RevolverService rs = new RevolverService();
        PlayerService ps = new PlayerService();
        GameService gs = new GameService();

        WaterRevolver r = null;
        ArrayList<Player> players = ps.getListOfPlayers();

        while (!exit) {
            System.out.println("1. Add players.");
            System.out.println("2  Load revolver.");
            System.out.println("3. Show revolver information.");
            System.out.println("4. Start game.");
            System.out.println("5. Exit.");

            System.out.println("Enter the option you want to do.");
            menuOption = sc.nextInt();
            sc.nextLine();

            switch (menuOption) {
                case 1:
                    if (players.size() == 6) {
                        System.out.println("There are already 6 players. It is not possible to add new ones.");
                        System.out.println("");
                        break;
                    } else {
                        System.out.println("How many players do you want to add? You can add a maximum of 6 players");
                        count = sc.nextInt();

                        while (count < 1 || count > 6) {
                            System.out.println("Invalid number. Please enter a number between 1 and 6. Enter a new number.");
                            count = sc.nextInt();
                        }

                        while (players.size() + count > 6) {
                            System.out.println("It is not possible to add this many players because there are already " + players.size() + " players. Enter a new number.");
                            count = sc.nextInt();
                        }
                        sc.nextLine();

                        ps.createAndAdd(count);
                        System.out.println("");
                        break;
                    }

                case 2:
                    if (r == null) {
                        r = new WaterRevolver();
                        rs.loadRevolver(r);
                        System.out.println("Revolver loaded.");
                    } else {
                        System.out.println("The revolver is already loaded.");
                    }

                    System.out.println("");
                    break;
                case 3:
                    if (r == null) {
                        System.out.println("You need to load the revolver first.");
                    } else {
                        System.out.println(rs.revolverInfo(r));
                    }

                    System.out.println("");
                    break;
                case 4:
                    if (players.size() < 2 || r == null) {
                        System.out.println("Error. Please make sure there are at least two players and check if the weapon is loaded.");
                    } else {
                        gs.fillGame(r, ps);
                        
                        for (int i = 0; i < players.size() + 1; i++) {
                            if (i == players.size()) {
                                i = 0;
                            }
                            System.out.println(players.get(i).getName() + ". Press ENTER to shoot.");
                            sc.nextLine();
                            gs.startGame(i);
                            
                            if (players.get(i).isWet()) {
                                System.out.println("PUM!");
                                System.out.println("Sorry " + players.get(i).getName() + ". You got wet :(");
                                exit = true;
                                break;
                            } else {
                                System.out.println("Congratulations! You did not get wet.");
                                System.out.println("");
                            }
                        }
                    }

                    System.out.println("");
                    break;
                case 5:
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