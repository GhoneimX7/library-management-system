package com.ghoneim.development.library.management.system.service;

import com.ghoneim.development.library.management.system.dto.BookRequest;
import com.ghoneim.development.library.management.system.entity.Book;
import com.ghoneim.development.library.management.system.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<Book> getBooks(){
        return bookRepository.findAll();
    }

    public Book getBook(long id) {
        return bookRepository.findById(id).isPresent()? bookRepository.findById(id).get():null;
    }

    @Transactional
    public Book saveBook(BookRequest bookRequest) {
        Book book = Book.build(0, bookRequest.getTitle(), bookRequest.getAuthor(), bookRequest.getPublicationYear(), bookRequest.getISBN());
        return bookRepository.save(book);
    }

    @Transactional
    public Book updateBook(long id, BookRequest bookRequest) {
        Book book = Book.build(id, bookRequest.getTitle(), bookRequest.getAuthor(), bookRequest.getPublicationYear(), bookRequest.getISBN());
        if(bookRepository.findById(id).isPresent()) {
            book.setId(id);
        }
        return bookRepository.save(book);
    }

    @Transactional
    public boolean deleteBook(long id) {
        bookRepository.deleteById(id);
        return true;
    }
}
