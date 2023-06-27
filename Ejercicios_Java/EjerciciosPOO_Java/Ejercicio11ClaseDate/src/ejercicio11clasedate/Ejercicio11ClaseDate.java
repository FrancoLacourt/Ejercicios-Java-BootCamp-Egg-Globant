/*
En este ejercicio deberemos instanciar en el main, una fecha usando la clase
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que
se puede conseguir instanciando un objeto Date con constructor vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
*/
package ejercicio11clasedate;

import java.util.Date;
import java.util.Scanner;


public class Ejercicio11ClaseDate {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int day,month,year;
        
        System.out.println("Ingrese el día de la fecha que desee.");
        day = sc.nextInt();
        System.out.println("Ingrese el mes.");
        month = sc.nextInt() - 1;
        System.out.println("Ingrese el año.");
        year = sc.nextInt() - 1900;
        
        //Con esto creo la fecha.
        Date fecha = new Date(year,month,day);
        
        //Con esto pongo la fecha actual.
        Date fechaActual = new Date();
        System.out.println("");
        
        System.out.println("La fecha ingresada es: " + fecha.toString());
        System.out.println("La fecha de hoy es: " + fechaActual.toString());
        System.out.println("");
        
        if (fechaActual.compareTo(fecha) > 0) {
            System.out.println("La fecha ingresada fue hace " + (fechaActual.getYear() - fecha.getYear()) + " años.");
        } else if (fechaActual.compareTo(fecha) < 0) {
            System.out.println("Faltan " + (fecha.getYear() - fechaActual.getYear()) + " años para la fecha ingresada.");
        } else {
            System.out.println("La fecha ingresada es en el mismo año que la fecha actual.");
        }       
    }   
}