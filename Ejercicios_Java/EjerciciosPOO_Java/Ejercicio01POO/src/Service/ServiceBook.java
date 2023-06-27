package Service;

import Entity.Book;
import java.util.Scanner;

public class ServiceBook {

    Scanner input = new Scanner(System.in).useDelimiter("\n");
    
    public Book loadBook () {
        Book b1 = new Book();
        
        System.out.println("Ingrese el número de ISBN.");
        b1.setIsbn(input.nextInt());
        System.out.println("Ingrese el título del libro.");
        b1.setTitle(input.next());
        System.out.println("Ingrese el nombre del autor del libro.");
        b1.setAuthor(input.next());
        System.out.println("Ingrese el número de páginas que tiene el libro.");
        b1.setPages(input.nextInt());
        
        return b1;
    }
    
    public void showBook (Book b1) {
        System.out.println("El número de ISBN es: " + b1.getIsbn());
        System.out.println("El título del libro es: " + b1.getTitle());
        System.out.println("El nombre del autor del libro es: " + b1.getAuthor());
        System.out.println("El número de páginas que tiene el libreo es: " + b1.getPages());
    }

}
