package org.example;

import org.example.models.BookModel;
import org.example.models.BookStatus;

import java.util.Comparator;
import java.util.List;

public class BookSorter {

    public List<BookModel> sortByTitle(
            List<BookModel> books) {

        return books.stream()
                .sorted(
                        Comparator.comparing(
                                BookModel::getTitle
                        )
                )
                .toList();
    }

    public List<BookModel> sortByAuthor(
            List<BookModel> books) {

        return books.stream()
                .sorted(
                        Comparator.comparing(
                                BookModel::getAuthor
                        )
                )
                .toList();
    }

    public List<BookModel> sortByYear(
            List<BookModel> books) {

        return books.stream()
                .sorted(
                        Comparator.comparing(
                                BookModel::getYear
                        )
                )
                .toList();
    }

    public List<BookModel> sortByTitleThenAuthor(
            List<BookModel> books) {

        return books.stream()
                .sorted(
                        Comparator.comparing(
                                        BookModel::getTitle
                                )
                                .thenComparing(
                                        BookModel::getAuthor
                                )
                )
                .toList();
    }

    public List<BookModel> getAvailableBooks(
            List<BookModel> books) {

        return books.stream()
                .filter(
                        book -> book.getStatus()
                                == BookStatus.AVAILABLE
                )
                .toList();
    }

    public List<String> getAllTitles(
            List<BookModel> books) {

        return books.stream()
                .map(
                        BookModel::getTitle
                )
                .toList();
    }
}
