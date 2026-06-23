package org.example;

import org.example.exceptions.BookNotFoundException;
import org.example.models.BookModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {

    private final BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @GetMapping
    public List<BookModel> getAllBooks() {
        return bookRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<BookModel> getBookById(
            @PathVariable Long id) {

        return bookRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElseThrow(() ->
                        new BookNotFoundException(
                                "Book with id " + id + " not found"
                        )
                );
    }

    @PostMapping
    public ResponseEntity<BookModel> addBook(
            @RequestBody BookModel book) {

        BookModel saved =
                bookRepository.save(book);

        return ResponseEntity.ok(saved);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBook(
            @PathVariable Long id) {

        bookRepository.deleteById(id);

        return ResponseEntity.noContent().build();
    }
}
