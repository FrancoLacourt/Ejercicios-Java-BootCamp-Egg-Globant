
package Entidades;

import java.time.LocalDate;


public class Alquiler {
    
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private String titulo;
    private double precio;

    public Alquiler() {
    }

    public Alquiler(LocalDate fechaInicio, LocalDate fechaFin, String peliculaAlquilada, double precio) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.titulo = peliculaAlquilada;
        this.precio = precio;
    }
    

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}