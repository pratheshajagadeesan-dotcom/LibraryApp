package org.example;

import org.example.models.BookModel;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        FileRepository repository =
                new FileRepository();

        List<BookModel> books = repository.load();

        repository.save(books);

        System.out.println("Save successful");

        Book book1 = new Book(1L, "Shantaram", "Gregory David Roberts", 2003);
        Book book2 = new Book(2L, "The Long Walk", "Slawomir Rawicz", 1956);
        Book book3 = new Book(3L, "Kon-Tiki", "Thor Heyerdahl", 1948);
        Book book4 = new Book(4L, "The Snow Leopard", "Peter Matthiessen", 1978);
        Book book5 = new Book(5L, "In Patagonia", "Bruce Chatwin", 1977);

        Book book6 = new Book(6L, "The Beach", "Alex Garland", 1996);
        Book book7 = new Book(7L, "The Road", "Cormac McCarthy", 2006);
        Book book8 = new Book(8L, "The Lost City of Z", "David Grann", 2009);
        Book book9 = new Book(9L, "Into the Wild", "Jon Krakauer", 1996);
        Book book10 = new Book(10L, "The Motorcycle Diaries", "Che Guevara", 1993);

        Book book11 = new Book(11L, "Tracks", "Robyn Davidson", 1980);
        Book book12 = new Book(12L, "Papillon", "Henri Charriere", 1969);
        Book book13 = new Book(13L, "The Way Back", "Lilya Litvyak", 2011);
        Book book14 = new Book(14L, "Seven Years in Tibet", "Heinrich Harrer", 1952);
        Book book15 = new Book(15L, "The Pilgrimage", "Paulo Coelho", 1987);

        Book book16 = new Book(16L, "A Walk in the Woods", "Bill Bryson", 1998);
        Book book17 = new Book(17L, "Desert Solitaire", "Edward Abbey", 1968);
        Book book18 = new Book(18L, "The River of Doubt", "Candice Millard", 2005);
        Book book19 = new Book(19L, "Endurance", "Alfred Lansing", 1959);
        Book book20 = new Book(20L, "The Narrow Road to the Deep North", "Richard Flanagan", 2013);

        System.out.printf("%-5s %-40s %-30s %-5s%n",
                "ID", "TITLE", "AUTHOR", "YEAR");

        System.out.printf("%-5d %-40s %-30s %-5d%n", book1.id(), book1.title(), book1.author(), book1.year());
        System.out.printf("%-5d %-40s %-30s %-5d%n", book2.id(), book2.title(), book2.author(), book2.year());
        System.out.printf("%-5d %-40s %-30s %-5d%n", book3.id(), book3.title(), book3.author(), book3.year());
        System.out.printf("%-5d %-40s %-30s %-5d%n", book4.id(), book4.title(), book4.author(), book4.year());
        System.out.printf("%-5d %-40s %-30s %-5d%n", book5.id(), book5.title(), book5.author(), book5.year());
        System.out.printf("%-5d %-40s %-30s %-5d%n", book6.id(), book6.title(), book6.author(), book6.year());
        System.out.printf("%-5d %-40s %-30s %-5d%n", book7.id(), book7.title(), book7.author(), book7.year());
        System.out.printf("%-5d %-40s %-30s %-5d%n", book8.id(), book8.title(), book8.author(), book8.year());
        System.out.printf("%-5d %-40s %-30s %-5d%n", book9.id(), book9.title(), book9.author(), book9.year());
        System.out.printf("%-5d %-40s %-30s %-5d%n", book10.id(), book10.title(), book10.author(), book10.year());

        System.out.printf("%-5d %-40s %-30s %-5d%n", book11.id(), book11.title(), book11.author(), book11.year());
        System.out.printf("%-5d %-40s %-30s %-5d%n", book12.id(), book12.title(), book12.author(), book12.year());
        System.out.printf("%-5d %-40s %-30s %-5d%n", book13.id(), book13.title(), book13.author(), book13.year());
        System.out.printf("%-5d %-40s %-30s %-5d%n", book14.id(), book14.title(), book14.author(), book14.year());
        System.out.printf("%-5d %-40s %-30s %-5d%n", book15.id(), book15.title(), book15.author(), book15.year());
        System.out.printf("%-5d %-40s %-30s %-5d%n", book16.id(), book16.title(), book16.author(), book16.year());
        System.out.printf("%-5d %-40s %-30s %-5d%n", book17.id(), book17.title(), book17.author(), book17.year());
        System.out.printf("%-5d %-40s %-30s %-5d%n", book18.id(), book18.title(), book18.author(), book18.year());
        System.out.printf("%-5d %-40s %-30s %-5d%n", book19.id(), book19.title(), book19.author(), book19.year());
        System.out.printf("%-5d %-40s %-30s %-5d%n", book20.id(), book20.title(), book20.author(), book20.year());

    }
}