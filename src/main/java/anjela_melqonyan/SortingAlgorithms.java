package anjela_melqonyan;

import java.util.Arrays;



public class SortingAlgorithms {
    /*TODO: Write algorithms below
       1. Insertion Sort
       2. Selection Sort
       3. Bubble Sort
    */

    public static void main( String [] args){
        int[] array={8,6,9,14,1,22};
        inserstionSort(array);
        System.out.println("Inserstion Sort" + Arrays.toString(array));
        selectionSort(array);
        System.out.println( "Selection Sort" + Arrays.toString(array));
        bubbleSort(array);
        System.out.println( "Bubble Sort" + Arrays.toString(array));

    }

    public static void inserstionSort(int[] array){
        for( int i=1; i<array.length; i++){
            int curent= array[i];
            int j= i;
            while (j>0 && curent<array[j-1]){
                array[j]=array[j-1];
                j--;
            }
            array[j]=curent;
        }
    }


    public static void selectionSort(int[] array){
        for(int i= 0; i<array.length; i++){
            int min=i;
            for(int j=i+1; j<array.length-1; j++){
                if(array[j]<array[min])
                    min=j;
            }

            int temp=array[i];
            array[i] =array[min];
            array[min]=temp;

        }

    }


    public static void bubbleSort(int [] array){
        for(int i=0; i<array.length; i++){
            for(int j=i+1; j<array.length; j++)
                if(array[i]>array[j]){
                    int temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
        }
    }
}




