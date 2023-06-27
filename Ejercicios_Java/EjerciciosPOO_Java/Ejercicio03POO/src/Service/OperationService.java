
package Service;

import Entity.Operation;
import java.util.Scanner;


public class OperationService {
    
    public Operation createOperation() {    
    Scanner input = new Scanner(System.in);
    
    Operation number = new Operation();
    
        System.out.println("Ingrese el primer número.");
        number.setNumber1(input.nextInt());
        System.out.println("Ingrese el segundo número.");
        number.setNumber2(input.nextInt());
        
        return number;
    }
    
    public void addition(Operation number) {
        int num1 = number.getNumber1();
        int num2 = number.getNumber2();
        
        int sum = num1 + num2;
        
        System.out.println("El resultado de sumar " + num1 + " + " + num2 + " es: " + sum);
    }
    
    public void substract(Operation number) {
        int num1 = number.getNumber1();
        int num2 = number.getNumber2();
        
        int substraction = num1 - num2;
        
        System.out.println("El resultado de restar " + num1 + " - " + num2 + " es: " + substraction);
    }
    
    public void multiply(Operation number) {
        int num1 = number.getNumber1();
        int num2 = number.getNumber2();
        
        int multiplication = num1 * num2;
        
        if (num1 == 0 || num2 == 0) {
            multiplication = 0;
            
            System.out.println("Al estar multiplicando por 0, el resultado de la multiplicación es: " + multiplication);
        } else {
            System.out.println("El resultado de multiplicar " + num1 + " X " + num2 + " es: " + multiplication);
        }
    }
    
    public void divide(Operation number) {
        int num1 = number.getNumber1();
        int num2 = number.getNumber2();
        double division = (double) num1/num2;
        
        if (number.getNumber1() == 0 && number.getNumber2() != 0) {
            division = 0;
            System.out.println("Al ser 0 el numerador, el resultado de la división es: " + division);
        } else if (number.getNumber2() == 0) {
            System.out.println("Error, no se  puede dividir por 0");
        } else {
            System.out.println("El resultado de dividir " + num1 + " / " + num2 + " es: " + division);
        }
    }
    
}