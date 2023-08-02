/*
Crear una clase llamada CantanteFamoso. Esta clase guardará cantantes famosos y
tendrá como atributos el nombre y discoConMasVentas.
Se debe, además, en el main, crear una lista de tipo CantanteFamoso y agregar 5 objetos
de tipo CantanteFamoso a la lista. Luego, se debe mostrar los nombres de cada cantante
y su disco con más ventas por pantalla.
Una vez agregado los 5, en otro bucle, crear un menú que le de la opción al usuario de
agregar un cantante más, mostrar todos los cantantes, eliminar un cantante que el usuario
elija o de salir del programa. Al final se deberá mostrar la lista con todos los cambios
*/
package extra02collections;

import Services.SingerService;
import java.util.ArrayList;
import java.util.Scanner;

public class Extra02Collections {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean exit = false;
        int menuOption;
        String option;
        String name;
        String singerName;
        String bestSellingAlbum;

        SingerService ss = new SingerService();
        ArrayList<String> listOfSingersAsStrings = ss.getListOfSingersAsStrings();

        while (!exit) {
            System.out.println("1. Enter a singer and their best selling album.");
            System.out.println("2  View the list of singers.");
            System.out.println("3. Remove singer from the list.");
            System.out.println("4. Exit.");

            System.out.println("Enter the option you want to do.");
            menuOption = sc.nextInt();
            sc.nextLine();

            switch (menuOption) {
                case 1:
                    do {

                        System.out.println("Please enter the name of the singer.");
                        name = sc.nextLine();
                        System.out.println("Please enter the name of their best selling album.");
                        bestSellingAlbum = sc.nextLine();
                        System.out.println("");

                        ss.createAndAdd(name,bestSellingAlbum);

                        System.out.println("Would you like to enter another singer? Please answer with yes/no.");
                        option = sc.nextLine();

                        while (!option.equalsIgnoreCase("yes") && !option.equalsIgnoreCase("no")) {
                            System.out.println("Invalid response, please enter yes or no.");
                            option = sc.nextLine();
                        }

                    } while (option.equalsIgnoreCase("yes"));
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("List of singers.");
                    for (String singers : listOfSingersAsStrings) {
                        System.out.println(singers);
                    }
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("Enter the name of the singer you want to remove.");
                    singerName = sc.nextLine();
                    if (ss.searchSinger(singerName)) {
                        ss.removeSinger(singerName);
                        System.out.println("The singer was successfully removed.");
                    } else {
                        System.out.println("The entered singer is not part of the list.");
                    }
                    System.out.println("");
                    break;
                case 4:
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