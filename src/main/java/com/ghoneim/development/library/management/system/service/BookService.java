package com.ghoneim.development.library.management.system.service;

import com.ghoneim.development.library.management.system.entity.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {
    public List<Book> getBooks(){

        List<Book> books = new ArrayList<>();
        books.add(new Book(1, "title", "author", 1999, "765924672937"));
        return books;
    }

}
