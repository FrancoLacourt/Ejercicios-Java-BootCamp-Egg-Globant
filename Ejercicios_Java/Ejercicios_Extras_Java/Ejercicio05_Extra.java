package ejercicios_java;

import java.util.Scanner;

/*
Una obra social tiene tres clases de socios:
o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
todos los tipos de tratamientos.
o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para
los mismos tratamientos que los socios del tipo A.
o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
tratamientos.
o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
real que represente el costo del tratamiento (previo al descuento) y determine el
importe en efectivo a pagar por dicho socio.
 */
public class Ejercicio05_Extra {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        menu();
    }

    public static void menu() {
        Scanner input = new Scanner(System.in);
        String rta;
        float costo;

        do {
            System.out.println("Ingrese qué tipo de socio es: (A, B ó C)");
            System.out.println("A) Abona una cuota mayor.");
            System.out.println("B) Abona una cuota moderada.");
            System.out.println("C) Abona una cuota menor.");
            System.out.println("Oprima (S) si desea salir del menú.");
            rta = input.nextLine();

            if ("A".equalsIgnoreCase(rta) || "B".equalsIgnoreCase(rta) || "C".equalsIgnoreCase(rta)) {
                System.out.println("Ingrese el costo del tratamiento");
                costo = input.nextInt();
                input.nextLine();  // Esto lo puse para que me lea el próximo inputLine y no lo pase de largo.

                while (costo <= 0) {
                    System.out.println("El costo del tratamiento debe ser mayor a 0. Ingrese el costo nuevamente.");
                    costo = input.nextInt();
                    input.nextLine(); // Esto lo puse para que me lea el próximo inputLine y no lo pase de largo.
                }

                switch (rta.toUpperCase()) {
                    case "A":
                        System.out.println("El total a pagar, luego del descuento aplicado por ser socio tipo `A` es: " + "$" + costo * 0.5);
                        break;
                    case "B":
                        System.out.println("El total a pagar, luego del descuento aplicado por ser socio tipo `B` es: " + "$" + (costo - costo * 0.35));
                        break;
                    case "C":
                        System.out.println("Debido a que es socio tipo `C` no se le aplica ningún descuento. Por lo que el total a pagar sigue siendo: " + "$" + costo);
                        break;
                }
            } else {
                switch (rta.toUpperCase()) {
                    case "S":
                        System.out.println("Presione ENTER para salir del menú");
                        input.nextLine();
                        System.out.println("Saliendo del menú...");
                        break;
                    default:
                        System.out.println("La opción ingresada no es válida. Ingrese una opción nuevamente.");
                }
            }
            
            System.out.println("");

        } while (!"S".equalsIgnoreCase(rta));

    }
}

/*
Soy consciente de que el ejercicio no pedía algo tan completo. Simplemente lo hice así para practicar.
*/
