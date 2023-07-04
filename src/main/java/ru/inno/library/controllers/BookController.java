package ru.inno.library.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.*;
import ru.inno.library.dto.BookForm;
import ru.inno.library.models.Book;
import ru.inno.library.services.AuthorService;
import ru.inno.library.services.BookService;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class BookController {

    private final BookService bookService;

    private AuthorService authorService;

    @GetMapping("/books")
    public String getBooks(@RequestParam(value = "orderBy", required = false) String orderBy,
                             @RequestParam(value = "dir", required = false) String direction, Model model) {

        model.addAttribute("books", bookService.getBooks());
        return "books/books_page";
    }

    @GetMapping("/books/{book-id}")
    public String getBook(@PathVariable("book-id") Long bookId, Model model) {
        model.addAttribute("book", bookService.getBook(bookId));
        return "books/book_page";
    }


    @PostMapping("/books")
    public String addBook(Book book) {
        bookService.addBook(book);
        return "redirect:/books";
    }

    @PostMapping("/books/{book-id}/update")
    public String updateBook(@PathVariable("book-id") Long bookId, BookForm bookForm) {
        bookService.updateBook(bookId, bookForm);
        return "redirect:/books/" + bookId;
    }

    @GetMapping("/books/{book-id}/delete")
    public String deleteBook(@PathVariable("book-id") Long bookId) {
        bookService.deleteBook(bookId);
        return "redirect:/books/";
    }
}