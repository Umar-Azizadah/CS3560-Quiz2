// Calculator will be tested in here
// TDD will be used
//1 - Write failing unit test first
//2 - Write just enough of production code to pass unit test

import org.junit.jupiter.api.Test; // For annotation

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    // As we are testing calculator here we will need to instanitate it
    Calculator calculator = new Calculator();

    // To create a unit test - All unit test in JUnit will need to be
    // public void methods

    @Test
    public void testSum() {
        // Test positive numbers
        int expected = 4;
        int actual = calculator.sum(1, 3);
        assertEquals(expected, actual);

        // Test negative numbers
        expected = -5;
        actual = calculator.sum(-3, -2);
        assertEquals(expected, actual);

        // Test zero
        expected = 2;
        actual = calculator.sum(0, 2);
        assertEquals(expected, actual);
    }

    @Test
    public void testSubtract() {
        // Positive result
        int expected = 4;
        int actual = calculator.subtract(2, -2);
        assertEquals(expected, actual);

        // Negative result
        expected = -2;
        actual = calculator.subtract(1, 3);
        assertEquals(expected, actual);

        // Subtracting 0
        expected = 5;
        actual = calculator.subtract(5, 0);
        assertEquals(expected, actual);
    }
}
