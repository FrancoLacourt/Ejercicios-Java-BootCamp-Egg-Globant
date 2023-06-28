
package Entity;


public class Roots {
    
    private double a;
    private double b;
    private double c;
    private double discriminant;

    public Roots() {
    }

    public Roots(double a, double b, double c, double discriminant) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.discriminant = discriminant;
    }

    
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return discriminant;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public void setDiscriminant(double discriminant) {
        this.discriminant = discriminant;
    }
}