package Services;

import Entity.Book;

public class BookServices {

    public Book inputBook(String isbn, String title, String author, int numberPages) {
        // Agarro la información que me manda el main, y creo el objeto con el método
        // constructor que hice en la clase del objeto/Entidad.
        Book book = new Book(isbn, title, author, numberPages);
        return book;
    }

    public String showBook(Book book) {
        // ISBN, title, author, numberPages.
        // Declaro mi variable de retorno "ret". Es un String, porque vamos a pasar toda
        // la información en esta variable.

        String ret = "";

        // Recojo la información de cada atributo del objeto en unas variables.
        String title = book.getTitle();
        String author = book.getAuthor();
        int numberPages = book.getNumberPages();
        String isbn = book.getIsbn();

        // Y ahora, escribo lo que voy a mandar en mi variable retorno. Cuando se agrega
        // "\n", es para hacer salto de línea.
        ret = "ISBN code: " + isbn + "\nTitle: " + title + "\nAuthor: " + author + "\nNumber of pages: " + numberPages;
        return ret;

    }

}
