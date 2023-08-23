
package Services;

import Entities.Movie;
import java.util.HashSet;

public class MovieService {
    
    HashSet <Movie> movies = new HashSet();
    
    public Movie createMovie(String title, int duration, int minimumAge, String director) {
        return new Movie(title, duration, minimumAge, director);
    }
    
    public void addMovieToTheList(Movie movie) {
        movies.add(movie);
    }
    
    public void createAndAdd(String title, int duration, int minimumAge, String director) {
        Movie movie = createMovie(title, duration, minimumAge, director);
        addMovieToTheList(movie);
    }
    
    public HashSet <Movie> getListOfMovies() {
        return movies;
    }   
}