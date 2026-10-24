import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

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
}