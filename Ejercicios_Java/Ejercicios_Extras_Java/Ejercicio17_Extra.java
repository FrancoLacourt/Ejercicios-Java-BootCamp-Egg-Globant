package ejercicios_java;

import java.util.Scanner;

/*
Crea una aplicación que nos pida un número por teclado y con una función se lo pasamos
por parámetro para que nos indique si es o no un número primo, debe devolver true si es
primo, sino false.
Un número primo es aquel solo puede dividirse entre 1 y si mismo. Por ejemplo: 25 no es
primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.
¿Qué son los números primos?
Básicamente, un número primo es un número natural que tiene solo dos divisores o
factores: 1 y el mismo número. Es decir, es primo aquel número que se puede dividir por
uno y por el mismo número.
El primer número primo es 2, y hay 25 números primos entre 1 y 100, ellos son: 2, 3, 5, 7, 11,
13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89 y 97.
 */
public class Ejercicio17_Extra {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num;

        System.out.println("Ingrese un número primo.");
        num = input.nextInt();

        if (primeNumber(num)) {
            System.out.println("El número ingresado SI es primo.");
        } else {
            System.out.println("El número ingresado NO es primo.");
        }
    }
    public static boolean primeNumber(int num) {
        int isPrime = 0;
        for (int i = 2; i <= (num / 2); i++) {   //Recorro desde 2 hasta el número/2. Ya que por encima del número/2, ya que ese es el valor
            if (num % i == 0) {                  //límite en el que un número puede encontrar dividendos.
                isPrime = 1;
            }
        }
        if (num == 1 || num == 0) {
            isPrime = 1;
        }
        return (isPrime == 0);
    }
}