/*
Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la
cantidad actual de café que hay en la cafetera). Implemente, al menos, los siguientes
métodos:
- Constructor predeterminado o vacío
- Constructor con la capacidad máxima y la cantidad actual

- Métodos getters y setters.
- Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
máxima.
- Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
- Método vaciarCafetera(): pone la cantidad de café actual en cero.
- Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.
*/


package ejercicio06poo;

import Entity.CoffeMaker;
import Service.ServiceCoffe;
import java.util.Scanner;


public class Ejercicio06POO {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean exit = false;
        int option;
        ServiceCoffe sc = new ServiceCoffe();
        CoffeMaker c1 = sc.createCoffeMaker();
        
        System.out.println("");
        System.out.println("Bienvenido a la cafetera inteligente NESPRESSO");
        while (!exit) {
            System.out.println("1. Llenar cafetera.");
            System.out.println("2  Servir taza. (Indique cuánto café desea servir.)");
            System.out.println("3. Vaciar Cafetera");
            System.out.println("4. Agregar café a la cafetera.");
            System.out.println("5. Consultar cuánto café hay en la cafetera.");
            System.out.println("6. Salir del menú.");
            System.out.println("");
            
            System.out.println("Ingrese la opción que desee.");
            option = input.nextInt();
            
            switch (option) {
                case 1:
                    sc.fillCoffeMaker(c1);
                    System.out.println("");
                    break;
                case 2:
                    sc.serveCup(c1);
                    System.out.println("");
                    break;
                case 3:
                    sc.emptyCoffeMaker(c1);
                    System.out.println("");
                    break;
                case 4:
                    sc.addCoffe(c1);
                    System.out.println("");
                    break;
                case 5:
                    sc.checkCurrentAmount(c1);
                    System.out.println("");
                    break;
                case 6:
                    System.out.println("Saliendo del menú...");
                    exit = true;
                    break;
            }
            
        }

    }
    
}
