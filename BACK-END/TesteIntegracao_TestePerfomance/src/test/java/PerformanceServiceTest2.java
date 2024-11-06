import org.example.PerformanceService2;
import org.junit.jupiter.api.Test;
import java.util.Random;
import static org.junit.jupiter.api.Assertions.*;


public class PerformanceServiceTest2 {

    private PerformanceService2 performanceService = new PerformanceService2();

    // Gera um array aleatório de inteiros
    private int[] generateRandomArray(int size){
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(size);
        }
        return array;
    }

    @Test
    public void testSortPerformance(){
        int[] array1 = generateRandomArray(10000); // Gera um array de 10.000 elementos
        int[] array2 = array1.clone(); // Cria uma cópia do array para o segundo teste

        // Medir o tempo de execução para o sort nativo (Arrays.sort)
        long startTime = System.nanoTime();
        performanceService.sortArrayNative(array1);
        long endTime = System.nanoTime();
        long durationNative = endTime - startTime;
        System.out.println("Tempo para Arrays.sort(): " + durationNative + " nanosegundos");

        // Medir o tempo de execução para o Bubble Sort
        startTime =System.nanoTime();
        performanceService.bubbleSort(array2);
        endTime = System.nanoTime();
        long durationBubbleSort = endTime - startTime;
        System.out.println("Tempo para Bubble Sort: " + durationBubbleSort + " nanosegundos");

        // Verifica se os dois arrays estão ordenados
        assertTrue(isSorted(array1), "O array ordenado com Arrays.sort() deveria estar ordenado");
        assertTrue(isSorted(array2), "O array ordenado com Bubble Sort deveria estar ordenado");

        // Verifica se o sort nativo foi mais rápido (como esperado)
        assertTrue(durationNative < durationBubbleSort, "Arrays.sort() deveria ser mais rápido que o Bubble Sort");
    }

    // Método auxiliar para verificar se o array está ordenado
    public boolean isSorted(int[] array){
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
