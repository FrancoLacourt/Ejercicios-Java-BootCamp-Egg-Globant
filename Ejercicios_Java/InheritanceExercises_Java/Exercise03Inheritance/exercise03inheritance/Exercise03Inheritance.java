package exercise03inheritance;

import Entities.DomesticAppliance;
import Entities.Television;
import Entities.Washer;
import Services.TelevisionService;
import Services.WasherService;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise03Inheritance {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean exit = false;
        int menuOption;
        String option;
        int numberOfTvs = 0;
        int numberOfWashers = 0;

        WasherService ws = new WasherService();

        TelevisionService ts = new TelevisionService();

        ArrayList<DomesticAppliance> domesticAppliances = new ArrayList();

        while (!exit) {
            System.out.println("1. Add domestic appliance.");
            System.out.println("2. Show all domestic appliances with their respective prices.");
            System.out.println("3. Show total price of all domestic appliances.");
            System.out.println("4. Show number of domestic appliances.");
            System.out.println("5. Exit");

            System.out.println("Enter the option you want to do.");
            menuOption = sc.nextInt();
            sc.nextLine();

            switch (menuOption) {
                case 1:
                    System.out.println("Would you like to add a Television or a Washer?");
                    option = sc.nextLine();
                    System.out.println("");

                    while (!option.equalsIgnoreCase("television") && !option.equalsIgnoreCase("washer")) {
                        System.out.println("Invalid response, please enter Television or Washer.");
                        option = sc.nextLine();
                        System.out.println("");
                    }

                    if (option.equalsIgnoreCase("television")) {

                        System.out.println("Enter the color of the tv.");
                        String tvColor = sc.nextLine();

                        System.out.println("Enter the energy consumption of the tv (Letter between 'A' and 'F').");
                        char tvEnergyConsumption = sc.nextLine().toUpperCase().charAt(0);

                        System.out.println("Enter the weight of the tv.");
                        Double tvWeight = sc.nextDouble();

                        while (tvWeight <= 0) {
                            System.out.println("Error. The weight of the tv must be greater than 0. Please enter the weight again.");
                            tvWeight = sc.nextDouble();
                        }
                        sc.nextLine();

                        System.out.println("What resolution is the tv (Inches).");

                        int resolution = sc.nextInt();
                        sc.nextLine();

                        while (resolution <= 0) {
                            System.out.println("Error. The resolution of the tv must be greater than 0. Please enter the resolution again.");
                            resolution = sc.nextInt();
                        }

                        boolean dttTuner;
                        System.out.println("Does the tv has DTT tuner?");
                        String answer = sc.nextLine();

                        while (!answer.equalsIgnoreCase("yes") && !answer.equalsIgnoreCase("no")) {
                            System.out.println("Invalid response, please enter yes or no.");
                            answer = sc.nextLine();
                        }

                        if (answer.equalsIgnoreCase("yes")) {
                            dttTuner = true;
                        } else {
                            dttTuner = false;
                        }

                        Television t = ts.createTelevision(tvColor, tvEnergyConsumption, tvWeight, dttTuner, resolution);
                        domesticAppliances.add(t);
                        numberOfTvs += 1;
                        System.out.println("Television was succesfully added.");

                    } else {
                        System.out.println("Enter the color of the washer.");
                        String washerColor = sc.nextLine();

                        System.out.println("Enter the energy consumption of the washer (Letter between 'A' and 'F').");
                        char washerEnergyConsumption = sc.nextLine().toUpperCase().charAt(0);

                        System.out.println("Enter the weight of the washer.");
                        Double washerWeight = sc.nextDouble();

                        while (washerWeight <= 0) {
                            System.out.println("Error. The weight of the washer must be greater than 0. Please enter the weight again.");
                            washerWeight = sc.nextDouble();
                        }

                        sc.nextLine();

                        System.out.println("Enter the load of the washer.");
                        Double load = sc.nextDouble();

                        while (load <= 0) {
                            System.out.println("Error. The load of the tv must be greater than 0. Please enter the weight again.");
                            load = sc.nextDouble();
                        }

                        sc.nextLine();

                        Washer w = ws.createWasher(washerColor, washerEnergyConsumption, washerWeight, load);
                        domesticAppliances.add(w);
                        numberOfWashers += 1;
                        System.out.println("Washer was succesfully added.");
                    }

                    System.out.println("");
                    break;

                case 2:
                    if (domesticAppliances.isEmpty()) {
                        System.out.println("There are no domestic appliances yet.");
                    } else {
                        for (DomesticAppliance domesticAppliance : domesticAppliances) {
                            System.out.println(domesticAppliance.toString());
                        }
                    }

                    System.out.println("");
                    break;
                case 3:
                    Double totalPrice = 0d;

                    if (domesticAppliances.isEmpty()) {
                        System.out.println("There are no domestic appliances yet.");
                    } else {
                        for (DomesticAppliance domesticAppliance : domesticAppliances) {
                            totalPrice += domesticAppliance.getPrice();
                        }
                        System.out.println("Total price of all domestic appliances is: $" + totalPrice);
                    }

                    System.out.println("");
                    break;
                case 4:

                    if (domesticAppliances.isEmpty()) {
                        System.out.println("There are no domestic appliances yet.");
                    } else {
                        if (domesticAppliances.size() == 1) {
                            System.out.println("There is one domestic appliance.");
                            if (numberOfTvs == 0) {
                                System.out.println(numberOfWashers + " washer.");
                            } else {
                                System.out.println(numberOfTvs + " tv.");
                            }
                        } else {
                            System.out.println("There are " + domesticAppliances.size() + " domestic appliances.");
                            if (numberOfTvs == 0) {
                                System.out.println(numberOfWashers + " washers.");
                            } else if (numberOfWashers == 0) {
                                System.out.println(numberOfTvs + " televisions.");
                            } else {
                                System.out.println(numberOfTvs + " televisions.");
                                System.out.println(numberOfWashers + " washers.");
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