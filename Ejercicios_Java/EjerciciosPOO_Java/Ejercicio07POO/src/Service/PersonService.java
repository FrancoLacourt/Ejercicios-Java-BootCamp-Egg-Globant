
package Service;

import Entity.Person;
import java.util.Scanner;


public class PersonService {
    
    public Person createPerson() {
        Scanner input = new Scanner (System.in).useDelimiter("\n");
        String answer;
        
        Person p1 = new Person ();
        
        
        System.out.println("Ingrese el nombre de la persona.");
        p1.setName(input.nextLine());
        System.out.println("Ingrese la edad de la persona.");
        p1.setAge(input.nextInt());
        System.out.println("Ingrese el género de la persona.");
        System.out.println("H. Hombre.");
        System.out.println("M. Mujer.");
        System.out.println("O. Otro.");
        input.nextLine();
        answer = input.nextLine();
        
        while (!answer.equalsIgnoreCase("H") && !answer.equalsIgnoreCase("M") && !answer.equalsIgnoreCase("O")) {
            System.out.println("La respuesta ingresada no es correcta. Intente nuevamente.");
            answer = input.nextLine();
        } 
        p1.setGender(answer);
        
        System.out.println("Ingrese el peso de la persona (en kg).");
        p1.setWeight(input.nextDouble());
        System.out.println("Ingrese la altura de la persona (en mts).");
        p1.setHeight(input.nextDouble());
        
        return p1;
    }
    
    public int calculateBmi(Person p1) {
        double weight = p1.getWeight();
        double height = p1.getHeight();
        double result = (weight/(Math.pow(height, 2)));
        
        if (result < 20) {
            p1.setBelowIdealWeight((p1.getBelowIdealWeight()+1));
            return -1;
        } else if (result >= 20 && result <= 25) {
            p1.setIdealWeight((p1.getIdealWeight()+1));
            return 0;
        } else {
            p1.setAboveIdealWeight((p1.getAboveIdealWeight()+1));
            return 1;
        }
    }
    
    public boolean legalAge (Person p1) {
       if (p1.getAge() >= 18) {
           p1.setLegalAgePerson((p1.getLegalAgePerson()+1));
       }
        return p1.getAge() >= 18;   
    }
    
    public int checkBelowWeight(Person p1) {
        return p1.getBelowIdealWeight();
    }
    
    public int checkIdealWeight(Person p1) {
        return p1.getIdealWeight();
    }
    
    public int checkAboveWeight(Person p1) {
        return p1.getAboveIdealWeight();
    }
    
    public int checkLegalAge(Person p1) {
        return p1.getLegalAgePerson();
    }
    
}