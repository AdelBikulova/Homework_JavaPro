package app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ReaderRepository {
    private final Book book;

    @Autowired
    public ReaderRepository(Book book) {
        this.book = book;
    }

    public void readBook() {
        book.open();
    }
}