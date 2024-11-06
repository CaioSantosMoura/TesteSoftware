import org.example.Calculadora;
import org.junit.jupiter.api.Test;

import javax.sound.sampled.Port;

import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraComExeTest {

    @Test
    public void testDivide() {
        Calculadora calc = new Calculadora();
        assertEquals(2, calc.divide(4, 2)); // Teste de divisão normal
    }

    @Test
    public void testDivideByZero() {
        Calculadora calc = new Calculadora();
        assertThrows(IllegalArgumentException.class, () -> calc.divide(4, 0),
                "Divisor não pode ser zero");
    }
}
