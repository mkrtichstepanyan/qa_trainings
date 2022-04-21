package arrays.homework_3.ani_darbinyan;

import java.util.Arrays;

public class SortingAlgorithms {

    public static void main(String[] args) {
        int [] array = new int[]{2,1,8,3,5,5,-26};
        sortByInsertionSorting(array);
        System.out.println("Insertion sorting");
        System.out.println(Arrays.toString(array));
        int [] array1 = new int[]{20,1,88,37,65,5,-26};
        sortBySelectionSorting(array1);
        System.out.println("Selection sorting");
        System.out.println(Arrays.toString(array1));
        int [] array2 = new int[]{70,11,88,37,65,85,-26};
        sortByBubbleSorting(array2);
        System.out.println("Bubble sorting");
        System.out.println(Arrays.toString(array2));
    }

    public static void sortByInsertionSorting(int[] array){
        for (int i=1; i<array.length; ++i) {
            int key = array[i];
            int j = i-1;

            while (j >= 0 && array[j] > key) {
                array[j+1] = array[j];
                j = j-1;
            }
            array[j+1] = key;
        }
    }

    public static void sortBySelectionSorting(int[] array){
        for (int i = 0; i < array.length -1; i++){
            int min_value_index = i;
            for(int j = i+1; j < array.length ; j++){
                if(array[j] < array[min_value_index]){
                    min_value_index = j;
                }
            }
            swap(array, min_value_index, i);
        }
    }

    private static void swap(int [] array, int firstIndex, int lastIndex) {
        int tempValue = array[firstIndex];
        array[firstIndex] = array[lastIndex];
        array[lastIndex] = tempValue;
    }

    public static void sortByBubbleSorting(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length-i-1; j++) {
                if (array[j] > array[j+1]) {
                    swap(array, j+1, j);
                }
            }
        }
    }
}
