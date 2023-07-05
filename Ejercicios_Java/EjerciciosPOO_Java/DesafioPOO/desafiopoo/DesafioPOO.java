
package desafiopoo;

import Servicios.ServicioAlquiler;
import Servicios.ServicioPelicula;
import java.util.Scanner;


public class DesafioPOO {


    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int option;
        boolean exit = false;

        ServicioPelicula servPelicula = new ServicioPelicula();
        ServicioAlquiler servAlquiler = new ServicioAlquiler(servPelicula);
        
        /*
        Para trabajar con la misma instancia de ServicioPelicula en ambas clases, 
        debo pasar una instancia de ServicioPelicula desde acá a las clases ServicioAlquiler y ServicioPelicula.
        */
        
        
        System.out.println("Bienvenido a mi tienda de Películas!");
        
        while (!exit) {
            System.out.println("1. Cargar película.");
            System.out.println("2  Lista de todas las películas disponibles.");
            System.out.println("3. Alquilar película.");
            System.out.println("4. Lista de todas las películas alquiladas.");
            System.out.println("5. Buscar película por título.");
            System.out.println("6. Buscar película por género.");
            System.out.println("7. Buscar alquiler por fecha de retiro.");
            System.out.println("8. Salir de la tienda virtual.");
            
            System.out.println("Ingrese la opción que desee.");
            option = leer.nextInt();
            leer.nextLine();
            
            switch (option) {
                case 1:
                    servPelicula.crearPelicula();
                    System.out.println("");
                    break;
                case 2:
                    servPelicula.peliculasDisponibles();
                    System.out.println("");
                    break;
                case 3:
                    servAlquiler.crearAlquiler();
                    System.out.println("");
                    break;
                case 4:
                    servAlquiler.peliculasAlquiladas();
                    System.out.println("");
                    break;
                case 5:
                    servPelicula.buscarPeliculaPorTitulo();
                    System.out.println("");
                    break;
                case 6:
                    servPelicula.buscarPeliculaPorGenero();
                    System.out.println("");
                    break;
                case 7:
                    servAlquiler.buscarAlquilerPorFecha();
                    System.out.println("");
                    break;
                case 8:
                    System.out.println("Saliendo de la tienda...");
                    exit = true;
                    break;
                    
                default:
                    System.out.println("Error. Debe ingresar una opción válida.");
            }
            
        }
    }
}