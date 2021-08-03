package calculator;

import org.junit.*;

import static org.junit.Assert.*;

public class StringCalculatorTest {
    @Test
    public void shouldReturnZeroForEmptyString() {
        assertEquals(0, StringCalculator.Add(""));
    }

    @Test
    public void shouldReturnNumberForNumber() {
        assertEquals(1, StringCalculator.Add("1"));
    }
}
