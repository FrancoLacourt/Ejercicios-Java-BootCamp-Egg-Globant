package Service;

import Entity.Maths;

public class MathService {
    
    Maths m1 = new Maths();
    
    public void setNumbers() {
        m1.setNum1(Math.random() * 10 - 5);
        m1.setNum2(Math.random() * 10 - 5);
        
        System.out.println("El número 1 es: " + m1.getNum1());
        System.out.println("El número 2 es: " + m1.getNum2());
        System.out.println("");
    }

    public void getLargest() {
        double num1 = m1.getNum1();
        double num2 = m1.getNum2();

        if (num1 > num2) {
            System.out.println(num1 + " Es el mayor número.");
            m1.setLargestNumber(num1);
            m1.setLowestNumber(num2);
        } else if (num1 == num2) {
            System.out.println("Ambos números son iguales.");
            m1.setLargestNumber(num2);
            m1.setLowestNumber(num1);
        } else {
            System.out.println(num2 + " Es el mayor número.");
            m1.setLargestNumber(num2);
            m1.setLowestNumber(num1);
        }
    }

    public void calculatePower() {
        double largest = Math.round(m1.getLargestNumber());
        double lowest = Math.round(m1.getLowestNumber());

        System.out.println(largest + " elevado a " + lowest + " es: " + Math.pow(largest, lowest));
    }

    public void SquareRoot() {
        double lowest = Math.abs(m1.getLowestNumber());

        System.out.println("La raiz cuadrada de " + lowest + " es: " + Math.sqrt(lowest));
    }
}