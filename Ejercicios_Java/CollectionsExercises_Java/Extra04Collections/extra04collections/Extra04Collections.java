/*
Almacena en un HashMap los códigos postales de 10 ciudades a elección de esta
página: https://mapanet.eu/index.htm. Nota: Poner el código postal sin la letra, solo el
número.
• Pedirle al usuario que ingrese 10 códigos postales y sus ciudades.
• Muestra por pantalla los datos introducidos
• Pide un código postal y muestra la ciudad asociada si existe sino avisa al usuario.
• Muestra por pantalla los datos
• Agregar una ciudad con su código postal correspondiente más al HashMap.
• Elimina 3 ciudades existentes dentro del HashMap, que pida el usuario.
• Muestra por pantalla los datos
 */
package extra04collections;

import Service.CityService;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Extra04Collections {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean exit = false;
        int menuOption;
        String option;
        String postalCode;
        String name;
        String cityPostalCode;
        String cityToRemove;

        CityService cs = new CityService();
        HashMap<String, String> cities = cs.getAllCities();

        while (!exit) {
            System.out.println("1. Add new city.");
            System.out.println("2. View all cities in the list.");
            System.out.println("3. Enter a postal code to see the corresponding city.");
            System.out.println("4. Remove a city from the list.");
            System.out.println("5. Exit.");

            System.out.println("Enter the option you want to do.");
            menuOption = sc.nextInt();
            sc.nextLine();

            switch (menuOption) {
                case 1:
                    do {
                        System.out.println("Please enter the postal code of the city.");
                        postalCode = sc.nextLine();
                        System.out.println("Enter the name of the city.");
                        name = sc.nextLine().toLowerCase();
                        System.out.println("");

                        cs.createAndAdd(postalCode, name);

                        System.out.println("Would you like to add another city? Please answer with yes/no.");
                        option = sc.nextLine();

                        while (!option.equalsIgnoreCase("yes") && !option.equalsIgnoreCase("no")) {
                            System.out.println("");
                            System.out.println("Invalid response, please enter yes or no.");
                            option = sc.nextLine();

                        }

                    } while (option.equalsIgnoreCase("yes"));
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("List of cities.");
                    for (Map.Entry<String, String> entry : cities.entrySet()) {
                        String key = entry.getKey();
                        String value = entry.getValue();
                        //With this format, if the postal code starts with 0, i´ll be able to see it.
                        String postalCodeString = String.valueOf(key);

                        System.out.println("Postal code: " + postalCodeString + ". City: " + value + ".");
                    }
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("Enter the postal code of the city.");
                    cityPostalCode = sc.nextLine();
                    
                    if (cs.searchCityByPostalCode(cityPostalCode)) {
                        System.out.println("This postal code is from " + cs.getCityName(cityPostalCode));
                    } else {
                        System.out.println("The entered postal code is not from any city on the list.");
                    }
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("Enter the city you want to remove.");
                    cityToRemove = sc.nextLine();
                    if (cs.searchCityByName(cityToRemove)) {
                        cs.removeCity(cityToRemove);
                        System.out.println("The city was succesfully removed.");
                    } else {
                        System.out.println("The entered city is not on the list.");
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