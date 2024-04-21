package app.code;

import app.AuthorService;
import app.ReaderRepository;
import app.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        AuthorService authorService = context.getBean(AuthorService.class);
        ReaderRepository readerRepository = context.getBean(ReaderRepository.class);

        authorService.writeBook();
        readerRepository.readBook();
    }
}
