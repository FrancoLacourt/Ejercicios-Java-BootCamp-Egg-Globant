
/*
Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
20.
*/

package ejercicio10arrays;

import java.util.Arrays;


public class Ejercicio10Arrays {


    public static void main(String[] args) {
        
        float [] arrayA = new float[50];
        float [] arrayB = new float[20];
        
        System.out.println("Arreglo aleatorio A:");
        fillArrayA(arrayA);
        showArray(arrayA);
        System.out.println("");
        
        System.out.println("Arreglo A ordenado de menor a mayor:");
        orderArray(arrayA);
        showArray(arrayA);
        System.out.println("");
        
        System.out.println("Arreglo B:");
        fillArrayB(arrayA, arrayB);
        showArray(arrayB);
    }
    
    public static void fillArrayA(float arrayA[]) {
        
        for (int i = 0; i < 50; i++) {
            arrayA[i] = (float) (Math.random()*10+1);
        }
    }
    
    public static void orderArray(float arrayA[]) {
        Arrays.sort(arrayA);
    }
    
    public static void fillArrayB(float arrayA[], float arrayB[]) {
        
        System.arraycopy(arrayA, 0, arrayB, 0, 10);
        
        for (int i = 10; i < 20; i++) {
            arrayB[i] = (float) 0.5;
        }
    }
    
    public static void showArray(float array[]) {
        
        for (int i = 0; i < array.length; i++) {
            System.out.print("[" + array[i] + "]");
        }
        System.out.println("");
    }
}