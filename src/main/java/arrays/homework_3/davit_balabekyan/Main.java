package arrays.homework_3.davit_balabekyan;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
            int[]array1 = {1,10,-7,8,23,-27,100};
            int[] selectionSorting = SortingAlgorithms.sortBySelectionSorting(array1);
            int[] array2 = {3, 0, 1, 8, 7, 2, 5, 4,6,9};
            int[] bubbleSorting =SortingAlgorithms.sortByBubbleSorting(array2);

            System.out.println("-----Sort by selection soring----");
            System.out.println(Arrays.toString(selectionSorting));
            System.out.println("---------------------------------");
            System.out.println("------Sort by bubble soring------");
            System.out.println(Arrays.toString(bubbleSorting));
            System.out.println("---------------------------------");
    }
}
