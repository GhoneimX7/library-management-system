package com.ghoneim.development.library.management.system.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity()
@Table(name = "borrowing_record", schema = "library")
public class BorrowingRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "borrowing_record_generator")
    @SequenceGenerator(name = "borrowing_record_generator", sequenceName = "borrowing_sequence", allocationSize = 1)
    @Column(name = "id")
    private long id;

    @ManyToOne()
    @JoinColumn(name = "book_id")
    private Book book;

    @ManyToOne()
    @JoinColumn(name = "patron_id")
    private Patron patron;

    @CreatedDate
    @Column(name = "borrowing date", nullable = false)
    LocalDateTime borrowingDate;
}
