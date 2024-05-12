package com.ghoneim.development.library.management.system.service;

import com.ghoneim.development.library.management.system.entity.Book;
import com.ghoneim.development.library.management.system.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<Book> getBooks(){
        return bookRepository.findAll();
    }

    public Book getBookById(long id) {
        return bookRepository.findById(id).isPresent()? bookRepository.findById(id).get():null;
    }

    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }

    public Book updateBook(long id, Book book) {
        if(bookRepository.findById(id).isPresent()) {
            book.setId(id);
        }
        return bookRepository.save(book);
    }

    public boolean deleteBook(long id) {
        bookRepository.deleteById(id);
        return true;
    }
}
