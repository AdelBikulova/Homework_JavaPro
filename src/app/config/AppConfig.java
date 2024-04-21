package app.config;

import app.Author;
import app.Book;
import app.Reader;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Book book() {
        return new Book();
    }

    @Bean
    public Author author() {
        return new Author(book());
    }

    @Bean
    public Reader reader() {
        return new Reader(book());
    }
}