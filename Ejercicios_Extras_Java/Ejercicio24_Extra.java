package ejercicios_java;

import java.util.Scanner;

/*
Realizar un programa que complete un vector con los N primeros números de la sucesión
de Fibonacci. Recordar que la sucesión de Fibonacci es la sucesión de los siguientes
números:
1, 1, 2, 3, 5, 8, 13, 21, 34, ...
Donde cada uno de los números se calcula sumando los dos anteriores a él. Por ejemplo:
La sucesión del número 2 se calcula sumando (1+1)
Análogamente, la sucesión del número 3 es (1+2),
Y la del 5 es (2+3),
Y así sucesivamente...
La sucesión de Fibonacci se puede formalizar de acuerdo a la siguiente fórmula:
Fibonaccin = Fibonaccin-1 + Fibonaccin-2 para todo n>1
Fibonaccin = 1 para todo n<=1
Por lo tanto, si queremos calcular el término “n” debemos escribir una función que reciba
como parámetro el valor de “n” y que calcule la serie hasta llegar a ese valor.
 */
public class Ejercicio24_Extra {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;

        System.out.println("Ingrese hasta que posición le gustaría ver la serie de Fibonacci.");
        num = input.nextInt();
        System.out.println("");

        int[] vector = new int[num];

        fibonacci(vector, num);
        showVector(vector, num);
    }

    public static void fibonacci(int vector[], int num) {

        int var = 0;
        int num1 = 1;
        int num2;

        for (int i = 0; i < num; i++) {
            num2 = var + num1;
            num1 = var;
            var = num2;
            vector[i] = num2;
        }
    }

    public static void showVector(int vector[], int num) {
        System.out.print("(");
        for (int i = 0; i < num; i++) {

            if (i == num - 1) {
                System.out.println(vector[i] + ")");
            } else {
                System.out.print(vector[i] + ", ");
            }
        }
    }
}
//El ejercicio está resuelto teniendo en cuenta que los dos primeros términos son 1. Como muestra en el enunciado.
//Aclaro porque en algunas páginas, muestran que el segundo término ya es 2.