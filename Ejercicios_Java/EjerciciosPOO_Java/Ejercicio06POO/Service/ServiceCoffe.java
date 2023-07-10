
package Service;

import Entity.CoffeMaker;
import java.util.Scanner;


public class ServiceCoffe {
    
    CoffeMaker c1 = new CoffeMaker();
    
    public CoffeMaker createCoffeMaker () {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese la capacidad máxima que tendrá la cafetera (en ml).");
        c1.setMaxCapacity(input.nextInt());
        
        return c1;
    }
    
    public void fillCoffeMaker () {
        c1.setCurrentAmount(c1.getMaxCapacity());
    }
    
    public void serveCup () {
        Scanner input = new Scanner(System.in);
        int coffe;
        
        System.out.println("Ingrese cuánto café quiere servir en la taza vacía.");
        coffe = input.nextInt();
        
        if (coffe > c1.getCurrentAmount()) {
            System.out.print("La cantidad de café no alcanzó para llenar la taza.");
            System.out.println(" La taza quedó en " + c1.getCurrentAmount() + "ml");
            c1.setCurrentAmount(0);
        } else {
            System.out.println("La taza se ha llenado con la cantidad solicitada.");
            c1.setCurrentAmount(c1.getCurrentAmount()-coffe);
        }
    }
    
    public void emptyCoffeMaker () {
        c1.setCurrentAmount(0);
    }
    
    public void checkCurrentAmount () {
        System.out.println("Actualmente hay " + c1.getCurrentAmount() + "ml en la cafetera.");
    }
    
    public void addCoffe () {
        Scanner input = new Scanner(System.in);
        int addedCoffe;
        
        System.out.println("Ingrese cuánto café le quiere agregar a la cafetera (en ml).");
        addedCoffe = input.nextInt();
        
        if ((c1.getCurrentAmount() + addedCoffe) > c1.getMaxCapacity() ) {
            c1.setCurrentAmount(c1.getMaxCapacity());
        } else {
            c1.setCurrentAmount(c1.getCurrentAmount() + addedCoffe);
        }
    }
}