import org.example.OrderProcessor;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class OrderProcessorTest2Method {

    OrderProcessor orderProcessor = new OrderProcessor();

    // Método faz a multiplicação entre quantidade e preço
    static Stream<Arguments> Quantidade_X_Preco() {
        return Stream.of(
                org.junit.jupiter.params.provider.Arguments.of(1, 100.0, 100.0),
                org.junit.jupiter.params.provider.Arguments.of(10, 50.0, 500.0),
                org.junit.jupiter.params.provider.Arguments.of(5, 20.5, 102.5),
                org.junit.jupiter.params.provider.Arguments.of(3, 0, 0.0)
        );
    }

    @ParameterizedTest
    @MethodSource("Quantidade_X_Preco")
    public void testMultiplicacao(int quantidade, double preco, double expectedTotal){
        assertEquals(expectedTotal, orderProcessor.processOrder(quantidade, preco));
    }

    @Test
    public void testQuantidadeNegativo_PrecoNegativo() {
        assertThrows(IllegalArgumentException.class, () -> orderProcessor.processOrder(-10,20),
                "A Quantidade não pode ser negativa");
        assertThrows(IllegalArgumentException.class, () -> orderProcessor.processOrder(10,-5),
                "O preço não pode ser negativo");
    }
}
