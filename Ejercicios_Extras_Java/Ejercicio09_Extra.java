package ejercicios_java;

import java.util.Scanner;

/*
Simular la división usando solamente restas. Dados dos números enteros mayores que
uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. Método:
Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, este
resultado es el residuo, y el número de restas realizadas es el cociente.
Por ejemplo: 50 / 13:
50 – 13 = 37 una resta realizada
37 – 13 = 24 dos restas realizadas
24 – 13 = 11 tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
 */
public class Ejercicio09_Extra {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int divisor;
        int dividend;
        int remainder;
        int subtractions = 0;
        
        System.out.println("Ingrese los dos números que va a utilizar para el método de restas sucesivas.");
        divisor = input.nextInt();
        dividend = input.nextInt();
        
        while (divisor <= 1 || dividend <= 1) {
            System.out.println("Ambos números deben ser mayores a 1. Ingrese los números nuevamente.");
            divisor = input.nextInt();
            dividend = input.nextInt();
        }
        
        remainder = divisor;
        
        System.out.println("");
        while (remainder >= dividend) {
            
            subtractions++;
            
            remainder -= dividend;
            
            System.out.println(divisor + " - " + dividend + " = " + remainder + " " + subtractions + " restas realizadas.");
            
        } 
        System.out.println("");
        System.out.println("Dado que " + remainder + " es menor que " + dividend + ", entonces: El residuo es " + remainder + " y el cociente es " + subtractions);

    }
}