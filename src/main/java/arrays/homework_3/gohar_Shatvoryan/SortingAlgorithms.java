package arrays.homework_3.gohar_Shatvoryan;

public class SortingAlgorithms {


    public void bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {

                if (arr[j] > arr[j - 1]) {
                    int tmp = arr[j];

                    arr[j] = arr[j - 1];
                    arr[j - 1] = tmp;
                }
            }
        }
    }


    public void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = 0; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int smallNumber = array[minIndex];
            array[minIndex] = array[i];
            array[i] = smallNumber;
        }
    }

    public void insertionSort(int[] array) {

        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;
            while (j > -1 && (array[j] > temp)) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }
    }
}
