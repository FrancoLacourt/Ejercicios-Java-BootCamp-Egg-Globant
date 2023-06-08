package ejercicios_java;

import java.util.Scanner;

/*
Los profesores del curso de programación de Egg necesitan llevar un registro de las notas
adquiridas por sus 10 alumnos para luego obtener una cantidad de aprobados y
desaprobados. Durante el periodo de cursado cada alumno obtiene 4 notas, 2 por trabajos
prácticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final del
programa los profesores necesitan obtener por pantalla la cantidad de aprobados y
desaprobados, teniendo en cuenta que solo aprueban los alumnos con promedio mayor o
igual al 7 de sus notas del curso.
 */
public class Ejercicio21_Extra {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        float firstTP, secondTP, firstFinalExam, secondFinalExam, finalGrade;
        int passed = 0, notPassed = 0;
        
        for (int i = 0; i < 10; i++) {
            
            System.out.println("Ingrese la nota del primer trabajo práctico evaluativo del alumno " + (i+1));
            firstTP = input.nextInt();
            System.out.println("Ingrese la nota del segundo trabajo práctico evaluativo.");
            secondTP = input.nextInt();
            System.out.println("Ingrese la nota del primer integrador.");
            firstFinalExam = input.nextInt();
            System.out.println("Ingrese la nota del segundo integrador.");
            secondFinalExam = input.nextInt();
            
            finalGrade = (float) (0.1*firstTP + 0.15*secondTP + 0.25*firstFinalExam + 0.5*secondFinalExam);
            
            if (finalGrade >= 7) {
                passed++;
            } else {
                notPassed++;
            }
        }
        
        System.out.println("De los 10 alumnos, " + passed + " aprobaron y " + notPassed + " reprobaron.");
    }
}