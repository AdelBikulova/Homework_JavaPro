package app;


public class Author {

    private Book book;

    public Author(Book book) {
        this.book = book;
    }

    public void writeBook() {
        book.create();
    }
}

