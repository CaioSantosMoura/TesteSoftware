import org.example.Calculadora;
import org.example.Calculadora_SomaSubtracao;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest_SomaSubtracao {

    @ParameterizedTest
    @CsvSource({"1, 2, 3", "5, 5, 10", "10, 15, 25", "-1, -1, -2"})
    public void testAdd(int a, int b, int expected) {
        Calculadora_SomaSubtracao calc = new Calculadora_SomaSubtracao();
        assertEquals(expected, calc.add(a, b));
    }

    @ParameterizedTest
    @CsvSource({"5, 2, 3", "10, 5, 5", "20, 10, 10", "0, -1, 1"})
    public void testSubtract(int a, int b, int expected) {
        Calculadora_SomaSubtracao calc = new Calculadora_SomaSubtracao();
        assertEquals(expected, calc.subtract(a, b));
    }
}
