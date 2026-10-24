import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

public class DateCheckerTest {

    DateChecker dateChecker = new DateChecker();

    @Test
    public void testJanuaryHas31Days() {
        assertTrue(dateChecker.has31Days(DateChecker.Month.JANUARY));
    }

    @Test
    public void testAprilHas30Days() {
        assertFalse(dateChecker.has31Days(DateChecker.Month.APRIL));
    }

    @Test
    public void testMarchHas31Days() {
        assertTrue(dateChecker.has31Days(DateChecker.Month.MARCH));
    }

    @ParameterizedTest
    @EnumSource(value = DateChecker.Month.class, names = {
            "JANUARY", "MARCH", "MAY", "JULY",
            "AUGUST", "OCTOBER", "DECEMBER"
    })
    public void testAll31DayMonths(DateChecker.Month month) {
        assertTrue(
                dateChecker.has31Days(month),
                month + " should have 31 days"
        );
    }

    @ParameterizedTest
    @EnumSource(value = DateChecker.Month.class, names = {
            "APRIL", "JUNE", "SEPTEMBER", "NOVEMBER"
    })
    public void testAll30DayMonths(DateChecker.Month month) {
        assertFalse(
                dateChecker.has31Days(month),
                month + " should not have 31 days"
        );
    }

    @Test
    public void testFebruary() {
        assertFalse(
                dateChecker.has31Days(DateChecker.Month.FEBRUARY),
                "February should not have 31 days"
        );
    }
}