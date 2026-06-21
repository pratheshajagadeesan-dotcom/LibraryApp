import org.example.models.Loan;
import org.example.models.BookModel;
import org.example.models.BookStatus;
import org.example.models.Member;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;

import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;

public class LoanTest {

        private Loan loan;
        private BookModel book;
        private Member member;

    @BeforeEach
    void setUp() {

        book = new BookModel(
                1L,
                "Shantaram",
                "Gregory David Roberts",
                2003,
                BookStatus.AVAILABLE
        );

        member = new Member(
                1L,
                "Prathesha"
        );

        loan = new Loan(
                1L,
                book,
                member
        );
    }

    @Test
    void testLoanId() {

        Long loanId = loan.getLoanId();

        assertEquals(
                1L,
                loanId
        );

    }

    @Test
    void testBook() {

        BookModel actualBook = loan.getBook();

        assertEquals(
                book,
                actualBook
        );
    }

    @Test
    void testMember() {

        Member actualMember = loan.getMember();

        assertEquals(
                member,
                actualMember
        );
    }

    @Test
    void testNullLoanId() {

        assertThrows(
                IllegalArgumentException.class,
                () -> new Loan(
                        null,
                        book,
                        member
                )
        );
    }

    @Test
    void testNullBook() {

        assertThrows(
                IllegalArgumentException.class,
                () -> new Loan(
                        1L,
                        null,
                        member
                )
        );
    }

    @Test
    void testMockCreation() {

        Object obj = mock(Object.class);

    }

    @Test
    void testWhenThenReturn() {

        List<String> list = mock(List.class);

        when(list.get(0))
                .thenReturn("Java");

        assertEquals(
                "Java",
                list.get(0)
        );
    }

    @Test
    void testVerify() {

        List<String> list = mock(List.class);

        list.add("Java");

        verify(list).add("Java");
    }

}

