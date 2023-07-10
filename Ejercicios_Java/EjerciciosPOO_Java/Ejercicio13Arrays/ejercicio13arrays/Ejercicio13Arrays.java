/*
Un profesor particular está dando cursos para grupos de cinco alumnos y necesita un
programa para organizar la información de cada curso. Para ello, crearemos una clase
entidad llamada Curso, cuyos atributos serán: nombreCurso, cantidadHorasPorDia,
cantidadDiasPorSemana, turno (mañana o tarde), precioPorHora y alumnos. Donde
alumnos es un arreglo de tipo String de dimensión 5 (cinco), donde se alojarán los
nombres de cada alumno. A continuación, se implementarán los siguientes métodos:
 Un constructor por defecto.
 Un constructor con todos los atributos como parámetro.
 Métodos getters y setters de cada atributo.
 método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos
que asisten a las clases. Nosotros nos encargaremos de almacenar esta información
en un arreglo e iterar con un bucle, solicitando en cada repetición que se ingrese el
nombre de cada alumno.
 Método crearCurso(): el método crear curso, le pide los valores de los atributos al
usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Curso. En este método invocaremos al método cargarAlumnos() para asignarle valor
al atributo alumnos
 Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia
en una semana por curso. Para ello, se deben multiplicar la cantidad de horas por
día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que
se repite el encuentro.
*/
package ejercicio13arrays;

import Service.CourseService;
import java.util.Scanner;

public class Ejercicio13Arrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        int option;
        
        CourseService cs = new CourseService();
        cs.createCourse();
        
        while (!exit) {
            System.out.println("1. Mostrar ganancia semanal");
            System.out.println("2. Mostrar nombres de los estudiantes");
            System.out.println("3. Salir del menú.");
            System.out.println("");
            
            System.out.println("Ingrese la opción que desee.");
            option = sc.nextInt();
            
            switch (option) {
                case 1:
                    cs.calculateWeeklyEarnings();
                    System.out.println("");
                    break;
                case 2:
                    cs.showStudents();
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("Saliendo del menú...");
                    exit = true;
                    break;
            }
        }
    }
}