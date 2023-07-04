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
@Table(name = "publishers")
public class Publisher {

    public enum State {
        CONFIRMED, DELETED
    }

    @Enumerated(value = EnumType.STRING)
    private Publisher.State state;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", unique = true, nullable = false)
    private String name;

    @ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE}, mappedBy = "publishers")
    private Set<Book> books = new HashSet<Book>();
}