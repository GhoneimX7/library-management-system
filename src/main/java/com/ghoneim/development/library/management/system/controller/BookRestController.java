package com.ghoneim.development.library.management.system.controller;

import com.ghoneim.development.library.management.system.dto.BookRequest;
import com.ghoneim.development.library.management.system.entity.Book;
import com.ghoneim.development.library.management.system.service.BookService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookRestController {

    @Autowired
    private BookService bookService;

    @GetMapping()
    public ResponseEntity<List<Book>> getBooks(){
        return new ResponseEntity<>(bookService.getBooks(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Book> getBook(@PathVariable(name = "id") long id){
        return new ResponseEntity<>(bookService.getBook(id), HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<Book> saveBook(@RequestBody @Valid BookRequest bookRequest) {
        return new ResponseEntity<>(bookService.saveBook(bookRequest), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Book> updateBook(@PathVariable long id, @RequestBody BookRequest bookRequest) {
        return new ResponseEntity<>(bookService.updateBook(id, bookRequest), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> deleteBook(@PathVariable long id) {
        return new ResponseEntity<>(bookService.deleteBook(id), HttpStatus.OK);
    }

}
