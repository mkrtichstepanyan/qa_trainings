package arrays.homework_3.heghine_khachatryan;

import java.util.Arrays;

public class SortingAlgorithmsTest {
    public static void main(String[] args) {
        int[] array = {3, 8, 1, 64, 0, 1, 64, 88, 0, 4, 2, 16};
        System.out.println("Array before sorting ---> " + Arrays.toString(array));
        SortingAlgorithms algorithms = new SortingAlgorithms();
        long start = System.currentTimeMillis();
        algorithms.sortByBubbleSort(array);
       // algorithms.sortByInsertionSort(array);
       // algorithms.sortBySelectionSort(array);
        System.out.println("Array was sorted in " + (System.currentTimeMillis() - start) + " seconds");
    }
}
