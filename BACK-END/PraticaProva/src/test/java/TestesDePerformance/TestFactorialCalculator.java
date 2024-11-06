package TestesDePerformance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestFactorialCalculator {

    @Test
    public void testPerformanceFactorialCalculator() {
        FactorialCalculator factorialCalculator = new FactorialCalculator();
        int numeroFatorial = 5;

        long startTime = System.nanoTime();
        long resultado = factorialCalculator.factorial(numeroFatorial);
        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        System.out.println("Tempo para calcular " + numeroFatorial + "! : " + duration + " nanosegundos");

        assertEquals(120, resultado);
    }
}
