package app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("book1")
public class Book {
    @Value("Книга написана")
    private String creationMessage;

    public void create() {
        System.out.println(creationMessage);
    }

    public void open() {
        System.out.println("Книга прочитана");
    }
}