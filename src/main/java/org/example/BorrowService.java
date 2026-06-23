package org.example;

import org.example.models.BookModel;
import org.example.models.BookStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BorrowService {

    private final BookRepository bookRepository;

    public BorrowService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Transactional
    public void borrow(Long bookId) {

        BookModel book = bookRepository.findById(bookId)
                .orElseThrow(() ->
                        new RuntimeException("Book not found"));

        if (book.getStatus() != BookStatus.AVAILABLE) {
            throw new RuntimeException("Book is not available");
        }

        book.setStatus(BookStatus.BORROWED);

        bookRepository.save(book);

        System.out.println("Book borrowed successfully");
    }

    @Transactional
    public void returnBook(Long bookId) {

        BookModel book = bookRepository.findById(bookId)
                .orElseThrow(() ->
                        new RuntimeException("Book not found"));

        book.setStatus(BookStatus.AVAILABLE);

        bookRepository.save(book);

        System.out.println("Book returned successfully");
    }
}