/*
Implemente un programa para una Librería haciendo uso de un HashSet para evitar datos
repetidos. Para ello, se debe crear una clase llamada Libro que guarde la información de
cada uno de los libros de una Biblioteca. La clase Libro debe guardar
el título del libro, autor, número de ejemplares y número de ejemplares prestados.
También se creará en el main un HashSet de tipo Libro que guardará todos los libros
creados.
En el main tendremos un bucle que crea un objeto Libro pidiéndole al usuario todos sus
datos y los seteandolos en el Libro. Despues, ese Libro se guarda en el conjunto y se le
pregunta al usuario si quiere crear otro Libro o no.
La clase Librería contendrá además los siguientes métodos:
Constructor por defecto.
Constructor con parámetros.
Métodos Setters/getters
Método prestamo(): El usuario ingresa el titulo del libro que quiere prestar y se lo busca
en el conjunto. Si está en el conjunto, se llama con ese objeto Libro al método. El
método se incrementa de a uno, como un carrito de compras, el atributo ejemplares
prestados, del libro que ingresó el usuario. Esto sucederá cada vez que se realice un
préstamo del libro. No se podrán prestar libros de los que no queden ejemplares
disponibles para prestar. Devuelve true si se ha podido realizar la operación y false en
caso contrario.
Método devolucion(): El usuario ingresa el titulo del libro que quiere devolver y se lo
busca en el conjunto. Si está en el conjunto, se llama con ese objeto al método. El
método decrementa de a uno, como un carrito de compras, el atributo ejemplares
prestados, del libro seleccionado por el usuario. Esto sucederá cada vez que se
produzca la devolución de un libro. No se podrán devolver libros donde que no tengan
ejemplares prestados. Devuelve true si se ha podido realizar la operación y false en
caso contrario.
Método toString para mostrar los datos de los libros.
 */
package extra03collections;

import Services.BookService;
import java.util.ArrayList;
import java.util.Scanner;

public class Extra03Collections {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean exit = false;
        int menuOption;
        String option;
        String title;
        String bookToBorrow;
        String bookToReturn;
        String author;
        int copiesCount;

        BookService bs = new BookService();
        ArrayList<String> listOfBooksAsStrings = bs.getListOfBooksAsStrings();

        while (!exit) {
            System.out.println("1. Add book to the list.");
            System.out.println("2  View the list of books.");
            System.out.println("3. Borrow a book.");
            System.out.println("4. Return a book.");
            System.out.println("5. Exit.");

            System.out.println("Enter the option you want to do.");
            menuOption = sc.nextInt();
            sc.nextLine();

            switch (menuOption) {
                case 1:
                    do {

                        System.out.println("Please enter the title of the book.");
                        title = sc.nextLine().toLowerCase();
                        System.out.println("Please enter the author of the book.");
                        author = sc.nextLine().toLowerCase();
                        System.out.println("Please enter the number of copies of the book you want to add.");
                        copiesCount = sc.nextInt();
                        sc.nextLine();
                        System.out.println("");

                        bs.createAndAdd(title, author, copiesCount);

                        System.out.println("Would you like to add another book? Please answer with yes/no.");
                        option = sc.nextLine();

                        while (!option.equalsIgnoreCase("yes") && !option.equalsIgnoreCase("no")) {
                            System.out.println("Invalid response, please enter yes or no.");
                            option = sc.nextLine();
                        }

                    } while (option.equalsIgnoreCase("yes"));
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("List of books.");
                    for (String books : listOfBooksAsStrings) {
                        System.out.println(books);
                    }
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("Enter the title of the book you want to borrow.");
                    bookToBorrow = sc.nextLine();
                    if (bs.searchBook(bookToBorrow)) {
                        if (bs.availableToBorrow(bookToBorrow)) {
                            bs.borrowBook(bookToBorrow);
                            System.out.println("Enjoy the book! Remember to return it after a few days.");
                        } else {
                            System.out.println("There are no copies of this book available to borrow");
                        }
                    } else {
                        System.out.println("The entered book is not part of the list.");
                    }
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("Enter the title of the book you want to return.");
                    bookToReturn = sc.nextLine();
                    if (bs.searchBook(bookToReturn)) {
                        if (bs.availableToReturn(bookToReturn)) {
                            bs.returnBook(bookToReturn);
                            System.out.println("The book was successfully returned. Thank you!");
                        } else {
                            System.out.println("There are no borrowed copies of this book. Probably you need to return a different book.");
                        }
                    } else {
                        System.out.println("The entered book is not part of the list.");
                    }
                    System.out.println("");
                    break;

                case 5:
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