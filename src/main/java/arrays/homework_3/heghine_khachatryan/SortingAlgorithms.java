package arrays.homework_3.heghine_khachatryan;

public class SortingAlgorithms {
   /* TODO: Write algorithms below
       1. Insertion Sort
       2. Selection Sort
       3. Bubble Sort
    */

    public void sortByBubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                }

            }
        }
        System.out.print("Array was sorted by using Bubble Sort algorithm ----> ");
        printArray(array);
    }

    public void sortByInsertionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                    if (j > 0 && array[j] < array[j - 1]) {
                        swap(array, j - 1, j);
                    }
                }
            }
        }
        System.out.print("Array was sorted by using Insertion Sort algorithm ----> ");
        printArray(array);
    }

    public void sortBySelectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] >= array[j]) {
                    swap(array, i, j);
                }
            }
        }
        System.out.print("Array was sorted by using Selection Sort algorithm ----> ");
        printArray(array);
    }


    private void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " | ");
        }
        System.out.println();
    }

    private void swap(int[] array, int i, int j) {
        array[i] = array[i] ^ array[j];
        array[j] = array[i] ^ array[j];
        array[i] = array[i] ^ array[j];
    }

}
