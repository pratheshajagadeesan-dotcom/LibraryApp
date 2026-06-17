package org.example.models;

/**
 * Represents a book loan.
 */

public class Loan {

    private Long loanId;
    private BookModel book;
    private Member member;

    public Loan(Long loanId,
                BookModel book,
                Member member) {

        if (loanId == null) {
            throw new IllegalArgumentException(
                    "Loan Id cannot be null");
        }

        if (book == null) {
            throw new IllegalArgumentException(
                    "Book cannot be null");
        }

        if (member == null) {
            throw new IllegalArgumentException(
                    "Member cannot be null");
        }
        
        this.loanId = loanId;
        this.book = book;
        this.member = member;

    }
}
