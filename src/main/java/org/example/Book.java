package org.example;

public record Book(
        Long id,
        String title,
        String author,
        int year
) {}
