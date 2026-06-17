package org.example.models;

/**
 * Represent a book in the library.
 */

public class BookModel extends LibraryItem {

    private String author;
    private BookStatus status;

    public BookModel(Long id,
                     String title,
                     String author,
                     BookStatus status) {

        super(id, title);

        if (author == null || author.isBlank()) {
            throw new IllegalArgumentException(
                    "Author cannot be empty"
            );
        }

        this.author = author;
        this.status = status;

    }
}
