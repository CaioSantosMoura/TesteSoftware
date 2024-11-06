import org.example.Calculadora;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.*;

public class CalculadoraTest {
    @Test
    public void testSoma() {
        // Esperamos que a soma de 2 + 3 seja 5
        Calculadora calc = new Calculadora();
        int resultado = calc.soma(2,3);
        assertEquals(5, resultado);
        assertEquals(10, calc.soma(5, 5));
        assertEquals(0, calc.soma(0, 0));
        assertEquals(-1, calc.soma(1, -2)); // Teste com números negativos
    }
}
