package exercise01extraclassrelationship;

import Entities.Auditorium;
import Entities.Movie;
import Entities.Viewer;
import Services.AuditoriumService;
import Services.MovieService;
import Services.ViewerService;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Exercise01ExtraClassRelationship {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean exit = false;
        int menuOption;
        String option;
        String viewerName;
        int age;
        Double viewerMoney;
        String title;
        String movieName;
        int duration;
        int minimumAge;
        String directorName;
        int count;

        AuditoriumService as = new AuditoriumService();
        MovieService ms = new MovieService();
        ViewerService vs = new ViewerService();

        HashSet<Movie> movies = ms.getListOfMovies();
        ArrayList<Auditorium> auditoriums = as.getListOfAuditoriums();

        System.out.println("Welcome to our Cinema! Please enter the option you want to do.");
        while (!exit) {
            System.out.println("1. Add Movie.");
            System.out.println("2. Show available movies.");
            System.out.println("3. Buy tickets. Ticket price is $15 for all movies.");
            System.out.println("4. Exit.");

            System.out.println("Enter the option you want to do.");
            menuOption = sc.nextInt();
            sc.nextLine();

            switch (menuOption) {
                case 1:

                    System.out.println("Enter the title of the movie.");
                    title = sc.nextLine();
                    System.out.println("Enter duration of the movie.");
                    duration = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter the minimum age to watch the movie.");
                    minimumAge = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter director's name.");
                    directorName = sc.nextLine();

                    ms.createAndAdd(title, duration, minimumAge, directorName);

                    Movie m = ms.createMovie(title, duration, minimumAge, directorName);
                    as.createAndAdd(m);

                    System.out.println("");
                    break;

                case 2:
                    if (movies.isEmpty()) {
                        System.out.println("There are no movies to show.");
                    } else {
                        for (Movie movie : movies) {
                            System.out.println(movie.toString());
                        }
                    }

                    System.out.println("");
                    break;

                case 3:

                    if (movies.isEmpty()) {
                        System.out.println("There are no movies for the moment.");
                    } else {

                        System.out.println("Enter your name.");
                        viewerName = sc.nextLine();
                        System.out.println("Enter your age.");
                        age = sc.nextInt();
                        sc.nextLine();
                        System.out.println("How much money do you have?");
                        viewerMoney = sc.nextDouble();
                        sc.nextLine();

                        Viewer v = vs.createViewer(viewerName, age, viewerMoney);

                        System.out.println("Enter the title of the movie you want to buy.");
                        movieName = sc.nextLine();

                        Movie m1 = null;

                        while (m1 == null) {
                            for (Movie movie : movies) {
                                if (movie.getTitle().equalsIgnoreCase(movieName)) {
                                    m1 = movie;
                                    break;
                                }
                            }
                            if (m1 == null) {
                                System.out.println("The entered movie is not on the cinema, please enter a new one.");
                                movieName = sc.nextLine();
                            }
                        }

                        if (as.hasAvailableSeats(m1)) {
                            if (as.viewerConditions(m1, v) == 1) {
                                System.out.println("Sorry, you are not old enough to watch the movie.");
                            } else {
                                if (as.viewerConditions(m1, v) == 2) {
                                    System.out.println("Sorry, you don't have enough money to buy the ticket");
                                } else {
                                    int[] seatCoordinates = new int[2];
                                    as.addViewerToAuditorium(m1, v, seatCoordinates);

                                    int row = seatCoordinates[0];
                                    int col = seatCoordinates[1];
                                    System.out.println("The ticket has been purchased successfully.");
                                    System.out.println("You were assigned to seat " + (row + 1) + "" + (char) ('A' + col));
                                    System.out.println("");

                                    for (Auditorium auditorium : auditoriums) {
                                        if (auditorium.getMovie().getTitle().equalsIgnoreCase(m1.getTitle())) {
                                            for (int i = 7; i >= 0; i--) {
                                                for (int j = 0; j < 6; j++) {
                                                    char seat = (char) ('A' + j); // Calcular la letra del asiento
                                                    System.out.print(i + 1 + "" + seat + " " + auditorium.getAuditorium()[i][j] + " | ");
                                                }
                                                System.out.println("");
                                            }
                                            break;
                                        }
                                    }
                                }

                            }
                        } else {
                            System.out.println("Sorry. There are no more empty seats.");
                        }
                    }

                    System.out.println("");
                    break;
                case 4:

                    System.out.println("Exiting the menu...");
                    exit = true;
                    break;
                default:
                    System.out.println("Error. You must choose a valid option.");
                    System.out.println("");
            }
        }
    }
}