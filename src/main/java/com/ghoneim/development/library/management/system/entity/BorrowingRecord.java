package com.ghoneim.development.library.management.system.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity()
@Table(name = "borrowing_record", schema = "library")
public class BorrowingRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "patron_id", nullable = false)
    private long patronId;

    @Column(name = "book_id", nullable = false)
    private long bookId;
}
