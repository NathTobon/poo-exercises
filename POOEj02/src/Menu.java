import java.util.Scanner;

import Entity.Book;
import Services.BookServices;

public class Menu {
    public static void main(String[] args) {
        // EXERCISE 2 - OOP - Object-oriented Programming
        // Program that asks the user for the atributes of a book, and then shows it to
        // them.
        // En el main, se busca recibir los datos del libro.
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the following information about the book");

        System.out.println("Title:");
        String title = read.nextLine();

        System.out.println("Author:");
        String author = read.nextLine();

        System.out.println("Number of pages:");
        int numberPages = read.nextInt();

        System.out.println("ISBN code without \"-\":");
        String isbn = read.next(); // Aunque son numeros, los puse en un String, porque estos numeros no son para
                                   // operarlos matemáticamente.

        read.close(); // Después de recibidos todos los elementos, se cierra el Scanner.

        // Se instancia la clase servicio
        BookServices bookServices = new BookServices();

        // Se instancia el objeto "book", a través de la clase control.
        Book book = bookServices.inputBook(isbn, title, author, numberPages);
        // Traemos la información que queremos mostrar, en un String.
        String showBook = bookServices.showBook(book);
        // Mostramos la información que traemos desde la clase Service.
        System.out.println(showBook);

    }
}
