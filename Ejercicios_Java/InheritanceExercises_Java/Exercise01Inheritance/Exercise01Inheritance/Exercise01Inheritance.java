/*
Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
mensaje por pantalla informando de que se alimenta.
*/
package Exercise01Inheritance;

import Entities.Animal;
import Entities.Cat;
import Entities.Dog;
import Entities.Horse;

public class Exercise01Inheritance {

    public static void main(String[] args) {
        
        Animal dog1 = new Dog("Sparky", "balanced feed", 7, "Siberian Husky");
        dog1.feed();
        System.out.println("");
        
        Animal cat1 = new Cat("George", "tuna", 4, "Siamese");
        cat1.feed();
        System.out.println("");
        
        Animal horse1 = new Horse("Fred", "grass", 10, "Arabian");
        horse1.feed();
        System.out.println("");
        
        Animal dog2 = new Dog("Bobby", "meat", 14, "Beagle");
        dog2.feed();
        System.out.println("");
    }   
}