package computer_science_basics.homework_3.Hayk_Davtyan;

public class SortingAlgorithms {
    public static void main ( String args[]){
        int arr[] = {24, 12, 5, 32, 43, 2};

        InsertionSort(arr);
        SelectionSort(arr);
        BubbleSort(arr);
    }

    public static void InsertionSort(int [] arr){
        for (int i = 0; i < arr.length; ++i){
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]){
                int swap = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = swap;
                j = j - 1;
            }
        }
        printArr(arr);
    }

    public static void SelectionSort(int [] arr) {
        int min;
        int minIndex;
        int swap;

        for( int i = 0; i < arr.length -1; i ++){
            min = arr[i];
            minIndex = i;
            for( int j = i +1; j < arr.length; j++){
                if(arr[j] < min){
                    min = arr[j];
                    minIndex = i;
                }
            }
            swap = min;
            arr[minIndex] = arr[i];
            arr[i] = swap;
        }

        printArr(arr);
    }

    public static void BubbleSort(int[] arr) {
        for (int i = 0; i < arr.length -1; ++i){
            for (int j = 0; j < arr.length - i - 1; ++j){
                if(arr[j + 1] < arr[j]){
                    int swap = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = swap;
                }
            }
        }

        printArr(arr);
    }

    public static void printArr(int[] arr) {
         for (int i = 0; i < arr.length; ++i){
             System.out.printf(arr[i] + " ");
         }
         System.out.println(" ");
     }
}
