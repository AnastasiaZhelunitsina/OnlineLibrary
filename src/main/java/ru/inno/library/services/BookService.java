package ru.inno.library.services;

import java.util.List;

import ru.inno.library.dto.BookForm;
import ru.inno.library.models.Book;

public interface BookService {

    void deleteBook(Long id);

    void updateBook(Long bookId, BookForm bookForm);

    List<Book> getBooks();

    Book getBook(Long bookId);

    void addBook(Book book);
}