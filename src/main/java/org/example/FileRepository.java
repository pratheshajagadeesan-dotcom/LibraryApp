package org.example;

import org.example.models.BookModel;
import org.example.models.BookStatus;
import java.util.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class FileRepository {

    public List<BookModel> load() {

        List<BookModel> books =
                new ArrayList<>();

        Path path =
                Path.of(
                        "src/main/resources/books.csv"
                );

        try (
                BufferedReader reader =
                        Files.newBufferedReader(path)
        ) {

            String line = reader.readLine();

            while (line != null) {

                System.out.println(line);

                String[] parts = line.split(",");

                Long id = Long.parseLong(parts[0]);
                String title = parts[1];
                String author = parts[2];
                Integer year = Integer.parseInt(parts[3]);

                BookModel book = new BookModel(
                        id,
                        title,
                        author,
                        year,
                        BookStatus.AVAILABLE
                );

                books.add(book);

                System.out.println("Books loaded: " + books.size());

                line = reader.readLine();
            }

        } catch (IOException e) {

            e.printStackTrace();
        }

        return books;
    }

    public void save(
            List<BookModel> books) {

        Path path = Path.of("src/main/resources/books.csv");

        StringBuilder content = new StringBuilder();

        for (BookModel book : books) {

            content.append(
                    book.getId() + "," +
                            book.getTitle() + "," +
                            book.getAuthor() + "," +
                            book.getYear()
            );

            content.append("\n");

        }

        try {
            Files.writeString(path, content.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
