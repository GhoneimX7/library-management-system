package com.ghoneim.development.library.management.system.service;

import com.ghoneim.development.library.management.system.entity.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {
    public List<Book> books() {
        List<Book> bookList = new ArrayList<>();
        return new ArrayList<Book>();
    }
}
