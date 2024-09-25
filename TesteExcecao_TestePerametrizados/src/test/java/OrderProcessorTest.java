import org.example.Calculadora;
import org.example.Calculadora_SomaSubtracao;
import org.example.OrderProcessor;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class OrderProcessorTest {
    OrderProcessor orderProcessor = new OrderProcessor();

    @ParameterizedTest
    @CsvSource({
            "1, 100.0, 100.0",
            "10, 50.0, 500.0",
            "5, 20.5, 102.5",
            "3, 0, 0.0"
    })

    public void testProcessOrderValidCases(int quantidade, double preco, double expectedTotal){
        double total = orderProcessor.processOrder(quantidade, preco);
        assertEquals(expectedTotal, total);
    }

    @Test
    public void testQuantidadeNegativo_PrecoNegativo() {
        assertThrows(IllegalArgumentException.class, () -> orderProcessor.processOrder(-10,20),
                "A Quantidade não pode ser negativa");
        assertThrows(IllegalArgumentException.class, () -> orderProcessor.processOrder(10,-5),
                "O preço não pode ser negativo");
    }
}
