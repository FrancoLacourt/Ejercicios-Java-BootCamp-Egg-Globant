
package Service;

import Entity.Circumference;
import java.util.Scanner;


public class CircumferenceService {
    
    Scanner input = new Scanner(System.in);
    
    public Circumference createCircumference() {
        Circumference c1 = new Circumference();
        
        System.out.println("Ingrese el radio de la circunferencia");
        c1.setRadius(input.nextDouble());
        
        return c1;
    }
    
    public void area(Circumference c1) {
        //Math.pow me devuelve la base x elevada a la potencia y.
        double area = ((Math.PI)*(Math.pow(c1.getRadius(), 2)));
        
        System.out.println("El área de la circunferencia es: " + area);
    }
    
    public void perimetro(Circumference c1) {
        double perimetro = 2*(Math.PI)*c1.getRadius();
        
        System.out.println("El perímetro de la circunferencia es: " + perimetro);
    }


    
}
