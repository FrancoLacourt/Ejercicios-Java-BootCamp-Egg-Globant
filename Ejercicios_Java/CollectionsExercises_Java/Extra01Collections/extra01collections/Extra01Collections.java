/*
Diseñar un programa que lea una serie de valores numéricos enteros desde el teclado y
los guarde en un ArrayList de tipo Integer. La lectura de números termina cuando se
introduzca el valor -99. Este valor no se guarda en el ArrayList. A continuación, el
programa mostrará por pantalla el número de valores que se han leído, su suma y su
media (promedio).
*/
package extra01collections;

import Services.NumberService;
import java.util.ArrayList;
import java.util.Scanner;

public class Extra01Collections {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        NumberService ns = new NumberService();
        ArrayList<Integer> numbers = ns.getListOfNumbers();
        Integer number;
        
        System.out.println("Add numbers to the list. If you want to stop adding numbers, enter the number -99");
        do {
            number = sc.nextInt();
            
            if (number == -99) {
                break;
            } else {
                ns.createAndAdd(number);
            }
        } while (number != -99);
        System.out.println("");
        
        System.out.println(ns.listSize() + " numbers have been added.");
        System.out.println(numbers);
        System.out.println("");
        
        System.out.println("The sum of all numbers is: " + ns.sum());
        System.out.println("");
        
        System.out.println("The average of all numbers is: " + ((double)ns.sum()/ns.listSize()));
    }   
}