package arrays.homework_3.Lilit_Manukyan;
import java.lang.reflect.Array;
public class SortingAlgorithms {
    public static void main(String[] args) {
        int[] array = {7, 8, -55, 2, 4, 0, -3};
        int[] array2 = {-14, 25, -20, 0, 11};
        insertionSort(array);
        printArray(array);
        selectionSort(array2);
        printArray(array2);
        bubbleSort(array);
        printArray(array);
    }
   /* TODO: Write algorithms below
       1. Insertion Sort
       2. Selection Sort
       3. Bubble Sort
    */
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("----------------");
    }
    
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; ++i) {
            int flag = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > flag) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = flag;
        }
    }
   
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            {
                int flag = i;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] < arr[flag]) {
                        flag = j;
                    }
                }
                int temp = arr[flag];
                arr[flag] = arr[i];
                arr[i] = temp;
            }
        }
    }
    
    public static void bubbleSort(int [] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 1; j < arr.length-i; j++) {
                if(arr[j-1] > arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
