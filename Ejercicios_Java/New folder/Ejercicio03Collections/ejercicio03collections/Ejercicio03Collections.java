/*
Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
con sus 3 notas.
En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.
 */
package ejercicio03collections;

import Services.StudentService;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio03Collections {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean exit = false;
        int menuOption;
        String option;
        String studentName;

        StudentService ss = new StudentService();
        ArrayList<String> listOfStudentsAsStrings = ss.getListOfStudentsAsStrings();

        while (!exit) {
            System.out.println("1. Registrar alumnos con sus notas.");
            System.out.println("2  Mostrar alumnos con sus notas.");
            System.out.println("3. Mostrar nota final del alumno (por nombre)");
            System.out.println("4. Salir del Menú.");

            System.out.println("Ingrese la opción que desee.");
            menuOption = sc.nextInt();
            sc.nextLine();

            switch (menuOption) {
                case 1:
                    do {
                        ArrayList<Integer> studentGrades = new ArrayList();

                        System.out.println("Ingrese el nombre del alumno.");
                        studentName = sc.nextLine();
                        System.out.println("");
                        System.out.println("Ingrese cuántas notas tiene el alumno.");
                        int grades = sc.nextInt();

                        System.out.println("Ingrese las " + grades + " notas del alumno.");

                        for (int i = 0; i < grades; i++) {
                            studentGrades.add(sc.nextInt());
                        }
                        sc.nextLine();
                        ss.createAndAdd(studentName, studentGrades);

                        System.out.println("");

                        System.out.println("Desea agregar otro alumno? Responda con Si/No.");
                        option = sc.nextLine();

                        while (!option.equalsIgnoreCase("si") && !option.equalsIgnoreCase("no")) {
                            System.out.println("La respuesta ingresada no es válida, intente nuevamente.");
                            option = sc.nextLine();
                        }

                    } while (option.equalsIgnoreCase("si"));
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("Lista de alumnos.");
                    for (String students : listOfStudentsAsStrings) {
                        System.out.println(students);
                    }
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("Ingrese el nombre del alumno del cual desea saber su nota final.");
                    String name = sc.nextLine();

                    if (ss.searchStudent(name)) {
                        System.out.println("La nota final de " + name + " es: " + ss.getFinalGrade(name));
                    } else {
                        System.out.println("El alumno ingresado no forma parte del curso.");
                    }

                    System.out.println("");
                    break;
                case 4:
                    System.out.println("Saliendo del Menú...");
                    exit = true;
                    break;

                default:
                    System.out.println("Error. Debe ingresar una opción válida.");
            }
        }
    }
}