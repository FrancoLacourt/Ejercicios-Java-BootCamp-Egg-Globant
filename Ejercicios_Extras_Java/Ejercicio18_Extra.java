package ejercicios_java;

import java.util.Scanner;

/*
Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño
N, con los valores ingresados por el usuario.
 */
public class Ejercicio18_Extra {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int N, sum = 0;
        
        System.out.println("Ingrese el tamaño del vector.");
        N = input.nextInt();
        System.out.println("");
        
        int[] vector = new int [N];
        
        System.out.println("Ingrese los elementos del vector.");

        for (int i = 0; i < N; i++) {
            vector[i] = input.nextInt(); 
            sum += vector[i];
        }
        System.out.println("");
        System.out.println("La suma de todos los elementos del vector es: " + sum);
    }
}