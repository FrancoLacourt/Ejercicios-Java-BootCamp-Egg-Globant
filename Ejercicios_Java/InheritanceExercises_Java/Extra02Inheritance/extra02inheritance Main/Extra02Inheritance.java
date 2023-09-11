/*
Crear una superclase llamada Edificio con los siguientes atributos: ancho, alto y largo. La clase
edificio tendrá como métodos:
• Método calcularSuperficie(): calcula la superficie del edificio.
• Método calcularVolumen(): calcula el volumen del edifico.
Estos métodos serán abstractos y los implementarán las siguientes clases:
• Clase Polideportivo con su nombre y tipo de instalación que puede ser Techado o
Abierto, esta clase implementará los dos métodos abstractos y los atributos del padre.
• Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de personas
por oficina y número de pisos. Esta clase implementará los dos métodos abstractos y
los atributos del padre.
De esta clase nos interesa saber cuántas personas pueden trabajar en todo el edificio, el
usuario dirá cuántas personas entran en cada oficina, cuantas oficinas y el número de piso
(suponiendo que en cada piso hay una oficina). Crear el método cantPersonas(), que muestre
cuantas personas entrarían en un piso y cuantas en todo el edificio.

Por último, en el main vamos a crear un ArrayList de tipo Edificio. El ArrayList debe contener
dos polideportivos y dos edificios de oficinas. Luego, recorrer este array y ejecutar los
métodos calcularSuperficie y calcularVolumen en cada Edificio. Se deberá mostrar la
superficie y el volumen de cada edificio.
Además de esto, para la clase Polideportivo nos interesa saber cuántos polideportivos son
techados y cuantos abiertos. Y para la clase EdificioDeOficinas deberemos llamar al método
cantPersonas() y mostrar los resultados de cada edificio de oficinas.
*/

package extra02inheritance;

import Entities.Building;
import Entities.OfficesBuilding;
import Entities.SportsCenter;
import Services.BuildingService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Extra02Inheritance {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean exit = false;
        int menuOption;
        Double width;
        Double length;
        Double height;
        String centerName;
        String installationType;
        String option;
        int indoorCount = 0;
        int outdoorCount = 0;
        int officeNumber;
        int peoplePerOffice;
        int floorNumber;
        int sportsCenter = 0;

        BuildingService bs = new BuildingService();

        ArrayList<Building> buildings = new ArrayList();

        while (!exit) {
            System.out.println("1. Add Buildings.");
            System.out.println("2. Show all buildings.");
            System.out.println("3. Exit");

            System.out.println("Enter the option you want to do.");
            menuOption = sc.nextInt();
            sc.nextLine();

            switch (menuOption) {
                case 1:

                    System.out.println("Which type of building you wnat to add? Sports Center or Offices Building?");
                    option = sc.nextLine();

                    while (!option.equalsIgnoreCase("sports center") && !option.equalsIgnoreCase("offices building")) {
                        System.out.println("Invalid option. Please answer with Sports Center or Offices Building.");
                        option = sc.nextLine();
                    }

                    System.out.println("Please enter the length of the building.");
                    length = sc.nextDouble();

                    while (length <= 0) {
                        System.out.println("Invalid number. Length of the building must be greater than 0. Please enter the length of the building again.");
                        length = sc.nextDouble();
                    }
                    sc.nextLine();

                    System.out.println("Enter the width of the building.");
                    width = sc.nextDouble();

                    while (width <= 0) {
                        System.out.println("Invalid number. Width of the building must be greater than 0. Please enter the width of the building again.");
                        width = sc.nextDouble();
                    }
                    sc.nextLine();

                    System.out.println("Enter the height of the building.");
                    height = sc.nextDouble();

                    while (height <= 0) {
                        System.out.println("Invalid number. Height of the building must be greater than 0. Please enter the height of the building again.");
                        height = sc.nextDouble();
                    }
                    sc.nextLine();

                    if (option.equalsIgnoreCase("sports center")) {

                        System.out.println("Enter the name of the Sports Center.");
                        centerName = sc.nextLine();

                        System.out.println("Enter the installation type of the Sports Center (Indoor or Outdoor).");
                        installationType = sc.nextLine();

                        while (!installationType.equalsIgnoreCase("Indoor") && !installationType.equalsIgnoreCase("Outdoor")) {
                            System.out.println("Invalid answer. Please asnwer with Indoor or Outdoor.");
                            installationType = sc.nextLine();
                        }

                        //Depending on the answer, I add one to the corresponding counter.
                        if (installationType.equalsIgnoreCase("Indoor")) {
                            indoorCount += 1;
                        } else {
                            outdoorCount += 1;
                        }

                        //When I create a sportsCenter, I add one to its counter.
                        SportsCenter sCenter = bs.createSportsCenter(width, height, length, centerName, installationType);
                        buildings.add(sCenter);
                        sportsCenter += 1;

                        System.out.println(centerName + " was succesfully added.");
                    } else {
                        System.out.println("How many offices are on each floor?");
                        officeNumber = sc.nextInt();

                        while (officeNumber <= 0) {
                            System.out.println("Invalid number. Number of offices in the building must be greater than 0. Please enter the number of offices per floor again.");
                            officeNumber = sc.nextInt();
                        }
                        sc.nextLine();

                        System.out.println("How many people are in each office?");
                        peoplePerOffice = sc.nextInt();

                        while (peoplePerOffice <= 0) {
                            System.out.println("Invalid number. It must be at least one person in each office. Please enter the number of people per office again.");
                            peoplePerOffice = sc.nextInt();
                        }
                        sc.nextLine();

                        System.out.println("Hoy many floors does the building have?");
                        floorNumber = sc.nextInt();

                        while (floorNumber <= 0) {
                            System.out.println("Invalid number. There must be at least one floor on the building. Please enter the number of floors again.");
                            floorNumber = sc.nextInt();
                        }
                        sc.nextLine();

                        OfficesBuilding oBuilding = bs.createOfficesBuilding(officeNumber, peoplePerOffice, floorNumber, width, height, length);
                        buildings.add(oBuilding);

                        System.out.println("The offices building was succesfully added.");

                    }

                    System.out.println("");
                    break;

                case 2:

                    if (buildings.isEmpty()) {
                        System.out.println("There are no buildings yet.");
                    } else {
                        //With this comparator, I get the name of the class of each object in the list and use it to sort the objects alphabetically by their name of their classes.
                        //So I can show all the objects sorted by class.
                        
                        Comparator<Building> comparator = new Comparator<Building>() {

                            public int compare(Building b1, Building b2) {
                                return b1.getClass().getSimpleName().compareTo(b2.getClass().getSimpleName());
                            }
                        };
                        
                        Collections.sort(buildings, comparator);
                        
                        System.out.println("There are " + sportsCenter + " Sports Centers. " + indoorCount + " Indoor and " + outdoorCount + " Outdoor.");
                        System.out.println("");
                        
                        for (Building building : buildings) {
                            System.out.println(building.toString());
                            System.out.println("");
                        }
                    }

                    System.out.println("");
                    break;

                case 3:
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