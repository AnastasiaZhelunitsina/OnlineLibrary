package ru.inno.library.models;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Builder
@Entity
@Table(name = "books")
public class Book {

    public enum State {
        CONFIRMED, DELETED
    }

    @Enumerated(value = EnumType.STRING)
    private Book.State state;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title", unique = true, nullable = false)
    private String title;

    @Column(name = "description", length = 250, nullable = false)
    private String description;

    @ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    @JoinTable(name = "books_authors", joinColumns = {@JoinColumn(name = "book_id")}, inverseJoinColumns = {
            @JoinColumn(name = "author_id")})
    private Set<Author> authors = new HashSet<Author>();

    @ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(name = "books_categories", joinColumns = {@JoinColumn(name = "book_id")}, inverseJoinColumns = {
            @JoinColumn(name = "category_id")})
    private Set<Category> categories = new HashSet<Category>();

    @ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(name = "books_publishers", joinColumns = {@JoinColumn(name = "book_id")}, inverseJoinColumns = {
            @JoinColumn(name = "publisher_id")})
    private Set<Publisher> publishers = new HashSet<Publisher>();
}