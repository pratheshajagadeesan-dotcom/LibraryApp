package org.example.models;

/**
 * Represent a book in the library.
 */

public class BookModel extends LibraryItem {

    private String author;
    private Integer year;
    private BookStatus status;

    public BookModel(Long id,
                     String title,
                     String author,
                     Integer year,
                     BookStatus status) {

        super(id, title);

        if (author == null || author.isBlank()) {
            throw new IllegalArgumentException(
                    "Author cannot be empty"
            );
        }

        if (year == null) {
            throw new IllegalArgumentException(
                    "Year cannot be null");
        }

        this.author = author;
        this.status = status;
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public Integer getYear() {
        return year;
    }

    public BookStatus getStatus() {
        return status;
    }
}
