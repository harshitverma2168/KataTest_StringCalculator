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

    @Test
    public void shouldReturnSumForTwoNumbersSeparatedByComma() {
        assertEquals(3, StringCalculator.Add("1,2"));
    }

    @Test
    public void shouldReturnSumForMultipleNumbersSeparatedByComma() {
        assertEquals(8, StringCalculator.Add("1,2,4,1"));
    }

    @Test
    public void shouldAcceptNewLineAsValidDelimiter() {
        assertEquals(11, StringCalculator.Add("1\n3\n4,3"));
    }

    @Test
    public void shouldAcceptCustomDelimiter() {
        assertEquals(4, StringCalculator.Add("//;\n1;3"));
    }

    @Test
    public void shouldThrowExceptionForNegativeValues() {
        try {
            StringCalculator.Add("-2,3,4");
        } catch (RuntimeException e) {
            assertEquals("Negatives are not allowed", e.getMessage());
        }
    }

    @Test
    public void shouldShowAllNegativeValuesInExceptionMessage() {
        try {
            StringCalculator.Add("-2,-3,-4");
        } catch (RuntimeException e) {
            assertEquals("Negatives are not allowed: [-2, -3, -4]", e.getMessage());
        }
    }

    @Test
    public void shouldCountNoOfTimesAddInvoked() {
        StringCalculator sc = new StringCalculator();
        assertEquals(1,sc.GetCalledCount());
    }

}
