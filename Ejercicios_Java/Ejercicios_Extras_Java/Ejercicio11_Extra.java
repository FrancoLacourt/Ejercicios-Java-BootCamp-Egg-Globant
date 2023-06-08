package ejercicios_java;

import java.util.Scanner;

/*
Escribir un programa que lea un número entero y devuelva el número de dígitos que
componen ese número. Por ejemplo, si introducimos el número 12345, el programa
deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el operador
de división. Nota: recordar que las variables de tipo entero truncan los números o
resultados.
 */
public class Ejercicio11_Extra {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int originalNumber;
        int num;
        int digits = 0;

        System.out.println("Ingrese el número del cual desea saber su cantidad de dígitos.");
        num = input.nextInt();
        originalNumber = num;

        if (num == 0) {
            digits = 1;

        } else {

            while (num >= 1 || num <= -1) { //Puse el -1 para que también pueda contar los dígitos de los números negativos.
                num /= 10;
                digits++;
            }
        }
        System.out.println("La cantidad de dígitos que componen al número " + originalNumber + " es: " + digits);
    }
}
//En lugar de usar int, podria usar long, por si llega a ser un número de más de 10 dígitos. Pero no lo creo necesario para este caso.