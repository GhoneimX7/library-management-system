package com.ghoneim.development.library.management.system.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity()
@Table(
        name = "patron",
        schema = "library",
        uniqueConstraints = {
                @UniqueConstraint(
                        name = "email_unique",
                        columnNames = "email"
                ),
                @UniqueConstraint(
                        name = "phone_number_unique",
                        columnNames = "phone_number"
                )
        }
        )
public class Patron {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "patron_generator")
    @SequenceGenerator(name = "patron_generator", sequenceName = "patron_sequence", allocationSize = 1)
    @Column(name = "id")
    private long id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "phone_number", nullable = false)
    private String phoneNumber;

}
