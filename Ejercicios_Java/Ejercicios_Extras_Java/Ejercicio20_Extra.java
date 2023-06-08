package ejercicios_java;

import java.util.Random;
import java.util.Scanner;

/*
Crear una función rellene un vector con números aleatorios, pasándole un arreglo por
parámetro. Después haremos otra función o procedimiento que imprima el vector.
 */
public class Ejercicio20_Extra {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int N;
        
        System.out.println("Ingrese el tamaño del vector.");
        N = input.nextInt();
        
        int vector[] = new int [N];
        
        System.out.println("");
        llenarVector(vector,N);
        System.out.println("El vector rellenado con números aleatorios es: ");
        mostrarVector(vector, N);
        System.out.println("");

    }
    
    public static void llenarVector(int vector[], int N) {
        
        Random fill = new Random();
        
        for (int i = 0; i < N; i++) {
            vector[i] = fill.nextInt(11);  //Este Random me gusta más que el Math.Random(). Este es más claro con respecto a los rangos.
        }                                  //Va desde 0(incluído) hasta el valor especificado(excluído).
    }
    
    public static void mostrarVector(int vector[],int N) {
        for (int i = 0; i < N; i++) {
            System.out.print("[" + vector[i] + "]");
        }
    } 
}