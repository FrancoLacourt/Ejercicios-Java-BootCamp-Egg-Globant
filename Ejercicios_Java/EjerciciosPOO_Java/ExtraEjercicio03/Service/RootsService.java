
package Service;

import Entity.Roots;
import java.util.Scanner;

public class RootsService {
    
    Roots coef = new Roots();
    
    public Roots loadCoefficients() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el valor del coeficiente `a`.");
        coef.setA(sc.nextDouble());
        System.out.println("Ingrese el valor del coeficiente `b`.");
        coef.setB(sc.nextDouble());
        System.out.println("Ingrese el valor del coeficiente `c`.");
        coef.setC(sc.nextDouble());
        
        return coef;
    }
    
    public void getDiscriminant() {
        double discriminant;
        double a = coef.getA();
        double b = coef.getB();
        double c = coef.getC();
        
        discriminant = ((Math.pow(b, 2))-(4*a*c));
        coef.setDiscriminant(discriminant);
    }
    
    public boolean hasRoots() {
        
        return (coef.getDiscriminant()> 0);
    }
    
    public boolean hasRoot() {
        
        return (coef.getDiscriminant()==0);
    }
    
    public void getRoots() {
        double root1;
        double root2;
        double a = coef.getA();
        double b = coef.getB();
        double c = coef.getC();
        
        if (hasRoots()) {
            root1 = (-b + (Math.sqrt((Math.pow(b, 2))-(4*a*c))))/(2*a);
            root2 = (-b - (Math.sqrt((Math.pow(b, 2))-(4*a*c))))/(2*a);
            System.out.println("Las raíces de esta ecuación son: " + root1 + " y " + root2);
        }
    }
    
    public void getRoot() {
        double root;
        double a = coef.getA();
        double b = coef.getB();
        double c = coef.getC();
        
        if (hasRoot()) {
            root = (-b + (Math.sqrt((Math.pow(b, 2))-(4*a*c))))/(2*a);
            System.out.println("La única raíz de esta ecuación es: " + root);
        }
    }
    
    public void calculate() {
        getDiscriminant();
        if (hasRoots()) {
            getRoots();
        } else if (hasRoot()) {
            getRoot();
        } else {
            System.out.println("Ninguna de las soluciones son números reales.");
        }
    }
}