package computer_science_basics.homework_1.Hayk_Davtyan;

public class Task2 {

    /* TODO: Task 2
        Given an array of integers ex. [1, 4, -7, 0, 4, -7, 0 ]
        All of them has a twin in the same array 4 & 4, -7 & -7, 0 & 0
        Find and print a single integer which has no a twin (in this array it is 1)
        Use as few iterations as you can, try to find THE BEST solution
    */

    public static void main(String[] args) {
        int[] twinsArray = {4, 2, 5, -4, 3, 0, 3, 6, 1, 8, -2, -2, -3, -6, -3, -6, 5, 4, 2, -1, -5, 0, 6, -1, 1, -5, -4};
        System.out.println("The single number is -> " + findSingleNumber(twinsArray, 0));
    }

    public static int findSingleNumber(int[] array, int j) {
        int i = 0;
        int num = array[j];
        while (i != array.length) {
            if (num == array[i] && i != j) {
                j++;
                return findSingleNumber(array, j);
            }
            i++;
        }
        return num;
    }
}
