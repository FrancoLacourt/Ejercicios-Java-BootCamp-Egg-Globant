/*
Realizar una clase llamada Matemática que tenga como atributos dos números reales con
los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
Maths.random para generar los dos números y se guardaran en el objeto con su
respectivos set. Deberá además implementar los siguientes métodos:

a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */

package ejercicio09poo;

import Service.MathService;
import Entity.Maths;

public class Ejercicio09POO {

    public static void main(String[] args) {

        MathService ms = new MathService();
        Maths m1 = new Maths();

        m1.setNum1(Math.random() * 10 - 20);
        m1.setNum2(Math.random() * 10 - 20);
        System.out.println("El número 1 es: " + m1.getNum1());
        System.out.println("El número 2 es: " + m1.getNum2());
        System.out.println("");
        
        ms.getLargest(m1);
        System.out.println("");
        
        ms.calculatePower(m1);
        System.out.println("");

        ms.SquareRoot(m1);
        System.out.println("");
    }
}