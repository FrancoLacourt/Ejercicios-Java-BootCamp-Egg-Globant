/*
Implemente la clase Persona. Una persona tiene un nombre y una fecha de nacimiento
(Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los siguientes
métodos:
 Agregar un método de creación del objeto que respete la siguiente forma:
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al
usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
 Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
en cuenta que para conocer la edad de la persona también se debe conocer la fecha
actual.
 Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
edad y retorna true en caso de que el receptor tenga menor edad que la persona que
se recibe como parámetro, o false en caso contrario.
 Metodo mostrarPersona(): este método muestra la persona creada en el método
anterior.
*/
package ejercicio12clasedate;

import Service.PersonService;
import java.util.Scanner;

public class Ejercicio12ClaseDate {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        PersonService ps = new PersonService();
        ps.createPerson();
        System.out.println("");
        
        ps.calculateAge();
        System.out.println("");
        
        System.out.println("Ingrese la edad de la nueva persona:");
        int newAge = sc.nextInt();
        if (ps.youngerThan(newAge)) {
            System.out.println("La nueva persona es mayor que la persona original");
        } else {
            System.out.println("La nueva persona es menor que la persona original");
        }
        System.out.println("");
        
        ps.showPerson();
    }
}