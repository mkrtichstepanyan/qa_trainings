package computer_science_basics.arevik_arakelyan;

public class Task2 {



    public static void main(String[] args) {
        int[] twinsArray = {4, 2, 5, -4, 3, 0, 3, 6, 1, 8, -2, -2, -3, -6, -3, -6, 5, 4, 2, -1, -5, 0, 6, -1, 1, -5, -4};
        System.out.println("The single number is -> " + findSingleNumber(twinsArray));
    }

    public static int findSingleNumber(int[] array) {
        int res = 0;
        int[] arr = new int[]{4, 2, 5, -4, 3, 0, 3, 6, 1, 8, -2, -2, -3, -6, -3, -6, 5, 4, 2, -1, -5, 0, 6, -1, 1, -5, -4};
        for (int i: arr) {
            res ^= i;
        }
        return res;
    }
}
