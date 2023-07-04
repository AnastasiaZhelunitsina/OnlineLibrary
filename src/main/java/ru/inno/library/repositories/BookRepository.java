package ru.inno.library.repositories;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.inno.library.models.Book;

public interface BookRepository extends JpaRepository<Book, Long>{
    List<Book> findAllByStateNot(Book.State state);
}