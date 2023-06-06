package ejercicios_java;

import java.util.Scanner;

/*
Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-0-
0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E.
Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
0-1-2
0-1-E
Nota: investigar función equals() y como convertir números a String.
 */
public class Ejercicio12_Extra {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String digits = "";

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    digits = ""; //Acá lo inicializo de nuevo, para que en el nuevo ciclo, esté vacío.
                    digits = digits.concat(replaceThree(i) + "-");
                    digits = digits.concat(replaceThree(j) + "-");
                    digits = digits.concat(replaceThree(k));
                    System.out.println(digits);
                }
            }
        }
    }
    
    public static String replaceThree(int digit) {
        if (digit == 3) {
            return "E";
        } else {
            return Integer.toString(digit);
        }
    }
}
//Otra opción que se me ocurre sería imprimiendo algo en específico en los momentos donde i, j, o k sean 3.
//Pero lo hice así para usar la función de pasar enteros a string.