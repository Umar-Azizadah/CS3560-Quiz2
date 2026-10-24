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
        // Positive, negative, and zero values
        assertEquals(4,calculator.sum(1,3));
        assertEquals(-5,calculator.sum(-3, -2));
        assertEquals(2,calculator.sum(0, 2));
    }
}
