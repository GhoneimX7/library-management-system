package com.ghoneim.development.library.management.system.repository;

import com.ghoneim.development.library.management.system.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {

}
