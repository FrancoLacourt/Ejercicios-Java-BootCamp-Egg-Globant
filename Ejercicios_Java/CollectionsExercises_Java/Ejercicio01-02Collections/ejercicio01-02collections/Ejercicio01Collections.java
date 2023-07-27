/*
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.

Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.
 */
package ejercicio01collections;

import Services.DogService;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio01Collections {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String breed;
        String option;

        DogService ds = new DogService();
        ArrayList<String> listOfDogsAsStrings;
        listOfDogsAsStrings = ds.getListOfDogsAsStrings();

        do {

            System.out.println("Ingrese la raza del perro.");
            breed = sc.nextLine();
            ds.createAndAdd(breed);
            System.out.println("");

            System.out.println("Desea agregar otra raza a la lista? Responda con Si/No.");
            option = sc.nextLine();

            while (!option.equalsIgnoreCase("si") && !option.equalsIgnoreCase("no")) {
                System.out.println("La respuesta ingresada no es válida, intente nuevamente.");
                option = sc.nextLine();
            }

        } while (option.equalsIgnoreCase("si"));

        System.out.println("Las razas actuales de la lista son:");
        System.out.println("");
        for (String dogs : listOfDogsAsStrings) {
            System.out.println(dogs);
        }
        System.out.println("Cantidad = " + ds.listSize());
        System.out.println("");

        System.out.println("Ingrese la raza de perro que desee eliminar de la lista.");
        String dogBreed = sc.nextLine();

        while (dogBreed.equals("")) {
            System.out.println("No se ha ingresado ninguna raza. Ingrese una raza nuevamente.");
            dogBreed = sc.nextLine();
        }

        if (ds.searchBreed(dogBreed)) {
            ds.removeBreed(dogBreed);
            System.out.println("La raza solicitada se ha eliminado correctamente.");

            for (String dogs : listOfDogsAsStrings) {
                System.out.println(dogs);
            }

        } else {
            System.out.println("No se encontró la raza a eliminar.");

            for (String dogs : listOfDogsAsStrings) {
                System.out.println(dogs);
            }
        }
    }
}
