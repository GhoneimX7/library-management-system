package com.ghoneim.development.library.management.system.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@AllArgsConstructor
@Data
public class Book {
    private long id;
    private String title;
    private String author;
    private int publicationYear;
    private String ISBN;

}
