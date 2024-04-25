package com.ghoneim.development.library.management.system.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@AllArgsConstructor
@Data
public class Book {
    private long id;
    private String title;
    private String author;
    private LocalDate publicationYear;
    private String ISBN;

}
