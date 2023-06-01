
package ejercicios_java;

import java.util.Scanner;

public class Ejercicio1_Extra {

    /*Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
    usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
    */
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int minutos;
        int dias;
        int horas;
        
        System.out.println("Ingrese la cantidad de minutos que desea pasar a horas y días.");
        minutos = input.nextInt();
        
        dias = minutos/1440;
        horas = (minutos - dias*1440 )/60;
        
        System.out.println("La cantidad de minutos ingresada equivale a " + dias + " días y " + horas + " horas");
        
    }
    
}
