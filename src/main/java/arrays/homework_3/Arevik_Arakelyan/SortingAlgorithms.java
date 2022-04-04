package arrays.homework_3.Arevik_Arakelyan;
import java.util.Arrays;

public class SortingAlgorithms {

    public static void main(String args[]) {
        int[] arr = {5, 3, 4, 2, 15, 10, 40, 1};
        System.out.println("Insertion sorting algorithm");
        arr = insertionSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Selection sorting algorithm");
        arr = selectionSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Bubble sorting algorithm");
        arr = bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    //Insertion sorting
    public static int[] insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j;
            for (j = i; j > 0 && arr[j - 1] > temp; j--) {
                arr[j] = arr[j - 1];
            }
            arr[j] = temp;
        }
        return arr;
    }

    //selection sorting
    public static int[] selectionSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[index])
                    index = j;

            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
        return arr;
    }

    //bubble sorting
    public static int[] bubbleSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}