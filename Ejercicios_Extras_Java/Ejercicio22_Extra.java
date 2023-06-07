package ejercicios_java;

import java.util.Scanner;

/*
Realizar un programa que rellene una matriz de tamaño NxM con valores aleatorios y
muestre la suma de sus elementos.
 */
public class Ejercicio22_Extra {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int N, M, sum =0;
        
        System.out.println("Ingrese la cantidad de filas que tendrá la matriz.");
        N = input.nextInt();
        System.out.println("Ingrese la cantidad de columnas que tendrá la matriz.");
        M = input.nextInt();
        
        System.out.println("");
        
        int [][] array = new int [N][M];
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                array[i][j] = (int) (Math.random()*10 + 1);
                sum += array[i][j];
                System.out.print("[" + array[i][j] + "]");
            }
            System.out.println("");
        }
        
        System.out.println("");
        System.out.println("La suma de todos los elementos de la matriz es: " + sum);
    }   
}