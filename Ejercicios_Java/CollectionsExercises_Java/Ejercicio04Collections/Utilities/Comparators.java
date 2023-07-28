package Utilities;

import Entities.Movie;
import java.util.Comparator;

public class Comparators {

    public static Comparator<Movie> sortInDescendingOrder = new Comparator<Movie>() {
        @Override
        public int compare(Movie t, Movie t1) {
            return t1.getDuration().compareTo(t.getDuration());
        }
    };

    public static Comparator<Movie> sortInAscendingOrder = new Comparator<Movie>() {
        @Override
        public int compare(Movie t, Movie t1) {
            return t.getDuration().compareTo(t1.getDuration());
        }
    };

    public static Comparator<Movie> sortAlphabeticallyByTitle = new Comparator<Movie>() {
        @Override
        public int compare(Movie t, Movie t1) {
            return t.getTitle().compareTo(t1.getTitle());
        }
    };
    
    public static Comparator<Movie> sortAlphabeticallyByDirector = new Comparator<Movie>() {
        @Override
        public int compare(Movie t, Movie t1) {
            return t.getDirector().compareTo(t1.getDirector());
        }
    };
}