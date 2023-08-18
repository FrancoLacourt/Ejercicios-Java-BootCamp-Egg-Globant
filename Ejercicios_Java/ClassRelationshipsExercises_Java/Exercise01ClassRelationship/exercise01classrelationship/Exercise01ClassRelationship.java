package exercise01classrelationship;

import Services.DogService;
import Services.PersonService;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise01ClassRelationship {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DogService ds = new DogService();
        PersonService ps = new PersonService();

        ArrayList<String> listOfDogsAsStrings = ds.getListOfAvailableDogsAsStrings();
        ArrayList<String> listOfPersonsWithDog = ps.getListOfPersonsWithDog();

        String personName;
        String lastName;
        int age;
        String id;
        String answer;
        String breed;
        String dogName;
        int person = -1;

        while (listOfDogsAsStrings.size() < 3) {
            ds.createAndAdd();
        }

        System.out.println("Welcome to the dog shelter!");

        for (int i = 0; i < 3; i++) {
            person++;

            if (person > 0) {
                System.out.println("Next Person.");
            }
            System.out.println("Enter your name.");
            personName = sc.nextLine();
            System.out.println("Enter your last name.");
            lastName = sc.nextLine();
            System.out.println("Enter your age.");
            age = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter your id number.");
            id = sc.nextLine();
            ps.createAndAdd(personName, lastName, age, id);
            System.out.println("");

            System.out.println("These are the dogs available for adoption.");
            System.out.println("");
            for (String dogs : listOfDogsAsStrings) {
                System.out.println(dogs);
            }
            System.out.println("");
            System.out.println("Would you like to adopt one? Please answer with yes/no.");
            answer = sc.nextLine();

            while (!answer.equalsIgnoreCase("yes") && !answer.equalsIgnoreCase("no")) {
                System.out.println("Invalid response, please enter yes or no.");
                answer = sc.nextLine();
            }

            if (answer.equalsIgnoreCase("yes")) {
                System.out.println("Great! which one would you like to adopt?");
                breed = sc.nextLine();

                while (!ds.searchDog(breed)) {
                    System.out.println("The entered breed is not on the list. Enter dog’s breed again.");
                    breed = sc.nextLine();
                }

                System.out.println("");
                System.out.println("Perfect! Now you need to give it a name!");
                dogName = sc.nextLine();
                ds.setDogName(breed, dogName);
                ps.setDog(ds, breed, person);
                ds.removeDog(breed);

                System.out.println("");
                System.out.println("Thank you for adopting our lovely " + breed + "!");
                System.out.println("");
            } else {
                System.out.println("Okay, no problem.");
                System.out.println("");
            }
        }

        System.out.println("This is the list of the people who adopted a dog!");
        for (String persons : listOfPersonsWithDog) {
            System.out.println(persons);
        }
        System.out.println("");

        System.out.println("And this is the list of dogs that will continue on the shelter :(");
        for (String dogs : listOfDogsAsStrings) {
            System.out.println(dogs);
        }
        System.out.println("");
    }
}