import org.example.PerfomanceService;
import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertArrayEquals;

public class PerformanceServiceTest {

    private PerfomanceService perfomanceService = new PerfomanceService();

    @Test
    public void testSortArrayPerformance() {
        int[] array = {5, 2, 8, 14, 1, 16, 7};

        long startTime = System.nanoTime();
        perfomanceService.sortArray(array);
        long endTime = System.nanoTime();

        long duration = endTime - startTime;

        // Verifica se o array foi ordenado
        assertArrayEquals(new int[]{1, 2, 5, 7, 8, 14, 16}, array);

        // Impime o tempo de execução
        System.out.println("Tempo de execução: " + duration + " nanosegundos");
    }
}
