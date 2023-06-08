package ejercicios_java;

import java.util.Scanner;

/*
Escriba un programa que averigüe si dos vectores de N enteros son iguales (la
comparación deberá detenerse en cuanto se detecte alguna diferencia entre los
elementos).
 */
public class Ejercicio19_Extra {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int N;
        
        System.out.println("Ingrese el tamaño que tendrán los vectores.");
        N = input.nextInt();
        
        int [] vectorA = new int [N];
        int [] vectorB = new int [N];
        
        fillArray(vectorA,N);
        fillArray(vectorB,N);
        compareArrays(vectorA,vectorB,N);

    }
    
    public static void fillArray (int []vector, int N) {
        Scanner input = new Scanner(System.in);
        System.out.println("");
        System.out.println("Ingrese los elementos del vector.");
        for (int i = 0; i < N; i++) {
            vector[i] = input.nextInt();
        }
    }
    
    public static void compareArrays(int []vectorA, int []vectorB, int N) {
        System.out.println("");
        for (int i = 0; i < N; i++) {
            if (vectorA[i] != vectorB[i]) {
                System.out.println("Los vectores son iguales hasta la posición " + i);
                break;
            }
        }
    }   
}