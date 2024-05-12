package com.ghoneim.development.library.management.system.service;

import com.ghoneim.development.library.management.system.entity.Book;
import com.ghoneim.development.library.management.system.repository.BookRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<Book> getBooks(){
        return bookRepository.findAll();
    }

}
