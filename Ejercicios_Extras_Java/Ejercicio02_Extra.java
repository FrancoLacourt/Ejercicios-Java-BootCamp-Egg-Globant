package ejercicios_java;

import java.util.Scanner;

/*  Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
    una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C
    tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
    iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
*/

public class Ejercicio02_Extra {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int A;
        int B;
        int C;
        int D;
        int aux;
        
        A = 1;
        B = 2;
        C = 3;
        D = 4;
        
        System.out.println("El valor de A es: " + A);
        System.out.println("El valor de B es: " + B);
        System.out.println("El valor de C es: " + C);
        System.out.println("El valor de D es: " + D);
        
        System.out.println("");
        aux = B;
        B = C;
        C = A;
        A = D;
        D = aux;

        System.out.println("El nuevo valor de A es: " + A);
        System.out.println("El nuevo valor de B es: " + B);
        System.out.println("El nuevo valor de C es: " + C);
        System.out.println("El nuevo valor de D es: " + D);
    }
}