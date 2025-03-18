package me.krumka.onlinebookstore.repository;

import java.util.List;
import me.krumka.onlinebookstore.model.Book;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository {
    Book save(Book book);

    List<Book> findAll();
}
