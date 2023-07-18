package desafiopoo2;

import Servicio.CustomerService;
import Servicio.RoutineService;
import java.util.Scanner;

public class DesafioPoo2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int option;
        boolean exit = false;

        CustomerService cliente = new CustomerService();
        RoutineService rutina = new RoutineService();

        System.out.println("Bienvenido al gimnasio virtual!");

        while (!exit) {
            System.out.println("1. Registrar cliente.");
            System.out.println("2  Obtener clientes.");
            System.out.println("3. Actualizar cliente.");
            System.out.println("4. Eliminar cliente.");
            System.out.println("5. Crear rutina.");
            System.out.println("6. Obtener rutinas.");
            System.out.println("7. Actualizar rutina.");
            System.out.println("8. Eliminar rutina.");
            System.out.println("9. Salir del gimnasio virtual");

            System.out.println("Ingrese la opción que desee.");
            option = leer.nextInt();
            leer.nextLine();

            switch (option) {
                case 1:
                    cliente.registrarCliente();
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("Lista de clientes.");
                    cliente.obtenerClientes();
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("A continuación, ingrese los nuevos datos del cliente.");
                    
                    System.out.print("Ingrese el id del cliente: ");
                    int id = leer.nextInt();
                    leer.nextLine();
                    
                    System.out.print("Ingrese el nombre del cliente: ");
                    String nombre = leer.nextLine();
                    
                    System.out.print("Ingrese el objetivo del cliente: ");
                    String objetivo = leer.nextLine();
                    
                    System.out.print("Ingrese la edad del cliente: ");
                    int edad = leer.nextInt();
                    
                    System.out.print("Ingrese la altura del cliente (m): ");
                    double altura = leer.nextDouble();
                    
                    System.out.print("Ingrese el peso del cliente (Kg): ");
                    double peso = leer.nextDouble();

                    leer.nextLine();
                    cliente.actualizarCliente(id, nombre, edad, altura, peso, objetivo);
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("A continuación, ingrese el id del cliente que desee eliminar");
                    int idCliente = leer.nextInt();
                    cliente.eliminarCliente(idCliente);
                    System.out.println("");
                    break;
                case 5:
                    rutina.instanciarRutina();
                    System.out.println("");
                    break;
                case 6:
                    System.out.println("Lista de rutinas.");
                    rutina.obtenerRutinas();
                    System.out.println("");
                    break;
                case 7:
                    System.out.println("A continuación, ingrese los nuevos datos de la rutina.");
                    
                    System.out.print("Ingrese el id de la rutina: ");
                    int idRutina = leer.nextInt();
                    leer.nextLine();
                    System.out.print("Ingrese el nombre de la rutina: ");
                    String nombreRutina = leer.nextLine();
                    
                    System.out.print("Ingrese el nivel de dificultad de la rutina: ");
                    String nivelDificultad = leer.nextLine();
                    
                    System.out.print("Ingrese la descripción de la rutina: ");
                    String descripcion = leer.nextLine();
                    
                    System.out.print("Ingrese la duración de la rutina: ");
                    int duracion = leer.nextInt();
                    leer.nextLine();
                    
                    rutina.actualizarRutina(idRutina, nombreRutina, duracion, nivelDificultad, descripcion);
                    System.out.println("");
                    break;
                case 8:
                    System.out.println("A continuación, ingrese el id de la rutina que desee eliminar.");
                    int rutinaId = leer.nextInt();
                    rutina.eliminarRutina(rutinaId);
                    System.out.println("");
                    break;
                case 9:
                    System.out.println("Saliendo del gimnasio...");
                    exit = true;
                    break;

                default:
                    System.out.println("Error. Debe ingresar una opción válida.");
            }
        }
    }
}