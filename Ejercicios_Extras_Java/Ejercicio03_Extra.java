package ejercicios_java;

import java.util.Scanner;

/*  Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.    
    Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.
*/

public class Ejercicio03_Extra {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String letra;
        
        System.out.println("Ingrese una letra, y el sistema le dirá si se trata de una vocal o no.");
        letra = input.nextLine();
        
        while (letra.length() > 1) {
            System.out.println("Se ha ingresado más de 1 caracter. Debe ingresar una sola letra. Intente de nuevo.");
            letra = input.nextLine();
        }
        
        if (!"a".equalsIgnoreCase(letra) && !"e".equalsIgnoreCase(letra) && !"i".equalsIgnoreCase(letra) && !"o".equalsIgnoreCase(letra) && !"u".equalsIgnoreCase(letra)) {
            System.out.println("La letra ingresada NO es una vocal.");
        } else {
            System.out.println("La letra ingresada SI es una vocal.");
        }
    }
}