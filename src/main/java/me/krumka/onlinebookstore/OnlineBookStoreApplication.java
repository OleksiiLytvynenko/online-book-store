package me.krumka.onlinebookstore;

import java.math.BigDecimal;
import me.krumka.onlinebookstore.model.Book;
import me.krumka.onlinebookstore.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class OnlineBookStoreApplication {
    @Autowired
    private BookService bookService;

    public static void main(String[] args) {
        SpringApplication.run(OnlineBookStoreApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner() {
        return args -> {
            Book book1 = new Book();
            book1.setTitle("Book 1");
            book1.setAuthor("Krumka");
            book1.setPrice(BigDecimal.valueOf(299));
            book1.setIsbn("978-3-16-148410-0");

            bookService.save(book1);

            System.out.println(bookService.findAll());
        };
    }
}
