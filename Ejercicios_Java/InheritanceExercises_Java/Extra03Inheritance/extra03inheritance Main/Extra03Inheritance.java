/*
Una compañía de promociones turísticas desea mantener información sobre la infraestructura
de alojamiento para turistas, de forma tal que los clientes puedan planear sus vacaciones de
acuerdo con sus posibilidades. Los alojamientos se identifican por un nombre, una dirección,
una localidad y un gerente encargado del lugar. La compañía trabaja con dos tipos de
alojamientos: Hoteles y Alojamientos Extrahoteleros.
Los Hoteles tienen como atributos: Cantidad de Habitaciones, Número de Camas, Cantidad de
Pisos, Precio de Habitaciones. Y estos pueden ser de cuatro o cinco estrellas. Las
características de las distintas categorías son las siguientes:
• Hotel **** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
Nombre del Restaurante, Capacidad del Restaurante, Precio de las Habitaciones.
• Hotel ***** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
Nombre del Restaurante, Capacidad del Restaurante, Cantidad Salones de
Conferencia, Cantidad de Suites, Cantidad de Limosinas, Precio de las Habitaciones.
Los gimnasios pueden ser clasificados por la empresa como de tipo “A” o de tipo “B”, de
acuerdo a las prestaciones observadas. Las limosinas están disponibles para cualquier
cliente, pero sujeto a disponibilidad, por lo que cuanto más limosinas tenga el hotel, más caro
será.
El precio de una habitación debe calcularse de acuerdo con la siguiente fórmula:
PrecioHabitación = $50 + ($1 x capacidad del hotel) + (valor agregado por restaurante) + (valor
agregado por gimnasio) + (valor agregado por limosinas).
Donde:
Valor agregado por el restaurante:
• $10 si la capacidad del restaurante es de menos de 30 personas.
• $30 si está entre 30 y 50 personas.
• $50 si es mayor de 50.
Valor agregado por el gimnasio:
• $50 si el tipo del gimnasio es A.
• $30 si el tipo del gimnasio es B.
Valor agregado por las limosinas:
• $15 por la cantidad de limosinas del hotel.

En contraste, los Alojamientos Extra hoteleros proveen servicios diferentes a los de los
hoteles, estando más orientados a la vida al aire libre y al turista de bajos recursos. Por cada
Alojamiento Extrahotelero se indica si es privado o no, así como la cantidad de metros
cuadrados que ocupa. Existen dos tipos de alojamientos extrahoteleros: los Camping y las
Residencias. Para los Camping se indica la capacidad máxima de carpas, la cantidad de baños
disponibles y si posee o no un restaurante dentro de las instalaciones. Para las residencias se
indica la cantidad de habitaciones, si se hacen o no descuentos a los gremios y si posee o no
campo deportivo. Realizar un programa en el que se representen todas las relaciones
descriptas.
Realizar un sistema de consulta que le permite al usuario consultar por diferentes criterios:
• todos los alojamientos.
• todos los hoteles de más caro a más barato.
• todos los campings con restaurante
• todos las residencias que tienen descuento.
*/

package extra03inheritance;

