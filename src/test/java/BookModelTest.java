import org.example.models.BookModel;
import org.example.models.BookStatus;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BookModelTest {

    private BookModel book;

    @BeforeEach
    void setUp() {

        book = new BookModel(
                1L,
                "Shantaram",
                "Gregory David Roberts",
                2003,
                BookStatus.AVAILABLE
        );

    }

    @Test
    void testTitle() {

        String title = book.getTitle();

        assertEquals(
                "Shantaram",
                title
        );

    }

    @Test
    void testAuthor() {

        String author = book.getAuthor();

        assertEquals(
                "Gregory David Roberts",
                author
        );

    }


    @Test
    void testYear() {

        Integer year = book.getYear();

        assertEquals(
                2003,
                year
        );
    }

    @Test
    void testStatus() {

        BookStatus status = book.getStatus();

        assertEquals(
                BookStatus.AVAILABLE,
                status
        );

    }

    @ParameterizedTest
    @CsvSource({
            "2003",
            "2004",
            "2005"
    })
    void testYears(Integer year) {

        assertTrue(year > 1900);

    }

    @AfterEach
    void tearDown() {
        System.out.println("Test completed");
    }
}
