package com.ghoneim.development.library.management.system.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity()
@Table(
        name = "book",
        schema = "library",
        uniqueConstraints = {
                @UniqueConstraint(
                        name = "isbn_unique",
                        columnNames = "isbn"
                )
        }
        )
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "book_generator")
    @SequenceGenerator(name = "book_generator", sequenceName = "book_sequence", allocationSize = 1)
    @Column(name="id")
    private long id;

    @Column(name="title", nullable = false)
    private String title;

    @Column(name="author")
    private String author;

    @Column(name="publication_year")
    private int publicationYear;

    @Column(name="isbn", nullable = false)
    private String ISBN;

}
