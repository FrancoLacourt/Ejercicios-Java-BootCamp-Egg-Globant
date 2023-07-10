package Service;

import Entity.Person;
import java.util.Date;
import java.util.Scanner;

public class PersonService {
    
    Person p1 = new Person();

    public Person createPerson() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese su nombre por favor.");
        p1.setName(sc.nextLine());

        System.out.println("Ingrese su fecha de nacimiento por favor.");
        System.out.println("Día:");
        int day = sc.nextInt();
        System.out.println("Mes:");
        int month = sc.nextInt() - 1;
        System.out.println("Año:");
        int year = sc.nextInt() - 1900;

        //Con esto creo la fecha.
        Date birthdate = new Date(year, month, day);
        p1.setBirthdate(birthdate);
        
        return p1;
    }
    
    public void calculateAge() {
        //Fecha actual:
        Date fechaActual = new Date();
        int currentAge;
        
        currentAge = (fechaActual.getYear() - (p1.getBirthdate()).getYear());
        p1.setCurrentAge(currentAge);
        System.out.println("La edad de la persona es: " + currentAge + " años");
    }
    
    public boolean youngerThan(int newAge) {
        Scanner sc = new Scanner(System.in);
        
        return (p1.getCurrentAge() < newAge);
    }
    
    public void showPerson() {
        System.out.println("Nombre: " + p1.getName());
        System.out.println("Fecha de nacimiento: " + p1.getBirthdate());
    }
}