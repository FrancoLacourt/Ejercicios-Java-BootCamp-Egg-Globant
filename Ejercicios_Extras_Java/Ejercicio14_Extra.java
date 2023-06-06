package ejercicios_java;

import java.util.Scanner;

/*
Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de
hijos. Escriba un programa que pida la cantidad de familias y para cada familia la cantidad
de hijos para averiguar la media de edad de los hijos de todas las familias.
 */
public class Ejercicio14_Extra {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int N, M, age, sum = 0, totalKids = 0;
        float averageAge;

        System.out.println("Ingrese la cantidad de familias.");
        N = input.nextInt();

        for (int i = 0; i < N; i++) {
            System.out.println("Ingrese cuántos hijos tiene la familia " + (i+1));
            M = input.nextInt();

            for (int j = 0; j < M; j++) {
                System.out.println("Ingrese la edad del hijo " + (j+1));
                age = input.nextInt();
                
                totalKids++;
                sum += age;
            }
        }
        
        averageAge = (float) sum/totalKids;
        
        System.out.println("La media de edad de los hijos de todas las familias es: " + averageAge);
    }
}