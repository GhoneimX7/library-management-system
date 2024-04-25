package com.ghoneim.development.library.management.system.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
@Entity
public class BorrowingRecord {
    private long id;
    private Patron patron;
    private Book book;

}
