package Servicios;

import Entidades.Alquiler;
import Entidades.Pelicula;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.List;

public class ServicioAlquiler {

    /*
    Declaro e inicializo la lista "alquileres" que va a almacenar objetos de la clase Pelicula.
     */
    private List<Alquiler> alquileres = new LinkedList<>();

    private ServicioPelicula servPelicula;
    public ServicioAlquiler(ServicioPelicula servPelicula) {
        this.servPelicula = servPelicula;
    }
    
    /*
    Tengo que agregar un constructor que reciba una instancia de ServicioPelicula y asignar esa instancia a servPelicula.
    Si no lo hago, en cada llamada al método servPelicula.getPeliculas(), se crea una nueva instancia de ServicioPelicula,
    y estoy obteniendo una lista vacía cada vez.
    */

    Scanner leer = new Scanner(System.in);
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public void crearAlquiler() {
        List<Pelicula> peliculas = servPelicula.getPeliculas();
        Alquiler nuevoAlquiler = new Alquiler();

        String peliculaAlquilada;
        LocalDate fechaHoy = LocalDate.now();
        LocalDate fechaRetiro;
        LocalDate fechaDevolucion;
        int contador = 0;
        int check = 0;
        boolean peliculaEncontrada = false;

        System.out.println("Ingrese el nombre de la película que desea alquilar.");
        peliculaAlquilada = leer.nextLine();
        for (Pelicula movie : peliculas) {
            if (movie.getTitulo().equalsIgnoreCase(peliculaAlquilada)) {
                nuevoAlquiler.setTitulo(peliculaAlquilada);
                peliculaEncontrada = true;
                peliculas.remove(movie);
                break;
            }
        }

        if (peliculaEncontrada) {

            do {

                if (contador >= 1) {
                    System.out.println("Error. La fecha de retiro no puede ser anterior al día de hoy ni la fecha de devolución puede ser anterior a la fecha de retiro.");
                }

                System.out.println("Ingrese la fecha en la que quiere retirar la película. Formato (AAAA-MM-DD)");
                String fechaDeRetiro = leer.nextLine();
                fechaRetiro = LocalDate.parse(fechaDeRetiro, formatter);

                System.out.println("Ingrese la fecha en la que quiere devolver la película. Formato (AAAA-MM-DD)");
                String fechaDeDevolucion = leer.nextLine();
                fechaDevolucion = LocalDate.parse(fechaDeDevolucion, formatter);

                contador++;

            } while ((fechaRetiro.isBefore(fechaHoy)) || (fechaDevolucion.isBefore(fechaRetiro)));
            
            nuevoAlquiler.setFechaInicio(fechaRetiro);
            nuevoAlquiler.setFechaFin(fechaDevolucion);

            long diasDeAlquiler = ChronoUnit.DAYS.between(fechaRetiro, fechaDevolucion);

            if (diasDeAlquiler <= 3) {
                nuevoAlquiler.setPrecio(10);
            } else {
                long diasExtra = diasDeAlquiler - 3;
                double precioBase = 10;
                double interes = 0.1;
                double precioTotal;

                precioTotal = precioBase + (precioBase * diasExtra * interes);
                nuevoAlquiler.setPrecio(precioTotal);
            }

            alquileres.add(nuevoAlquiler);
        } else {
            System.out.println("La película ingresada NO se encuentra disponible.");
        }
    }

    public void peliculasAlquiladas() {
        for (Alquiler rent : alquileres) {
            System.out.println(rent.getTitulo() + ". " + " Alquilada desde: " + rent.getFechaInicio() + " hasta " + rent.getFechaFin() + ". El costo de este alquiler es de: $" + rent.getPrecio());
        }
    }

    public void buscarAlquilerPorFecha() {

        System.out.println("Ingrese la fecha en la que quiere revisar las películas que se van a alquilar. Formato (AAAA-MM-DD)");
        String fechaDeRetiro = leer.nextLine();
        LocalDate fechaRetiro = LocalDate.parse(fechaDeRetiro, formatter);
        boolean peliculaEncontrada = false;

        for (Alquiler rent : alquileres) {
            int contador = 0;
            if (rent.getFechaInicio().isEqual(fechaRetiro)) {
                if (contador == 0) {
                    System.out.println("Estas son todas las películas que serán alquiladas el día " + fechaRetiro + ".");
                    System.out.println(rent.getTitulo() + ". " + " Alquilada desde: " + rent.getFechaInicio() + " hasta " + rent.getFechaFin() + ". El costo de este alquiler es de: $" + rent.getPrecio());
                    peliculaEncontrada = true;
                }
            }

        }
        if (!peliculaEncontrada) {
            System.out.println("No se ha encontrado ninguna película que vaya a ser alquilada el día " + fechaRetiro);
        }
    }
}