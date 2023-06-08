package ejercicios_java;

import java.util.Scanner;

/*
Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por
debajo de 1.60 mts. y el promedio de estaturas en general.
 */
public class Ejercicio06_Extra {

    public static void main(String[] args) {
        int N;
        float sumaAlturas = 0;
        float sumaBajitos = 0;
        int cantidadBajitos = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de alturas que va a registrar.");
        N = input.nextInt();
        
        while (N <= 0) {
            System.out.println("La cantidad de alturas que se van a registrar debe ser mayor a cero. Ingrese una cantidad nuevamente.");
            N = input.nextInt();
        }

        System.out.println("Ingrese la altura de las " + N + " personas.");
        

        float[] alturas = new float[N];
        for (int i = 0; i < N; i++) {

            alturas[i] = input.nextFloat();

            sumaAlturas += alturas[i];

            if (alturas[i] < 1.60) {
                cantidadBajitos++;
                sumaBajitos += alturas[i];
            }
        }

        System.out.println("");

        mostrarVector(alturas, N);
        
        System.out.println("");

        if (cantidadBajitos == 0) {
            System.out.println("Ninguna de las alturas registradas es menor a 1.60 mts.");
        } else {
            System.out.println("El promedio de estaturas que se encuentran por debajo de 1.60 mts es: " + sumaBajitos/cantidadBajitos);
        }
        System.out.println("");
        System.out.println("El promedio de estaturas en general es: " + sumaAlturas/N);
        System.out.println("");

    }

    public static void mostrarVector(float[] alturas, int N) {
        for (int i = 0; i < N; i++) {
            System.out.print("[" + alturas[i] + "]");
        }
        System.out.println("");
    }

}