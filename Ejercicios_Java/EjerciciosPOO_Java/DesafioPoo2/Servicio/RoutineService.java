package Servicio;

import Entidad.Rutina;
import java.util.ArrayList;
import java.util.Scanner;

public class RoutineService {

    private static final ArrayList<Rutina> rutina = new ArrayList<>();
    private static final Scanner leer = new Scanner(System.in);

    public RoutineService() {
    }

    public void instanciarRutina() {
        Rutina rutinax = new Rutina();

        System.out.print("Ingrese el id de la rutina: ");
        rutinax.setId(leer.nextInt());
        leer.nextLine();
        System.out.print("Ingrese el nombre de la rutina: ");
        rutinax.setNombre(leer.nextLine());
        System.out.print("Ingrese el nivel de dificultad de la rutina: ");
        rutinax.setNivelDificultad(leer.nextLine());
        System.out.print("Ingrese la descripción de la rutina: ");
        rutinax.setDescripcion(leer.nextLine());
        System.out.print("Ingrese la duración de la rutina: ");
        rutinax.setDuracion(leer.nextInt());
        leer.nextLine();

        crearRutina(rutinax);
    }

    public void crearRutina(Rutina rutinax) {
        rutina.add(rutinax);
        System.out.println("¡Rutina agregada correctamente!");
    }

    public void obtenerRutinas() {

        for (Rutina rout : rutina) {
            System.out.println("ID: " + rout.getId() + ", Nombre: " + rout.getNombre() + ", Nivel de dificultad: " + rout.getNivelDificultad() + ", Descripción: " + rout.getDescripcion() + ", Duración: " + rout.getDuracion() + " minutos.");
        }
    }

    public void actualizarRutina(int id, String nombre, int duracion, String nivelDificultad, String descripcion) {
        boolean comprobar = false;
        for (Rutina rout : rutina) {
            if (rout.getId() == id) {
                rout.setNombre(nombre);
                rout.setDuracion(duracion);
                rout.setNivelDificultad(nivelDificultad);
                rout.setDescripcion(descripcion);
                comprobar = true;
                break;
            }
        }
        if (!comprobar) {
            System.out.println("La rutina a actualizar no se encontró!");
        } else {
            System.out.println("La rutina se actualizó correctamente");
        }
    }

    public void eliminarRutina(int id) {
        boolean comprobar = false;
        for (Rutina rout : rutina) {
            if (rout.getId() == id) {
                rutina.remove(rout);
                comprobar = true;
                break;
            }
        }
        if (!comprobar) {
            System.out.println("¡No se encontró la rutina a eliminar");
        } else {
            System.out.println("Rutina eliminada correctamente!");
        }
    }
}