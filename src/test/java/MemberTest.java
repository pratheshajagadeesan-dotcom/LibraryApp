import org.example.models.Member;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MemberTest {

    private Member member;

    @BeforeEach
    void setUp() {
        member = new Member(1L, "Prathesha");
    }

    @Test
    void testMemberId() {

        Long memberId = member.getMemberId();

        assertEquals(
                1L,
                memberId
        );

    }

    @Test
    void testName() {

        String name = member.getName();

        assertEquals(
                "Prathesha",
                name
        );

    }

    @Test
    void testNullMemberId() {

        assertThrows(
                IllegalArgumentException.class,
                () -> new Member(
                        null,
                        "Prathesha"
                )
        );

    }

    @Test
    void testNullName() {

        assertThrows(
                IllegalArgumentException.class,
                () -> new Member(
                        1L,
                        null
                )
        );
    }

    @Test
    void testBlankName() {

        assertThrows(
                IllegalArgumentException.class,
                () -> new Member(
                        1L,
                        ""
                )
        );

    }
}
