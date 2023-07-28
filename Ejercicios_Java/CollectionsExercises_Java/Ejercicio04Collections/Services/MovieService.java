package Services;

import Entities.Movie;
import Utilities.Comparators;
import java.util.ArrayList;
import java.util.Collections;

public class MovieService {

    private ArrayList<Movie> movies = new ArrayList();
    private ArrayList<String> listOfMoviesAsStrings = new ArrayList();
    private ArrayList<String> moviesLongerThan1Hour = new ArrayList();

    public Movie createMovie(String title, String director, int duration) {
        return new Movie(title, director, duration);
    }
    
    public void addMovieToTheList(Movie movie) {
        movies.add(movie);
        updateListOfMoviesAsStrings();
    }
    
    public void createAndAdd(String title, String director, int duration) {
        Movie movie = createMovie(title, director, duration);
        addMovieToTheList(movie);
    }
    
    public ArrayList<String> getListOfMoviesAsStrings() {
        return listOfMoviesAsStrings;
    }
    
    public void updateListOfMoviesAsStrings() {
        listOfMoviesAsStrings.clear();
        for (Movie movie : movies) {
            listOfMoviesAsStrings.add(movie.toString());
        }
    }
    
    public int listSize() {
        return movies.size();
    }
    
    public void MoviesLongerThan1Hour() {
        for (Movie movie : movies) {
            if (movie.getDuration() > 1) {
                moviesLongerThan1Hour.add(movie.toString());
            }
        }
    }
    
    public ArrayList<String> getMoviesLongerThan1Hour() {
        return moviesLongerThan1Hour;
    }
    
    public void sortInDescendingOrder() {
        Collections.sort(movies, Comparators.sortInDescendingOrder);
        updateListOfMoviesAsStrings();
        
    }
    
    public void sortInAscendingOrder() {
        Collections.sort(movies, Comparators.sortInAscendingOrder);
        updateListOfMoviesAsStrings();
    }
    
    public void sortAlphabeticallyByTitle() {
        Collections.sort(movies, Comparators.sortAlphabeticallyByTitle);
        updateListOfMoviesAsStrings();
    }
    
    public void sortAlphabeticallyByDirector() {
        Collections.sort(movies, Comparators.sortAlphabeticallyByDirector);
        updateListOfMoviesAsStrings();
    }
}