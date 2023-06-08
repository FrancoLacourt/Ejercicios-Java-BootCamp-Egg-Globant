package ejercicios_java;

import java.util.Scanner;

/*

 */
public class Ejercicio07_Extra_version_bucle_do_while {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n;
        int i = 0;
        int total = 0;
        int min = 0;
        int max = 0;
        int num;
        float average;
        
        
        System.out.println("Cuántos números desea ingresar?");
        n = input.nextInt();
        
        while (n <= 0) {
            System.out.println("La cantidad de números a ingresar debe ser mayor a cero. Ingrese una nueva cantidad.");
            n = input.nextInt();
        }
        System.out.println("");
        System.out.println("Ingrese los " + n + " números.");
        
        do {
            
            num = input.nextInt();
            
            if (i == 0) {
                max = num;
                min = num;  //De esta forma, hago que el primer número ingresado sea el máximo y mínimo. Y luego voy comparando los números que siguen entre sí.
            }
            
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
            
            total += num;
            
            i++;
        } while (i < n);
        average = (float) total/n;
        
        System.out.println("");
        System.out.println("El valor máximo ingresado fue: " + max);
        System.out.println("El valor mínimo ingresado fue: " + min);
        System.out.println("El promedio de todos los valores ingresados es: " + average);
    }  
}