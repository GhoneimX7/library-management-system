package com.ghoneim.development.library.management.system.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Patron {
    private long id;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;

}
