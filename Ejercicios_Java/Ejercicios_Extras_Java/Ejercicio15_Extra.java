package ejercicios_java;

import java.util.Scanner;

/*
Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar,
restar, multiplicar y dividir. La aplicación debe tener una función para cada operación
matemática y deben devolver sus resultados para imprimirlos en el main.
 */
public class Ejercicio15_Extra {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int rtaMenu;
        int num1;
        int num2;
        int answer;

        System.out.println("Ingrese los 2 números con los cuales desea trabajar.");
        num1 = input.nextInt();
        num2 = input.nextInt();

        System.out.println("");

         do {
             System.out.println("");
            System.out.println("MENU");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("Elija opción:");

            answer = input.nextInt();

            switch (answer) {
                case 1:
                    System.out.println("El resultado de sumar " + num1 + " + " + num2 + " es: " + sum(num1,num2));
                    break;
                case 2:
                    System.out.println("El resultado de restar " + num1 + " - " + num2 + " es: " + subtraction(num1, num2));
                    break;
                case 3:
                    System.out.println("El resultado de multiplicar " + num1 + " X " + num2 + " es: " + multiplication(num1, num2));
                    break;
                case 4:
                    System.out.println("El resultado de dividir " + num1 + " / " + num2 + " es: " + division(num1, num2));
                    break;
                case 5:
                    System.out.println("Saliendo del MENU...");
                    break;
                default:
                    System.out.println("La opción ingresada no es válida. Ingrese una nueva opción.");
            }
        } while (answer != 5);
    }
    
    public static int sum(int num1, int num2) {
        
        return num1 + num2;
    }

    public static int subtraction(int num1, int num2) {
        
        return num1 - num2;
    }

    public static int multiplication(int num1, int num2) {
        
        return num1 * num2;
        
    }

    public static float division(int num1, int num2) {
        
        return (float) num1/num2;   
    }
}