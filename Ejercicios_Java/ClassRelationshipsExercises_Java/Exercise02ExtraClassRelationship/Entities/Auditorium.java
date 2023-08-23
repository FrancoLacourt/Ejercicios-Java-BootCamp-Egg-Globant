
package Entities;

public class Auditorium {
    
    private Movie movie;
    private char [][] auditorium;
    private double ticketPrice;

    public Auditorium() {
        this.auditorium = new char [8][6];
    }

    public Auditorium(Movie movie, char[][] auditorium, double ticketPrice) {
        this.movie = movie;
        this.auditorium = auditorium;
        this.ticketPrice = ticketPrice;
    }

    

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public char[][] getAuditorium() {
        return auditorium;
    }

    public void setAuditorium(char[][] auditorium) {
        this.auditorium = auditorium;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }   
}