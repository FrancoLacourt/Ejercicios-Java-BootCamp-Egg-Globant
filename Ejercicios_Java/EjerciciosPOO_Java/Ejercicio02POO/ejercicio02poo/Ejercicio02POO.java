/*
Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio2).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
 */
package ejercicio02poo;

import Entity.Circumference;
import Service.CircumferenceService;

public class Ejercicio02POO {

    public static void main(String[] args) {
        
        CircumferenceService cs = new CircumferenceService();
        Circumference c1 = cs.createCircumference();
        System.out.println("");
        cs.area(c1);
        System.out.println("");
        cs.perimetro(c1);
        

    }

}
