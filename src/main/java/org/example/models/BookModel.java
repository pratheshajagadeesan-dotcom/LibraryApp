package org.example.models;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

/**
 * Represent a book in the library.
 */

@Entity
@Table(name = "books")
public class BookModel extends LibraryItem {

    private String author;
    @Column(name = "book_year")
    private Integer year;
    private BookStatus status;

    protected BookModel() {
    }



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
