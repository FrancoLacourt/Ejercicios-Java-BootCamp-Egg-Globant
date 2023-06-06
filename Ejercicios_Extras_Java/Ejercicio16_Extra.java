package ejercicios_java;

import java.util.Scanner;

/*
Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de
las personas ingresadas por teclado e indique si son mayores o menores de edad.
Después de cada persona, el programa debe preguntarle al usuario si quiere seguir
mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
 */
public class Ejercicio16_Extra {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        int age, peopleNumber = 0;
        String name, answer;
        
        do {
            peopleNumber++;
            System.out.println("Ingrese el nombre y la edad de la persona " + peopleNumber);
            name = input.nextLine();
            age = input.nextInt();
            input.nextLine();
            
            while (age <= 0) {
                System.out.println("La edad ingresada debe ser mayor a 0. Ingrese la edad nuevamente.");
                age = input.nextInt();
                input.nextLine();
            }
            
            System.out.println("");
            if (age < 18) {
                System.out.println(name + ", " + age + " años. " + "Menor de edad.");
            } else {
                System.out.println(name + ", " + age + " años. " + "Mayor de edad.");
            }
            
            System.out.println("");
            
            System.out.println("Responda (No) si NO desea mostrar más personas. Presione ENTER si desea continuar");
            answer = input.nextLine();
            
            while (!"".equals(answer) && !"No".equalsIgnoreCase(answer)) {
                System.out.println("ERROR. Solo puede ingresar ENTER ó (No).");
                answer = input.nextLine();
            }
            
            
        } while (!"No".equalsIgnoreCase(answer));
    }
}