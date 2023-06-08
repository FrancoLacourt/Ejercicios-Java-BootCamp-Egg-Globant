package ejercicios_java;

import java.util.Scanner;

/*
Realice un programa para que el usuario adivine el resultado de una multiplicación entre
dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java.
 */
public class Ejercicio10_Extra {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num1;
        int num2;
        int multiplication;
        int num;
        
        System.out.println("Debe adivinar una multiplicación entre 2 números generados aleatoriamente entre 0 y 10.");
        num1 = (int) (Math.random()*10 + 1);
        num2 = (int) (Math.random()*10 + 1);
        multiplication = num1 * num2;
        
        num = input.nextInt();
        
        while (num != multiplication) {
            System.out.println("INCORRECTO. Intente nuevamente.");
            num = input.nextInt();
        }
        
        System.out.println("CORRECTO. El número a adivinar era: " + multiplication);
    }
}