import Entities.Accomodation;
import Entities.Camping;
import Entities.Hotel;
import Entities.Hotel4Stars;
import Entities.Hotel5Stars;
import Entities.Residence;
import Services.AccomodationService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Extra03Inheritance {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean exit = false;
        int menuOption;
        String name;
        String address;
        String location;
        String manager;
        String option;
        String gymCategory;
        String restaurantName;
        String privacyAnswer;
        String nonHotelAccomodation;
        String restaurantAnswer;
        String discountAnswer;
        String sportsFieldAnswer;
        int roomsPerFloor;
        int bedsPerRoom;
        int numberOfFloors;
        int hotelCategory;
        int restaurantCapacity;
        int numberOfConferenceRooms;
        int numberOfSuites;
        int numberOfLimousines;
        int maxNumberOfTents;
        int numberOfBathrooms;
        int numberOfBedrooms;
        Double squareMeters;
        boolean privacy;
        boolean hasRestaurant;
        boolean discountForUnions;
        boolean sportsField;

        AccomodationService as = new AccomodationService();

        ArrayList<Accomodation> accomodations = new ArrayList();

        while (!exit) {
            System.out.println("1. Add accomodation.");
            System.out.println("2. Show all accomodations.");
            System.out.println("3. show all hotels from higher to lower price.");
            System.out.println("4. Show all campings with restaurant.");
            System.out.println("5. Show all residences with discount for unions.");
            System.out.println("6. Exit");

            System.out.println("Enter the option you want to do.");
            menuOption = sc.nextInt();
            sc.nextLine();

            switch (menuOption) {
                case 1:

                    System.out.println("Which type of accomodation you want to add? Hotel or Non-hotel?");
                    option = sc.nextLine();

                    while (!option.equalsIgnoreCase("Hotel") && !option.equalsIgnoreCase("Non-hotel")) {
                        System.out.println("Invalid option. Please answer with Hotel or Non-hotel.");
                        option = sc.nextLine();
                    }

                    System.out.println("Please enter the name of the accomodation.");
                    name = sc.nextLine();

                    System.out.println("Enter the address of the accomodation.");
                    address = sc.nextLine();

                    System.out.println("Enter the location of the accomodation.");
                    location = sc.nextLine();

                    System.out.println("Enter the name of accomodation manager.");
                    manager = sc.nextLine();

                    if (option.equalsIgnoreCase("Hotel")) {

                        System.out.println("Enter the number of stars of the hotel.");
                        hotelCategory = sc.nextInt();

                        if (hotelCategory != 4 && hotelCategory != 5) {

                            System.out.println("Sorry, we only work with 4 or 5 stars hotels");

                        } else {

                            System.out.println("Enter how many rooms there are per floor.");
                            roomsPerFloor = sc.nextInt();

                            while (roomsPerFloor <= 0) {
                                System.out.println("Invalid number. There must be at least 1 room per floor. Please enter the number of rooms per floor again.");
                                roomsPerFloor = sc.nextInt();
                            }
                            sc.nextLine();

                            System.out.println("Enter How many beds there are per room.");
                            bedsPerRoom = sc.nextInt();

                            while (bedsPerRoom <= 0) {
                                System.out.println("Invalid number. There must be at least 1 bed per room. Please enter the number of beds again.");
                                bedsPerRoom = sc.nextInt();
                            }
                            sc.nextLine();

                            System.out.println("Enter how many floors the hotel has.");
                            numberOfFloors = sc.nextInt();

                            while (numberOfFloors <= 0) {
                                System.out.println("Invalid number. The hotel must have at least 1 floor. Please enter the number of floors again.");
                                numberOfFloors = sc.nextInt();
                            }
                            sc.nextLine();

                            System.out.println("Enter the category of the gym (A or B).");
                            gymCategory = sc.nextLine();

                            while (!gymCategory.equalsIgnoreCase("A") && !gymCategory.equalsIgnoreCase("B")) {
                                System.out.println("Invalid answer. Please asnwer with A or B.");
                                gymCategory = sc.nextLine();
                            }

                            System.out.println("Enter restaurant's name.");
                            restaurantName = sc.nextLine();

                            System.out.println("Enter the capacity of " + restaurantName);
                            restaurantCapacity = sc.nextInt();

                            while (restaurantCapacity <= 9) {
                                System.out.println("Invalid number. The restaurant must have capacity for at least 10 people. Please enter restaurant's capacity again.");
                                restaurantCapacity = sc.nextInt();
                            }
                            sc.nextLine();

                            if (hotelCategory == 4) {
                                Hotel4Stars h = as.create4StarsHotel(gymCategory, restaurantName, restaurantCapacity, roomsPerFloor, bedsPerRoom, numberOfFloors, name, address, location, manager);
                                accomodations.add(h);
                                System.out.println("The hotel was succesfully added.");

                            } else {
                                System.out.println("Enter how many conference rooms the hotel has.");
                                numberOfConferenceRooms = sc.nextInt();

                                while (numberOfConferenceRooms <= 0) {
                                    System.out.println("Invalid number. The hotel must have at least 1 conference room. Please enter the number of conference rooms again.");
                                    numberOfConferenceRooms = sc.nextInt();
                                }
                                sc.nextLine();

                                System.out.println("Enter how many suites the hotel has.");
                                numberOfSuites = sc.nextInt();

                                while (numberOfSuites <= 0) {
                                    System.out.println("Invalid number. The hotel must have at least 1 suite. Please enter the number of suites again.");
                                    numberOfSuites = sc.nextInt();
                                }
                                sc.nextLine();

                                System.out.println("Enter how many limousines the hotel has.");
                                numberOfLimousines = sc.nextInt();

                                while (numberOfLimousines <= 0) {
                                    System.out.println("Invalid number. The hotel must have at least 1 Limousine. Please enter the number of Limousines again.");
                                    numberOfLimousines = sc.nextInt();
                                }
                                sc.nextLine();

                                Hotel5Stars h = as.create5StarsHotel(numberOfConferenceRooms, numberOfSuites, numberOfLimousines, gymCategory, restaurantName, restaurantCapacity,
                                        roomsPerFloor, bedsPerRoom, numberOfFloors, name, address, location, manager);
                                accomodations.add(h);
                                System.out.println("The hotel was succesfully added.");
                            }
                        }

                    } else {
                        System.out.println("Which type of accomodation you want to add? Camping or residence?");
                        nonHotelAccomodation = sc.nextLine();

                        if (!nonHotelAccomodation.equalsIgnoreCase("camping") && !nonHotelAccomodation.equalsIgnoreCase("residence")) {
                            System.out.println("Sorry, we only work with campings and residences.");
                        } else {
                            System.out.println("Is it private? Answer with (YES/NO)");
                            privacyAnswer = sc.nextLine();

                            while (!privacyAnswer.equalsIgnoreCase("yes") && !privacyAnswer.equalsIgnoreCase("no")) {
                                System.out.println("Invalid option. Please answer with YES or NO.");
                                privacyAnswer = sc.nextLine();
                            }

                            privacy = privacyAnswer.equalsIgnoreCase("yes");

                            System.out.println("Enter how many square meters the accomodation has.");
                            squareMeters = sc.nextDouble();

                            while (squareMeters <= 24) {
                                System.out.println("Invalid number. The accomodation must have at least 25 sqaure meters. Please enter the number of square meters again.");
                                squareMeters = sc.nextDouble();
                            }
                            sc.nextLine();

                            if (nonHotelAccomodation.equalsIgnoreCase("camping")) {
                                System.out.println("Enter the maximum number of tents.");
                                maxNumberOfTents = sc.nextInt();

                                while (maxNumberOfTents <= 3) {
                                    System.out.println("Invalid number. The maximum number of tents must be at least 4. Please enter the number of tents again.");
                                    maxNumberOfTents = sc.nextInt();
                                }
                                sc.nextLine();

                                System.out.println("Enter the number of bathrooms in the camping.");
                                numberOfBathrooms = sc.nextInt();

                                while (numberOfBathrooms <= 1) {
                                    System.out.println("Invalid number. The camping must have at least 2 bathrooms. Please enter the number of bathrooms again.");
                                    numberOfBathrooms = sc.nextInt();
                                }
                                sc.nextLine();

                                System.out.println("Does the camping have a restaurant? Answer with (YES/NO)");
                                restaurantAnswer = sc.nextLine();

                                while (!restaurantAnswer.equalsIgnoreCase("yes") && !restaurantAnswer.equalsIgnoreCase("no")) {
                                    System.out.println("Invalid option. Please answer with YES or NO.");
                                    restaurantAnswer = sc.nextLine();
                                }

                                hasRestaurant = restaurantAnswer.equalsIgnoreCase("yes");

                                Camping c = as.createCamping(maxNumberOfTents, numberOfBathrooms, hasRestaurant, privacy, squareMeters, name, address, location, manager);
                                accomodations.add(c);
                                System.out.println("The camping was succesfully added.");
                            } else {
                                System.out.println("Enter the number of bedrooms of the residence.");
                                numberOfBedrooms = sc.nextInt();

                                while (numberOfBedrooms <= 0) {
                                    System.out.println("Invalid number. The residence must have at least 1 bedroom. Please enter the number of bedroom again.");
                                    numberOfBedrooms = sc.nextInt();
                                }
                                sc.nextLine();

                                System.out.println("Does the residence have a discount for unions? Answer with (YES/NO)");
                                discountAnswer = sc.nextLine();

                                while (!discountAnswer.equalsIgnoreCase("yes") && !discountAnswer.equalsIgnoreCase("no")) {
                                    System.out.println("Invalid option. Please answer with YES or NO.");
                                    discountAnswer = sc.nextLine();
                                }

                                discountForUnions = discountAnswer.equalsIgnoreCase("yes");

                                System.out.println("Does the residence have a sports field? Answer with (YES/NO)");
                                sportsFieldAnswer = sc.nextLine();

                                while (!sportsFieldAnswer.equalsIgnoreCase("yes") && !sportsFieldAnswer.equalsIgnoreCase("no")) {
                                    System.out.println("Invalid option. Please answer with YES or NO.");
                                    sportsFieldAnswer = sc.nextLine();
                                }

                                sportsField = sportsFieldAnswer.equalsIgnoreCase("yes");

                                Residence r = as.createResidence(numberOfBedrooms, discountForUnions, sportsField, privacy, squareMeters, name, address, location, manager);
                                accomodations.add(r);
                                System.out.println("The residence was succesfully added.");
                            }
                        }
                    }

                    System.out.println("");
                    break;

                case 2:

                    if (accomodations.isEmpty()) {
                        System.out.println("There are no accomodations yet.");
                    } else {

                        for (Accomodation accomodation : accomodations) {
                            System.out.println(accomodation.toString());
                            System.out.println("");
                        }
                    }

                    System.out.println("");
                    break;

                case 3:

                    if (accomodations.isEmpty()) {
                        System.out.println("There are no accomodations yet.");
                        System.out.println("");
                        break;
                    } else {

                        Collections.sort(accomodations, (a1, a2) -> {
                            // Verificar si ambos alojamientos son hoteles
                            if (a1 instanceof Hotel && a2 instanceof Hotel) {
                                Hotel hotel1 = (Hotel) a1;
                                Hotel hotel2 = (Hotel) a2;

                                // Comparar por precio de hotel
                                double price1 = hotel1.getRoomPrice();
                                double price2 = hotel2.getRoomPrice();

                                return Double.compare(price2, price1);
                            }

                            // Si no son hoteles, no se hace ninguna comparación y se mantienen en su orden original.
                            return 0;
                        });

                        for (Accomodation accomodation : accomodations) {
                            if (accomodation instanceof Hotel) {
                                System.out.println(accomodation.toString());
                                System.out.println("");
                            }
                        }
                    }
                    
                    System.out.println("");
                    break;

                case 4:
                    if (accomodations.isEmpty()) {
                        System.out.println("There are no accomodations yet.");
                        System.out.println("");
                        break;
                    } else {
                        for (Accomodation accomodation : accomodations) {
                            if (accomodation instanceof Camping) {
                                if (((Camping) accomodation).isHasRestaurant()) {
                                    System.out.println(((Camping) accomodation).toString());
                                    System.out.println("");
                                }
                            }
                        }
                    }
                    
                    System.out.println("");
                    break;

                case 5:
                    if (accomodations.isEmpty()) {
                        System.out.println("There are no accomodations yet.");
                        System.out.println("");
                        break;
                    } else {
                        for (Accomodation accomodation : accomodations) {
                            if (accomodation instanceof Residence) {
                                if (((Residence) accomodation).isDiscountForUnions()) {
                                    System.out.println(((Residence) accomodation).toString());
                                    System.out.println("");
                                }
                            }
                        }
                    }
                    
                    System.out.println("");
                    break;

                case 6:
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