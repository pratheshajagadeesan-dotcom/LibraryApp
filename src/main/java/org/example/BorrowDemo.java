package org.example;

import org.example.exceptions.BookNotFoundException;

public class BorrowDemo {

    public static void borrowBook(
            Long bookId)
            throws BookNotFoundException {

        if (!bookId.equals(1L)) {

            throw new BookNotFoundException(
                    "Book ID " + bookId
                            + " not found"
            );
        }

        System.out.println(
                "Book borrowed successfully"
        );
    }

    public static void main(
            String[] args) {

        try {

            borrowBook(100L);

        } catch (
                BookNotFoundException e) {

            System.out.println(
                    e.getMessage()
            );
        }
    }
}
