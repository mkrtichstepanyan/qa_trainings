package javaClasses.homework_4.davit_balabekyan.math;

public class Calculations {

    public static int getMean(int... intVarargs) {
        int sum = 0;
        for (int number : intVarargs) {
            sum += number;
        }
        return sum / 3;
    }

    public static double getMean(double... doubleVarargs) {
        double sum = 0;
        for (double number : doubleVarargs) {
            sum += number;
        }
        return sum / 3;
    }

    public static float getMean(float... floatVarargs) {
        float sum = 0;
        for (float floatNumber : floatVarargs) {
            sum += floatNumber;
        }
        return sum / 3;
    }

    public static String concat(String... stringVarargs) {
        String result = "";
        for (String string : stringVarargs) {
            result += string;
        }
        return result;
    }
}
