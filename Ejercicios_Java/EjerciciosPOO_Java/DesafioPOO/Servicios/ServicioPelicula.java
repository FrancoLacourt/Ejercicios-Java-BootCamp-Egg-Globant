package Servicios;

import java.util.LinkedList;
import java.util.List;
import Entidades.Pelicula;
import java.util.Scanner;

public class ServicioPelicula {

    /*
    Declaro e inicializo la lista "peliculas" que va a almacenar objetos de la clase Pelicula.
     */
    private List<Pelicula> peliculas = new LinkedList<>();

    // Este objeto "película" es el que vamos a usar en los otros métodos que no sean crearPelícula().
    Pelicula pelicula = new Pelicula();
    Scanner leer = new Scanner(System.in);

    public void crearPelicula() {

        Pelicula nuevaPelicula = new Pelicula();

        System.out.println("Ingrese el titulo");
        nuevaPelicula.setTitulo(leer.nextLine());
        System.out.println("Ingrese el genero");
        nuevaPelicula.setGenero(leer.nextLine());
        System.out.println("Ingrese el año");
        nuevaPelicula.setAnio(leer.nextInt());
        System.out.println("Ingrese duracion (minutos)");
        nuevaPelicula.setDuracion(leer.nextInt());
        leer.nextLine();
        System.out.println("");

        peliculas.add(nuevaPelicula);
    }

    public String nombre() {
        return pelicula.getTitulo();
    }

    public void peliculasDisponibles() {
        for (Pelicula movie : peliculas) {
            System.out.println(movie.getTitulo() + ", " + movie.getGenero() + ", " + movie.getAnio() + ", " + movie.getDuracion() + " minutos");
        }
    }

    public List<Pelicula> getPeliculas() {
        return peliculas;
    }

    public void buscarPeliculaPorTitulo() {
        System.out.println("Ingrese el título de la película que desea buscar.");
        String titulo = leer.nextLine();

        boolean peliculaEncontrada = false;

        for (Pelicula movie : peliculas) {
            if (movie.getTitulo().equalsIgnoreCase(titulo)) {
                System.out.println(movie.getTitulo() + ", " + movie.getGenero() + ", " + movie.getAnio() + ", " + movie.getDuracion() + " minutos");
                peliculaEncontrada = true;
            }
        }

        if (!peliculaEncontrada) {
            System.out.println("Actualmente, la película " + titulo + " NO se encuentra disponible.");
        }
    }

    public void buscarPeliculaPorGenero() {
        
        System.out.println("Ingrese el género que desea buscar.");
        String genero = leer.nextLine();

        boolean peliculaEncontrada = false;
        int contador = 0;
        
        for (Pelicula movie : peliculas) {
            if (movie.getGenero().equalsIgnoreCase(genero)) {
                if (contador == 0) {
                    System.out.println("Estas son todas las películas con el género " + genero + ".");
                }
                System.out.println(movie.getTitulo() + ", " + movie.getGenero() + ", " + movie.getAnio() + ", " + movie.getDuracion() + " minutos");
                contador++;
                peliculaEncontrada = true;

            }
        }       
        if (!peliculaEncontrada) {
                System.out.println("Actualmente no hay películas disponibles del género " + genero + ".");
            }       
    }
}