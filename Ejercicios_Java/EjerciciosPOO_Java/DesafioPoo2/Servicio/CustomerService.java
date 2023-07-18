package Servicio;

import Entidad.Cliente;
import java.util.List;
import java.util.Scanner;
import java.util.LinkedList;

public class CustomerService {

    private List<Cliente> cliente = new LinkedList<>();
    private final Scanner leer = new Scanner(System.in);

    public void registrarCliente() {

        Cliente nuevoCliente = new Cliente();

        System.out.print("Ingrese el id del cliente: ");
        nuevoCliente.setId(leer.nextInt());
        leer.nextLine();
        System.out.print("Ingrese el nombre del cliente: ");
        nuevoCliente.setNombre(leer.nextLine());
        System.out.print("Ingrese el objetivo del cliente: ");
        nuevoCliente.setObjetivo(leer.nextLine());
        System.out.print("Ingrese la edad del cliente: ");
        nuevoCliente.setEdad(leer.nextInt());
        System.out.print("Ingrese la altura del cliente (m): ");
        nuevoCliente.setAltura(leer.nextDouble());
        System.out.print("Ingrese el peso del cliente (Kg): ");
        nuevoCliente.setPeso(leer.nextDouble());
        leer.nextLine();
        cliente.add(nuevoCliente);
    }

    public void obtenerClientes() {
        for (Cliente cli : cliente) {
            System.out.println("ID: " + cli.getId() + ", Nombre: " + cli.getNombre() + ", Objetivo: " + cli.getObjetivo() + ", Edad: " + cli.getEdad() + " años, Altura: " + cli.getAltura() + "m, Peso: " + cli.getPeso() + " kg");
        }
    }

    public void actualizarCliente(int id, String nombre, int edad, double altura, double peso, String objetivo) {
        boolean comprobar = false;
        for (Cliente cli : cliente) {
            if (cli.getId() == id) {
                cli.setNombre(nombre);
                cli.setEdad(edad);
                cli.setAltura(altura);
                cli.setPeso(peso);
                cli.setObjetivo(objetivo);
                comprobar = true;
                break;
            }
        }
        if (!comprobar) {
            System.out.println("El cliente a actualizar no se encontró!");
            
        } else {
            System.out.println("Cliente actualizado correctamente!");
        } 
    }

    public void eliminarCliente(int id) {
        boolean comprobar = false;
        for (Cliente cli : cliente) {
            if (cli.getId() == id) {
                cliente.remove(cli);
                comprobar = true;
                break;
            }
        }
        if (!comprobar) {
            System.out.println("No se encontró el cliente a eliminar!");
        } else {
            System.out.println("Cliente eliminado correctamente!");
        }
    }
}