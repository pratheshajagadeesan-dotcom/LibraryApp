package org.example;
import org.example.models.BookModel;
import org.example.models.BookStatus;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.io.BufferedReader;
import java.io.InputStreamReader;

@SpringBootApplication
public class LibraryApplication {

    private final BookRepository bookRepository;

    public LibraryApplication(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public static void main(String[] args) {

        SpringApplication.run(
                LibraryApplication.class,
                args
        );

    }

    @Bean
    CommandLineRunner testRunner() {

        return args -> {

            BufferedReader reader =
                    new BufferedReader(
                            new InputStreamReader(
                                    getClass()
                                            .getResourceAsStream("/books.csv")
                            )
                    );

            String line;

            while ((line = reader.readLine()) != null) {

                String[] parts = line.split(",");

                BookModel book =
                        new BookModel(
                                Long.parseLong(parts[0]),
                                parts[1],
                                parts[2],
                                Integer.parseInt(parts[3]),
                                BookStatus.AVAILABLE
                        );

                bookRepository.save(book);
            }

            System.out.println(
                    "Books imported: "
                            + bookRepository.count()
            );
        };
    }

}