package Services;

import Entity.Book;
import java.util.Scanner;

public class BookServices {

    public Book inputBook() {
        Book book = new Book();
        Scanner read = new Scanner(System.in);

        System.out.println("Enter the following information about the book");
        System.out.println("Title:");
        book.setTitle(read.nextLine());
        System.out.println("Author:");
        book.setAuthor(read.nextLine());
        System.out.println("Number of pages:");
        book.setNumberPages(read.nextInt());
        System.out.println("ISBN code without \"-\":");
        book.setIsbn(read.next());
        read.close();

        return book;
    }

    public void showBook(Book book) {
        // ISBN, title, author, numberPages.
        String title = book.getTitle();
        System.out.println("Title: " + title);
        String author = book.getAuthor();
        System.out.println("Author: " + author);
        int numberPages = book.getNumberPages();
        System.out.println("Number of pages: " + numberPages);
        String isbn = book.getIsbn();
        System.out.println("ISBN code without \"-\": " + isbn);

    }
}
