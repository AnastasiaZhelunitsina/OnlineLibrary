package ru.inno.library.services;

import ru.inno.library.dto.AuthorForm;

public interface AuthorService {

    void deleteAuthor(Long id);

    void updateAuthor(Long authorId, AuthorForm author);

    Object getAuthors();

    Object getAuthor(Long authorId);

    void addAuthor(AuthorForm author);
}