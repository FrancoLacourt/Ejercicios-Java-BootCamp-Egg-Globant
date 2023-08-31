package exercise02inheritance;

import Entities.Television;
import Entities.Washer;
import Services.TelevisionService;
import Services.WasherService;
import java.util.Scanner;

public class Exercise02Inheritance {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        boolean dttTuner;

        WasherService ws = new WasherService();
        TelevisionService ts = new TelevisionService();

        System.out.println("Enter the color of the washer.");
        String washerColor = sc.nextLine();

        System.out.println("Enter the energy consumption of the washer (Letter between 'A' and 'F').");
        char washerEnergyConsumption = sc.nextLine().charAt(0);

        System.out.println("Enter the weight of the washer.");
        Double washerWeight = sc.nextDouble();
        sc.nextLine();

        System.out.println("Enter the load of the washer.");
        Double load = sc.nextDouble();
        sc.nextLine();

        Washer w = ws.createWasher(washerColor, washerEnergyConsumption, washerWeight, load);

        System.out.println("The final price of the washer (Considering that has a starter price of $1000) is: $" + w.getPrice());

        System.out.println("--------------------------------------------");

        System.out.println("Enter the color of the tv.");
        String tvColor = sc.nextLine();

        System.out.println("Enter the energy consumption of the tv (Letter between 'A' and 'F').");
        char tvEnergyConsumption = sc.nextLine().toUpperCase().charAt(0);

        System.out.println("Enter the weight of the tv.");
        Double tvWeight = sc.nextDouble();
        sc.nextLine();

        System.out.println("What resolution is the tv (Inches).");
        int resolution = sc.nextInt();
        sc.nextLine();

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
        
        System.out.println("The final price of the tv (Considering that has a starter price of $1000) is: $" + t.getPrice());
    }
}