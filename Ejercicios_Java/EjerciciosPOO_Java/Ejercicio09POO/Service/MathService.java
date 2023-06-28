package Service;

import Entity.Maths;

public class MathService {

    public void getLargest(Maths m1) {
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
        }
    }

    public void calculatePower(Maths m1) {
        double largest = Math.round(m1.getLargestNumber());
        double lowest = Math.round(m1.getLowestNumber());

        System.out.println(largest + " elevado a " + lowest + " es: " + Math.pow(largest, lowest));
    }

    public void SquareRoot(Maths m1) {
        double lowest = Math.abs(m1.getLowestNumber());

        System.out.println("La raiz cuadrada de " + lowest + " es: " + Math.sqrt(lowest));
    }
}
