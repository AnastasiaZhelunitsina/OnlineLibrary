package ru.inno.library.services.impl;

import java.util.List;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import ru.inno.library.dto.AuthorForm;
import ru.inno.library.models.Author;
import ru.inno.library.repositories.AuthorRepository;
import ru.inno.library.services.AuthorService;

@Service
@RequiredArgsConstructor
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository authorRepository;

    @Override
    public List<Author> getAuthors() {
        return authorRepository.findAllByStateNot(Author.State.DELETED);
    }

    @Override
    public Author getAuthor(Long authorId) {
        return authorRepository.findById(authorId).orElseThrow();
    }
    @Override
    public void addAuthor(AuthorForm author) {
        Author newAuthor = Author.builder()
                .firstName(author.getFirstName())
                .lastName(author.getLastName())
                .description(author.getDescription())
                .state(Author.State.CONFIRMED)
                .build();

        authorRepository.save(newAuthor);
    }

    @Override
    public void deleteAuthor(Long authorId) {
        Author authorForDelete = authorRepository.findById(authorId).orElseThrow();
        authorForDelete.setState(Author.State.DELETED);

        authorRepository.save(authorForDelete);
    }

    @Override
    public void updateAuthor(Long authorId, AuthorForm updateData) {
        Author authorForUpdate = authorRepository.findById(authorId).orElseThrow();

        authorForUpdate.setFirstName(updateData.getFirstName());
        authorForUpdate.setLastName(updateData.getLastName());

        authorRepository.save(authorForUpdate);
    }
}