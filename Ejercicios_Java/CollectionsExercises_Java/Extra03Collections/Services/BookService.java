package Services;

import Entities.Book;
import java.util.ArrayList;
import java.util.HashSet;

public class BookService {

    private HashSet<Book> books = new HashSet();
    private ArrayList<String> listOfBooksAsStrings = new ArrayList();

    public Book createBook(String title, String author, int copiesCount) {
        return new Book(title, author, copiesCount);
    }

    public void addBookToTheList(Book book) {
        books.add(book);
        updateListOfBooksAsStrings();
    }

    public void createAndAdd(String title, String author, int copiesCount) {
        Book book = createBook(title, author, copiesCount);
        addBookToTheList(book);
    }

    public ArrayList<String> getListOfBooksAsStrings() {
        return listOfBooksAsStrings;
    }

    public void updateListOfBooksAsStrings() {
        listOfBooksAsStrings.clear();
        for (Book book : books) {
            listOfBooksAsStrings.add(book.toString());
        }
    }

    public int listSize() {
        return books.size();
    }

    public boolean searchBook(String title) {

        boolean check = false;

        for (Book book : books) {

            if (book.getTitle().equalsIgnoreCase(title)) {
                check = true;
                break;
            } else {
                check = false;
            }
        }
        return check;
    }

    public boolean availableToBorrow(String title) {

        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                if (book.getCopiesCount() > 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean availableToReturn(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                if (book.getBorrowedCopiesCount() > 0) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public void borrowBook(String title) {

        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                book.setBorrowedCopiesCount((book.getBorrowedCopiesCount() + 1));
                book.setCopiesCount((book.getCopiesCount() - 1));
                updateListOfBooksAsStrings();
            }
        }

    }

    public void returnBook(String Title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(Title)) {
                book.setBorrowedCopiesCount((book.getBorrowedCopiesCount() - 1));
                book.setCopiesCount((book.getCopiesCount() + 1));
                updateListOfBooksAsStrings();
            }
        }
    }
}