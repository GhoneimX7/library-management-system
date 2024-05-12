package com.ghoneim.development.library.management.system.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class BorrowingRecord {
    private long id;
    private Patron patron;
    private Book book;

}
