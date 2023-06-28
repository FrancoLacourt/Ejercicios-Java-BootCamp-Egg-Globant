/*Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.
*/


package ejercicio01poo;

import Entity.Book;
import Service.ServiceBook;


public class Ejercicio01POO {
    
    
    public static void main(String[] args) {
        
        ServiceBook sb = new ServiceBook();
        Book b1 = sb.loadBook();
        System.out.println("");
        sb.showBook(b1);
    }
    
}
