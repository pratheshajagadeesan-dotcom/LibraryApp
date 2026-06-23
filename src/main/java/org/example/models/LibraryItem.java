package org.example.models;

import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.MappedSuperclass;

/**
 * Base class for all library items.
 */

@MappedSuperclass
public abstract class LibraryItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;
    protected String title;

    protected LibraryItem() {
    }

    public LibraryItem(Long id, String title) {

        if (id == null) {
            throw new IllegalArgumentException(
                    "Id cannot be null");
        }

        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException(
                    "Title cannot be empty");
        }

        this.id = id;
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }
}
