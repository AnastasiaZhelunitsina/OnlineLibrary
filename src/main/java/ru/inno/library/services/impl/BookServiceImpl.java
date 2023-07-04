package ru.inno.library.services.impl;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import ru.inno.library.dto.BookForm;
import ru.inno.library.models.Book;
import ru.inno.library.repositories.BookRepository;
import ru.inno.library.services.BookService;

import java.util.List;

@RequiredArgsConstructor
@Service
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    @Override
    public List<Book> getBooks() {
        return bookRepository.findAllByStateNot(Book.State.DELETED);
    }
    @Override
    public Book getBook(Long bookId) { return bookRepository.findById(bookId).orElseThrow();}

    @Override
    public void addBook(Book book) {
        Book newBook = Book.builder()
                .title(book.getTitle())
                .description(book.getDescription())
                .state(Book.State.CONFIRMED)
                .build();

        bookRepository.save(newBook);
    }

    @Override
    public void deleteBook(Long bookId) {
        Book bookForDelete = bookRepository.findById(bookId).orElseThrow();
        bookForDelete.setState(Book.State.DELETED);

        bookRepository.save(bookForDelete);
    }

    @Override
    public void updateBook(Long bookId, BookForm updateData) {
        Book bookForUpdate = bookRepository.findById(bookId).orElseThrow();

        bookForUpdate.setTitle(updateData.getTitle());
        bookForUpdate.setDescription(updateData.getDescription());

        bookRepository.save(bookForUpdate);
    }
}