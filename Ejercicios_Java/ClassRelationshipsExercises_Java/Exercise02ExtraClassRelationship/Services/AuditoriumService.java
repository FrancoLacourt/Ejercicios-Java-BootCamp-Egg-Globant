package Services;

import Entities.Auditorium;
import Entities.Movie;
import Entities.Viewer;
import java.util.ArrayList;
import java.util.Random;

public class AuditoriumService {

    Random random = new Random();

    ArrayList<Auditorium> auditoriums = new ArrayList();

    public Auditorium createAuditorium(Movie movie) {
        int row = 8;
        int col = 6;
        char auditorium[][] = new char[8][6];
        Double price = 15.0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                auditorium[i][j] = 'O';
            }
        }
        return new Auditorium(movie, auditorium, price);
    }

    public void addAuditoriumToTheList(Auditorium auditorium) {
        auditoriums.add(auditorium);
    }

    public void createAndAdd(Movie movie) {
        Auditorium cinema = createAuditorium(movie);
        addAuditoriumToTheList(cinema);
    }

    public void addViewerToAuditorium(Movie movie, Viewer viewer, int[] seatCoordinates) {
        int row;
        int col;

        for (Auditorium auditorium : auditoriums) {
            if (auditorium.getMovie().getTitle().equalsIgnoreCase(movie.getTitle())) {
                do {
                    row = random.nextInt(8);
                    col = random.nextInt(6);
                } while (auditorium.getAuditorium()[row][col] == 'X');
                auditorium.getAuditorium()[row][col] = 'X';

                seatCoordinates[0] = row;
                seatCoordinates[1] = col;
                return;
            }
        }
    }

    public int viewerConditions(Movie movie, Viewer viewer) {

        for (Auditorium auditorium : auditoriums) {
            if (auditorium.getMovie().getTitle().equalsIgnoreCase(movie.getTitle())) {

                if (viewer.getAge() < movie.getMinimumAge()) {
                    return 1;
                }
                if (viewer.getAvailableMoney() < auditorium.getTicketPrice()) {
                    return 2;
                }
            }
        }

        return 3;
    }

    public boolean hasAvailableSeats(Movie movie) {
        int row = 8;
        int col = 6;

        for (Auditorium auditorium : auditoriums) {
            if (auditorium.getMovie().getTitle().equalsIgnoreCase(movie.getTitle())) {
                for (int i = 0; i < row; i++) {
                    for (int j = 0; j < col; j++) {
                        if (auditorium.getAuditorium()[i][j] != 'X') {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public ArrayList<Auditorium> getListOfAuditoriums() {
        return auditoriums;
    }
}