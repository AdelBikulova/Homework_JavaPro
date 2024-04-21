package app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {
    private final Book book;

    @Autowired
    public AuthorService(@Qualifier("book1") Book book) {
        this.book = book;
    }

    public void writeBook() {
        book.create();
    }
}
