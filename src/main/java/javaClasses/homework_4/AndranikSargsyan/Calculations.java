package javaClasses.homework_4.AndranikSargsyan;

public class Calculations {

    public int getMean(int... nums) {
        int result = 0;
        for (int n : nums)
            result += n;
        return result / nums.length;
    }

    public double getMean(double... nums) {
        int result = 0;
        for (double n : nums)
            result += n;
        return (double) result / nums.length;
    }

    public float getMean(float... nums) {
        int result = 0;
        for (float n : nums)
            result += n;
        return (float) result / nums.length;
    }

    public  String getMean(String... str) {
        StringBuilder result = new StringBuilder();
        for (String n : str)
            result.append(n);
        return result.toString();
    }
}
