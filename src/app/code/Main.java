package app.code;

import app.Author;
import app.Reader;
import app.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Author author = context.getBean(Author.class);
        Reader reader = context.getBean(Reader.class);

        author.writeBook();
        reader.readBook();
    }
}
