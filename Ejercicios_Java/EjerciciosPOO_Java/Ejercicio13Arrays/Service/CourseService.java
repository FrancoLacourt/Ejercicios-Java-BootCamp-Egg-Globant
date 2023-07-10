
package Service;

import Entity.Course;
import java.util.Arrays;
import java.util.Scanner;

public class CourseService {
    
    Course course = new Course();
    
    public void loadStudents() {
        Scanner sc = new Scanner(System.in);
        String[] students = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el nombre del estudiante " + (i+1));
            students[i] = sc.nextLine();
        }
        course.setStudents(students);
    }
    
    public Course createCourse() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre del curso.");
        course.setCourseName(sc.nextLine());
        System.out.println("Ingrese la cantidad de horas por día que enseña en este curso.");
        course.setHoursPerDay(sc.nextInt());
        System.out.println("Ingrese la cantidad de días por semana que enseña en este curso.");
        course.setDaysPerWeek(sc.nextInt());
        
        System.out.println("Ingrese en qué curso enseña.");
        System.out.println("1. Mañana.");
        System.out.println("2. Tarde.");
        int option = sc.nextInt();
        while (option != 1 && option != 2) {
            System.out.println("La opción ingresada no es válida.");
            System.out.println("Ingrese 1 para turno Mañana ó 2 para turno Tarde.");
            option = sc.nextInt();
        }
        
        System.out.println("Ingrese cuál es el precio por hora.");
        course.setPricePerHour(sc.nextInt());
        
        loadStudents();
        
        return course;
    }
    
    public void calculateWeeklyEarnings() {
        double weeklyEarnings;
        
        weeklyEarnings = (course.getHoursPerDay() * course.getPricePerHour() * 5 * course.getDaysPerWeek());
        System.out.println("La ganancia semanal en este curso es de: $" + weeklyEarnings);
    }
    
    public void showStudents() {
        System.out.println("Los 5 alumnos son:");
        System.out.println(Arrays.toString(course.getStudents()));
    }
}