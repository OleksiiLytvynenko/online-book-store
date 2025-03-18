package me.krumka.onlinebookstore.service;

import java.util.List;
import me.krumka.onlinebookstore.model.Book;

public interface BookService {
    Book save(Book book);

    List<Book> findAll();
}
