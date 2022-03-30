package javaClasses.homework_4.davit_balabekyan.math;

public class Calculations {

    public static int getMean(int firstIntNumber, int secondIntNumber, int thirdIntNumber) {
        int sum = firstIntNumber + secondIntNumber + thirdIntNumber;
        return sum / 3;
    }

    public static double getMean(double firstDoubleNumber, double secondDoubleNumber, double thirdDoubleNumber) {
        double sum = firstDoubleNumber + secondDoubleNumber + thirdDoubleNumber;
        return sum / 3;
    }

    public static float getMean(float firstFloatNumber, float secondFloatNumber, float thirdFloatNumber) {
        float sum = firstFloatNumber + secondFloatNumber + thirdFloatNumber;
        return sum / 3;
    }

    public static String concat(String firstString, String secondString, String thirdString) {
        return firstString + secondString + thirdString;
    }
}
