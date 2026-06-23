package org.example.models;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;

/**
 * Represents a book loan.
 */
@Entity
public class Loan {

    @Id
    private Long loanId;

    @ManyToOne
    @JoinColumn(name = "book_id")
    private BookModel book;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;

    protected Loan() {
    }

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

    public Long getLoanId() {
        return loanId;
    }

    public BookModel getBook() {
        return book;
    }

    public Member getMember() {
        return member;
    }
}
