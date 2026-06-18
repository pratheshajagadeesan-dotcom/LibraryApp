package org.example;

import org.example.exceptions.BookNotFoundException;
import org.example.exceptions.MemberLimitException;

public class ExceptionDemo {

    public static void main(String[] args) {

        try {

            int choice = 2;

            if (choice == 1) {
                throw new BookNotFoundException(
                        "Book ID 100 not found"
                );
            } else {
                throw new MemberLimitException(
                        "Member limit reached"
                );
            }

        } catch (BookNotFoundException |
                 MemberLimitException e) {

            System.out.println(
                    e.getMessage()
            );

        } finally {

            System.out.println(
                    "Finally block executed"
            );
        }
    }
}
