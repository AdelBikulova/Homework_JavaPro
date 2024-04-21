package app;


public class Reader {
    private Book book;

    public Reader(Book book) {
        this.book = book;
    }

    public void readBook() {
        book.open();
    }
}

