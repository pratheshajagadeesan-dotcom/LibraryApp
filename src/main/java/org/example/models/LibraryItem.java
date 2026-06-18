package org.example.models;

/**
 * Base class for all library items.
 */

public abstract class LibraryItem {
    protected Long id;
    protected String title;

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
