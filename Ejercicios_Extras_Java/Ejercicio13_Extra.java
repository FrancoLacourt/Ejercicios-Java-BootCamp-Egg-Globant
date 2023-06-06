package ejercicios_java;

import java.util.Scanner;

/*
Crear un programa que dibuje una escalera de números, donde cada línea de números
comience en uno y termine en el número de la línea. Solicitar la altura de la escalera al
usuario al comenzar. Ejemplo: si se ingresa el número 3:
1
12
123
 */
public class Ejercicio13_Extra {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num;
        
        System.out.println("Ingrese la altura de la escalera de números.");
        num = input.nextInt();
        
        System.out.println("");
        numbersLadder(num);
        System.out.println("");
    }
    public static void numbersLadder (int num) {
        for (int i = 1; i <= num; i++) {              // Uso <= para que los ciclos lleguen hasta esos valores límites.
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}