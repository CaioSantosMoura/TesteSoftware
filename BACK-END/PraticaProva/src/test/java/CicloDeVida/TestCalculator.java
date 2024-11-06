package CicloDeVida;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestCalculator {

    Calculator calc;

    @BeforeAll
    public static void initAll() {
        System.out.println("Testes iniciados!");
    }

    @BeforeEach
    public void setUp() {
        calc = new Calculator();
    }

    @Test
    public void testAdd() {
        assertEquals(3, calc.add(1, 2));
    }

    @Test
    public void testSubtract() {
        assertEquals(1, calc.subtract(2, 1));
    }

    @AfterEach
    public void tearDown() {
        System.out.println("Executando cada teste!");
    }

    @AfterAll
    public static void init() {
        System.out.println("Testes realizados com sucesso!");
    }

}
