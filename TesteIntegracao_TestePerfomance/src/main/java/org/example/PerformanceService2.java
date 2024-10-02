package org.example;

import java.util.Arrays;

public class PerformanceService2 {

    // Usa a ordenação nativa do Java (Arrays.sort)
    public void sortArrayNative(int[] array){
        Arrays.sort(array);
    }

    // Implementação personalizada de Bublle Sort
    public void bubbleSort(int[] array){
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Troca os elementos
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
