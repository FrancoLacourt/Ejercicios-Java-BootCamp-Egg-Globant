
package Entity;

public class Maths {
 
    private double num1;
    private double num2;
    private double largestNumber;
    private double LowestNumber;

    public Maths() {
    }

    public Maths(double num1, double num2, double largestNumber, double LowestNumber) {
        this.num1 = num1;
        this.num2 = num2;
        this.largestNumber = largestNumber;
        this.LowestNumber = LowestNumber;
    }

    
    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    public double getLargestNumber() {
        return largestNumber;
    }

    public double getLowestNumber() {
        return LowestNumber;
    }
    
    
    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public void setLargestNumber(double largestNumber) {
        this.largestNumber = largestNumber;
    }

    public void setLowestNumber(double LowestNumber) {
        this.LowestNumber = LowestNumber;
    }
}