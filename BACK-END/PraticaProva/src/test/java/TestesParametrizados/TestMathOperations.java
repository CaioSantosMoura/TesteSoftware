package TestesParametrizados;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMathOperations {

    @ParameterizedTest
    @CsvSource({"1, 2, 3",
            "5, 5, 10",
            "10, 15, 25",
            "-1, -1, -2"})
    public void testAdd(int a, int b, int expected) {
        MathOperations calc = new MathOperations();
        assertEquals(expected, calc.add(a, b));
    }
}
