import Entity.Book;
import Services.BookServices;

public class Menu {
    public static void main(String[] args) {
        // EXERCISE 2 - OOP - Object-oriented Programming
        // Program that asks the user for the atributes of a book, and then shows it to
        // them.
        Book bookA = new Book();
        BookServices bookServices = new BookServices();
        bookA = bookServices.inputBook();
        bookServices.showBook(bookA);

    }
}
