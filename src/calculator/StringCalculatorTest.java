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
    public void shouldReturnSumForTwoNumbersSeparatedByComma(){
        assertEquals(3, StringCalculator.Add("1,2"));
    }

    @Test
    public void shouldReturnSumForMultipleNumbersSeparatedByComma(){
        assertEquals(8, StringCalculator.Add("1,2,4,1"));
    }

    @Test
    public void shouldAcceptNewLineAsValidDelimiter(){
        assertEquals(11, StringCalculator.Add("1\n3\n4,3"));
    }
}
