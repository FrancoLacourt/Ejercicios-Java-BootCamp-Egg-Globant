/*
Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
los servicios en la clase correspondiente)
Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
cómo se ordena un conjunto.
Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
al usuario.
*/
package ejercicio05collections;

import Services.CountryService;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio05Collections {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean exit = false;
        int menuOption;
        String option;
        String name;
        String countryName;

        CountryService cs = new CountryService();
        ArrayList<String> listOfCountriesAsStrings = cs.getListOfCountriesAsStrings();

        while (!exit) {
            System.out.println("1. Enter a country.");
            System.out.println("2  View the list of countries.");
            System.out.println("3. Remove country from the list.");
            System.out.println("4. Exit.");

            System.out.println("Enter the option you want to do.");
            menuOption = sc.nextInt();
            sc.nextLine();

            switch (menuOption) {
                case 1:
                    do {

                        System.out.println("Please enter the name of the country.");
                        name = sc.nextLine();
                        System.out.println("");

                        cs.createAndAdd(name);

                        System.out.println("Would you like to enter another country? Please answer with yes/no.");
                        option = sc.nextLine();

                        while (!option.equalsIgnoreCase("yes") && !option.equalsIgnoreCase("no")) {
                            System.out.println("Invalid response, please enter yes or no.");
                            option = sc.nextLine();
                        }

                    } while (option.equalsIgnoreCase("yes"));
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("List of countries.");
                    for (String countries : listOfCountriesAsStrings) {
                        System.out.println(countries);
                    }
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("Enter the name of the country you want to remove.");
                    countryName = sc.nextLine();
                    if (cs.searchCountry(countryName)) {
                        cs.removeCountry(countryName);
                        System.out.println("The country was successfully removed.");
                    } else {
                        System.out.println("The country entered is not part of the list.");
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