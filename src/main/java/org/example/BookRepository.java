package org.example;

import org.example.models.BookModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository
        extends JpaRepository<BookModel, Long> {

}