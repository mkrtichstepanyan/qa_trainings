package arrays.homework_3.davit_balabekyan;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
            int[]array1 = {1,7,10,-30,-12,24,50};
            int[]insertionSorting = SortingAlgorithms.sortByInsertionSorting(array1);
            int[]array2 = {1,10,-7,8,23,-27,100};
            int[] selectionSorting = SortingAlgorithms.sortBySelectionSorting(array2);
            int[] array3 = {3, 0, 1, 8, 7, 2, 5, 4,6,9};
            int[] bubbleSorting =SortingAlgorithms.sortByBubbleSorting(array3);

            System.out.println("-----Sort by insertion soring----");
            System.out.println(Arrays.toString(insertionSorting));
            System.out.println("---------------------------------");
            System.out.println("-----Sort by selection soring----");
            System.out.println(Arrays.toString(selectionSorting));
            System.out.println("---------------------------------");
            System.out.println("------Sort by bubble soring------");
            System.out.println(Arrays.toString(bubbleSorting));
            System.out.println("---------------------------------");
    }
}
