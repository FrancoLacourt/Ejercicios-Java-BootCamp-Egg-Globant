
package Entidades;

public class Pelicula {
    
   private String titulo;
    private String genero;
    private int anio;
    private int duracion;

    public Pelicula() {
    }

    public Pelicula(String titulo, String genero, int anio, int duracion) {
        this.titulo = titulo;
        this.genero = genero;
        this.anio = anio;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
}