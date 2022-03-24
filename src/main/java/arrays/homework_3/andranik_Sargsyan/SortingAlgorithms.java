package arrays.homework_3.andranik_Sargsyan;

public class SortingAlgorithms {
   /* TODO: Write algorithms below
       1. Insertion Sort
       2. Selection Sort
       3. Bubble Sort
    */

    public static void main(String[] args) {

        int[] arr = {9, 14, 3, 2, 43, 11, 58, 22};

//        insertionSort(arr);
//        System.out.println("Insertion Sort");
//        for (int i : arr) {
//            System.out.print(i + " ");
//        }

//        selectionSort(arr);
//        System.out.println("selection Sort");
//        for (int s : arr) {
//            System.out.print(s + " ");
//        }

        bubbleSort(arr);
        System.out.println("bubble Sort");
        for (int b : arr) {
            System.out.print(b + " ");
        }

    }


    public static void insertionSort(int array[]) {
        for (int j = 1; j < array.length; j++) {
            int key = array[j];
            int i = j - 1;
            while ((i > -1) && (array[i] > array[j])) {
                array[i + 1] = array[i];
                i--;
            }
            array[i + 1] = key;
        }
    }

    public static void selectionSort(int array[]) {
       int tmp, min;

        for (int i = 0; i < array.length-1; i++) {
            min = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[j]< array[min])
                    min = j;
                tmp = array[min];
                array[min] = array[i];
                array[i] = tmp;
            }
        }
    }

    public static void bubbleSort(int array[]) {

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }
}






