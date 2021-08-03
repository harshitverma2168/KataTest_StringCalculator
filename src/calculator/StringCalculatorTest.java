package calculator;

import org.junit.*;
import static org.junit.Assert.*;
public class StringCalculatorTest {
    @Test
    public void shouldReturnZeroForEmptyString(){
        assertEquals(0,StringCalculator.Add(""));
    }
}
