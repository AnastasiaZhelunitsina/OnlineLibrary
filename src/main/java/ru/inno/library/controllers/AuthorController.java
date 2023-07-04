package ru.inno.library.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import ru.inno.library.dto.AuthorForm;
import ru.inno.library.services.AuthorService;

@RequiredArgsConstructor
@Controller
public class AuthorController {

    private final AuthorService authorService;


    @GetMapping("/authors")
    public String getAuthors(@RequestParam(value = "orderBy", required = false) String orderBy,
                                 @RequestParam(value = "dir", required = false) String direction, Model model) {

        model.addAttribute("authors", authorService.getAuthors());
        return "authors/authors_page";
    }

    @GetMapping("/authors/{author-id}")
    public String getAuthor(@PathVariable("author-id") Long authorId, Model model) {
        model.addAttribute("author", authorService.getAuthor(authorId));
        return "authors/author_page";
    }

    @PostMapping("/authors")
    public String addAuthor(AuthorForm author) {
        authorService.addAuthor(author);
        return "redirect:/authors";
    }

    @PostMapping("/authors/{author-id}/update")
    public String updateAuthor(@PathVariable("author-id") Long authorId, AuthorForm author) {
        authorService.updateAuthor(authorId, author);
        return "redirect:/authors/" + authorId;
    }


    @GetMapping("/authors/{author-id}/delete")
    public String deleteAuthor(@PathVariable("author-id") Long authorId) {
        authorService.deleteAuthor(authorId);
        return "redirect:/authors/";
    }
}