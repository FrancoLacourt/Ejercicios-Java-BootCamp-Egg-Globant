/*
Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
tendremos una clase Pelicula con el título, director y duración de la película (en horas).
Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo
que se pide a continuación:
En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:

22

• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 */
package ejercicio04collections;

import Services.MovieService;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio04Collections {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean exit = false;
        int menuOption;
        String option;
        String title;
        String director;
        int duration;

        MovieService ms = new MovieService();
        ArrayList<String> listOfMoviesAsStrings = ms.getListOfMoviesAsStrings();
        ArrayList<String> moviesLongerThan1Hour = ms.getMoviesLongerThan1Hour();

        while (!exit) {
            System.out.println("1. Registrar película.");
            System.out.println("2  Mostrar todas las películas.");
            System.out.println("3. Mostrar todas las películas con duración mayor a 1 hora.");
            System.out.println("4. Ordenar las películas de acuerdo a su duración (de mayor a menor).");
            System.out.println("5. Ordenar las películas de acuerdo a su duración (de menor a mayor).");
            System.out.println("6. Ordenar las películas alfabéticamente (por título).");
            System.out.println("7. Ordenar las películas alfabéticamente (por director).");
            System.out.println("8. Salir del Menú.");

            System.out.println("Ingrese la opción que desee.");
            menuOption = sc.nextInt();
            sc.nextLine();

            switch (menuOption) {
                case 1:
                    do {

                        System.out.println("Ingrese el nombre de la película.");
                        title = sc.nextLine();
                        System.out.println("");
                        System.out.println("Ingrese el nombre del director de la película.");
                        director = sc.nextLine();
                        System.out.println("");
                        System.out.println("Ingrese la duración de la película (en horas).");
                        duration = sc.nextInt();
                        sc.nextLine();

                        ms.createAndAdd(title, director, duration);

                        System.out.println("");

                        System.out.println("Desea agregar otra película? Responda con Si/No.");
                        option = sc.nextLine();

                        while (!option.equalsIgnoreCase("si") && !option.equalsIgnoreCase("no")) {
                            System.out.println("La respuesta ingresada no es válida, intente nuevamente.");
                            option = sc.nextLine();
                        }

                    } while (option.equalsIgnoreCase("si"));
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("Lista de películas.");
                    for (String movies : listOfMoviesAsStrings) {
                        System.out.println(movies);
                    }
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("Lista de películas con duración mayor a 1 hora.");
                    ms.MoviesLongerThan1Hour();
                    for (String movies : moviesLongerThan1Hour) {
                        System.out.println(movies);
                    }
                    System.out.println("");
                    break;
                case 4:
                    ms.sortInDescendingOrder();
                    break;
                case 5:
                    ms.sortInAscendingOrder();
                    break;
                case 6:
                    ms.sortAlphabeticallyByTitle();
                    break;
                case 7:
                    ms.sortAlphabeticallyByDirector();
                    break;
                case 8:
                    System.out.println("Saliendo del Menú...");
                    exit = true;
                    break;

                default:
                    System.out.println("Error. Debe ingresar una opción válida.");
            }
        }
    }
}