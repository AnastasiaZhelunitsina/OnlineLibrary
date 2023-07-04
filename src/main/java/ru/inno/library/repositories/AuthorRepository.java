package ru.inno.library.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.inno.library.models.Author;

import java.util.List;

public interface AuthorRepository extends JpaRepository<Author, Long>{
    List<Author> findAllByStateNot(Author.State state);
}
