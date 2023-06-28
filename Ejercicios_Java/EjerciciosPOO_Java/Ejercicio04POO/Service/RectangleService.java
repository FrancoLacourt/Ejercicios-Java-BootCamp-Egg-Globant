
package Service;

import Entity.Rectangle;
import java.util.Scanner;


public class RectangleService {
    
    
    public Rectangle createRectangle() {
        Scanner input = new Scanner(System.in);
        
        Rectangle r1 = new Rectangle();
        
        System.out.println("Ingrese la base del rectángulo.");
        r1.setBase(input.nextInt());
        System.out.println("Ingrese la altura del rectángulo.");
        r1.setHeight(input.nextInt());
        
        return r1;
    }
    
    public void area(Rectangle r1) {
        int base = r1.getBase();
        int height = r1.getHeight();
        
        System.out.println("La superficie del rectángulo es: " + (base*height));
    } 
    
    public void perimeter(Rectangle r1) {
        int base = r1.getBase();
        int height = r1.getHeight();
        
        System.out.println("El perímetro del rectángulo es: " + ((2*base)+(2*height)));
    }
    
    public void drawRectangle(Rectangle r1) {
        int base = r1.getBase();
        int height = r1.getHeight();
        
        System.out.println("El rectángulo ingresado se ve así:");
        
        for (int i = 0; i < height; i++) {

            for (int j = 0; j < base; j++) {
                if (i == 0 || j == 0 || j == base-1 || i == height - 1) {
                    System.out.print("* ");

                } else {
                    System.out.print("  "); // Dejo 2 espacios porque uno corresponde al espacio que dejo de normal entre asterisco y asterisco, y otro que reemplaza
                    // al asterisco que iría en su lugar.
                }
            }
            System.out.println("");
        }
    }
}
