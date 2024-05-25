package com.ghoneim.development.library.management.system.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
@Data
public class BookRequest {
    @NotBlank(message = "Title is required.")
    @NotNull(message = "Title is required.")
    private String title;
    private String author;
    @Max(value = 2024, message = "Should be less than 2024.")
    private int publicationYear;
    @NotBlank(message = "ISBN is required.")
    @NotNull(message = "ISBN is required.")
    private String ISBN;
}
