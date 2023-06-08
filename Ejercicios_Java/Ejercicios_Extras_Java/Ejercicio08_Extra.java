package ejercicios_java;

import java.util.Scanner;

/*
Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares y
la cantidad de números impares. Al igual que en el ejercicio anterior los números
negativos no deben sumarse. Nota: recordar el uso de la sentencia break.
 */
public class Ejercicio08_Extra {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num;
        int total = 0;
        int even = 0;
        int odd = 0;

        System.out.print("Ingrese los números enteros que desee. Cuando ingrese un número que sea múltiplo de 5, ");   //Lo puse en 2 renglones para que no quede tan largo.
        System.out.println("no podrá ingresar más.");
        do {
            num = input.nextInt();
            if (num > 0 && (num % 5) != 0) { //De esta forma NO se contempla el número que se usa para cortar la cadena. Tampoco el 0.
                                             //Ya que quise tener en cuenta únicamente los múltiplos de 5 distintos de 0.
                if (num % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
                total++;
            }

        } while (num % 5 != 0);

        System.out.println("La cantidad de números pares ingresados fue: " + even);
        System.out.println("La cantidad de números impares ingresados fue: " + odd);
        System.out.println("La cantidad de números totales ingresados fue: " + total);
    }
}
//El ejercicio decía de recordar la sentencia break, pero a mi se me ocurrió hacerlo con el bucle While.