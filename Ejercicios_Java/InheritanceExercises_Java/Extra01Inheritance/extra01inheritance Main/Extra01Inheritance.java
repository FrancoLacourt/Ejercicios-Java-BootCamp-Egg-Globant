/*
En un puerto se alquilan amarres para barcos de distinto tipo. Para cada Alquiler se guarda: el
nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del
amarre y el barco que lo ocupará.
Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.
Sin embargo, se pretende diferenciar la información de algunos tipos de barcos especiales:
• Número de mástiles para veleros.
• Potencia en CV para barcos a motor.
• Potencia en CV y número de camarotes para yates de lujo.
Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de
alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente
multiplicando por 10 los metros de eslora).
En los barcos de tipo especial el módulo de cada barco se calcula sacando el módulo normal y
sumándole el atributo particular de cada barco. En los veleros se suma el número de mástiles,
en los barcos a motor se le suma la potencia en CV y en los yates se suma la potencia en CV y
el número de camarotes.
Utilizando la herencia de forma apropiada, deberemos programar en Java, las clases y los
métodos necesarios que permitan al usuario elegir el barco que quiera alquilar y mostrarle el
precio final de su alquiler.
*/

package extra01inheritance;

import Entities.LuxuryYacht;
import Entities.MotorBoat;
import Entities.Rent;
import Entities.Sailboat;
import Entities.Ship;
import Services.RentService;
import Services.ShipService;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class Extra01Inheritance {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean exit = false;
        int menuOption;
        String name;
        String clientId;
        String rentalDateStr;
        String returnDateStr;
        String boatType;
        String registration;
        String mooring;
        String option;
        Double length;
        int yearOfProduction;
        int mastNumber;
        int enginePowerInHP;
        int cabinNumber;

        RentService rentService = new RentService();
        ShipService shipService = new ShipService();

        ArrayList<Rent> rents = new ArrayList();

        while (!exit) {
            System.out.println("1. Adds ships.");
            System.out.println("2. Show all ships in the mooray.");
            System.out.println("3. Exit");

            System.out.println("Enter the option you want to do.");
            menuOption = sc.nextInt();
            sc.nextLine();

            switch (menuOption) {
                case 1:

                    System.out.println("Enter your name.");
                    name = sc.nextLine();

                    System.out.println("Enter your ID.");
                    clientId = sc.nextLine();

                    LocalDate rentalDate = null;
                    LocalDate returnDate = null;

                    //With the try/catch block, I'm able to re-enter the dates. If I don't use it, the programm will crash before I can re-enter the dates.
                    while (rentalDate == null || returnDate == null || returnDate.isBefore(rentalDate) || returnDate.isEqual(rentalDate)) {
                        try {
                            System.out.print("Enter the date you want to rent the mooring (YYYY-MM-DD): ");
                            rentalDateStr = sc.nextLine();
                            rentalDate = LocalDate.parse(rentalDateStr);

                            System.out.print("Enter the date you want to return the mooring (YYYY-MM-DD): ");
                            returnDateStr = sc.nextLine();
                            returnDate = LocalDate.parse(returnDateStr);

                            if (returnDate.isBefore(rentalDate) || returnDate.isEqual(rentalDate)) {
                                System.out.println("Invalid return date. You must rent the ship for at least one day. Enter the dates again.");
                            }
                        } catch (DateTimeParseException e) {
                            System.out.println("The entered date is not valid. Please, enter the dates in the following format: YYYY-MM-DD.");
                        }
                    }

                    System.out.println("Enter mooring position");
                    mooring = sc.nextLine();

                    System.out.println("What type of ship will you use?");
                    boatType = sc.nextLine();

                    System.out.println("Enter ship's registration.");
                    registration = sc.nextLine();

                    System.out.println("Enter ship's length.");
                    length = sc.nextDouble();

                    while (length <= 0) {
                        System.out.println("Invalid number. length of the ship must be greater than 0. Please enter the length of the ship again.");
                        length = sc.nextDouble();
                    }
                    sc.nextLine();

                    System.out.println("Enter the year the ship was built.");
                    yearOfProduction = sc.nextInt();
                    sc.nextLine();

                    if (!boatType.equalsIgnoreCase("sailboat") && !boatType.equalsIgnoreCase("motor boat") && !boatType.equalsIgnoreCase("luxury yacht")) {

                        Ship ship = shipService.createShip(registration, length, yearOfProduction, boatType);

                        Rent r = rentService.createRent(name, clientId, rentalDate, returnDate, mooring, ship);

                        System.out.println("The price of the rent will be: $" + r.finalPrice());
                        System.out.println("You want to rent it?");
                        option = sc.nextLine();

                        while (!option.equalsIgnoreCase("yes") && !option.equalsIgnoreCase("no")) {
                            System.out.println("Invalid response. Yo must answer with yes or no.");
                            option = sc.nextLine();
                        }

                        if (option.equalsIgnoreCase("yes")) {
                            System.out.println("Congratulations! the mooring was succesfully rented!");
                            rents.add(r);
                        } else {
                            System.out.println("We are sorry you don't want to rent the mooring.");
                        }

                    } else {

                        if (boatType.equalsIgnoreCase("sailboat")) {

                            System.out.println("Enter the number of masts the sailboat has.");
                            mastNumber = sc.nextInt();

                            while (mastNumber <= 0) {
                                System.out.println("Invalid number. Masts of the sailboat must be greater than 0. Please enter the number of masts again.");
                                mastNumber = sc.nextInt();
                            }
                            sc.nextLine();

                            Sailboat sailboat = shipService.createSailboat(mastNumber, registration, length, yearOfProduction, boatType);

                            Rent r = rentService.createRent(name, clientId, rentalDate, returnDate, mooring, sailboat);

                            System.out.println("The price of the rent will be: $" + r.finalPrice());
                            System.out.println("You want to rent it?");
                            option = sc.nextLine();

                            while (!option.equalsIgnoreCase("yes") && !option.equalsIgnoreCase("no")) {
                                System.out.println("Invalid response. Yo must answer with yes or no.");
                                option = sc.nextLine();
                            }

                            if (option.equalsIgnoreCase("yes")) {
                                System.out.println("Congratulations! the mooring was succesfully rented!");
                                rents.add(r);
                            } else {
                                System.out.println("We are sorry you don't want to rent the mooring.");
                            }

                        } else {

                            System.out.println("Enter engine power in HP of the ship.");
                            enginePowerInHP = sc.nextInt();

                            while (enginePowerInHP <= 0) {
                                System.out.println("Invalid number. Engine power must be greater than 0 HP. Please enter the engine power again.");
                                enginePowerInHP = sc.nextInt();
                            }
                            sc.nextLine();

                            if (boatType.equalsIgnoreCase("Motor boat")) {

                                MotorBoat motorBoat = shipService.createMotorBoat(enginePowerInHP, registration, length, yearOfProduction, boatType);

                                Rent r = rentService.createRent(name, clientId, rentalDate, returnDate, mooring, motorBoat);

                                System.out.println("The price of the rent will be: $" + r.finalPrice());
                                System.out.println("You want to rent it?");
                                option = sc.nextLine();

                                while (!option.equalsIgnoreCase("yes") && !option.equalsIgnoreCase("no")) {
                                    System.out.println("Invalid response. Yo must answer with yes or no.");
                                    option = sc.nextLine();
                                }

                                if (option.equalsIgnoreCase("yes")) {
                                    System.out.println("Congratulations! the mooring was succesfully rented!");
                                    rents.add(r);
                                } else {
                                    System.out.println("We are sorry you don't want to rent the mooring.");
                                }

                            } else {

                                if (boatType.equalsIgnoreCase("Luxury Yacht")) {

                                    System.out.println("Enter how many cabins are on the yacht..");
                                    cabinNumber = sc.nextInt();

                                    while (cabinNumber <= 0) {
                                        System.out.println("Invalid number. The yacht must have at least 1 cabin. Please enter the number of cabins again.");
                                        cabinNumber = sc.nextInt();
                                    }
                                    sc.nextLine();

                                    LuxuryYacht luxuryYacht = shipService.createYacht(cabinNumber, enginePowerInHP, registration, length, yearOfProduction, boatType);

                                    Rent r = rentService.createRent(name, clientId, rentalDate, returnDate, mooring, luxuryYacht);

                                    System.out.println("The price of the rent will be: $" + r.finalPrice());
                                    System.out.println("You want to rent it?");
                                    option = sc.nextLine();

                                    while (!option.equalsIgnoreCase("yes") && !option.equalsIgnoreCase("no")) {
                                        System.out.println("Invalid response. Yo must answer with yes or no.");
                                        option = sc.nextLine();
                                    }

                                    if (option.equalsIgnoreCase("yes")) {
                                        System.out.println("Congratulations! the mooring was succesfully rented!");
                                        rents.add(r);
                                    } else {
                                        System.out.println("We are sorry you don't want to rent the mooring.");
                                    }

                                }
                            }

                        }
                    }

                    System.out.println("");
                    break;

                case 2:

                    if (rents.isEmpty()) {
                        System.out.println("No one rented a mooring yet.");
                    } else {
                        for (Rent rent : rents) {
                            System.out.println(rent.toString());
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