package TestesDePerformance;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class ArraySorterTest {

    Random random = new Random();

    private ArraySorter arraySorter = new ArraySorter();

    private int[] generateRandomArray(int size){
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(size);
        }
        return array;
    }

    @Test
    public void testArraySort() {
        int[] array1 = generateRandomArray(10000);

        long startTime = System.nanoTime();
        arraySorter.sortArray(array1);
        long endTime = System.nanoTime();
        long durationNative = endTime - startTime;
        System.out.println("Tempo para execução: " + durationNative + " nanosegundos");
    }
}
