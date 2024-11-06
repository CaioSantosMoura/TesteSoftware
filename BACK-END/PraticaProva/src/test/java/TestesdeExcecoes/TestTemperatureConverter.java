package TestesdeExcecoes;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestTemperatureConverter {

    private static TemperatureConverter temperatureConverter;

    @BeforeAll
    public static void init() {
        temperatureConverter = new TemperatureConverter();
    }

    @BeforeEach
    public void setUp() {
        System.out.println("Teste realizado com sucesso");
    }

    @Test
    public void testException() throws Exception {
        Exception exception = assertThrows(Exception.class, () -> temperatureConverter.celsiusToKelvin(-273.16));
        assertEquals("Temperatura abaixo do zero absoluto", exception.getMessage());
    }

    @AfterAll
    public static void tearDown() {
        System.out.println("Teste finalizado com sucesso");
    }
}
