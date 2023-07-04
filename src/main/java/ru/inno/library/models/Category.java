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
@Table(name = "categories")
public class Category {

    public enum State {
        CONFIRMED, DELETED
    }

    @Enumerated(value = EnumType.STRING)
    private Category.State state;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", length = 50, unique = true, nullable = false)
    private String name;

    @Column(name = "summary", length = 250, nullable = false)
    private String summary;

    @ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE}, mappedBy = "categories")
    private Set<Book> books = new HashSet<Book>();
}