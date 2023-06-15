package Entity;

public class Book {
    // Class Book
    // Atributes: ISBN, title, author, numberPages.
    public String isbn;
    public String title;
    public String author;
    public int numberPages;

    // Empty constructor
    public Book() {
    }

    // All-parameters constructor
    public Book(String isbn, String title, String author, int numberPages) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.numberPages = numberPages;
    }

    // Getters and setters
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumberPages() {
        return numberPages;
    }

    public void setNumberPages(int numberPages) {
        this.numberPages = numberPages;
    }

}
