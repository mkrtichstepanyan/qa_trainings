package javaClasses.homework_4.Lilit_Manukyan;

public class Calculations {

    public static int getMean(int... args) {
        int sum = 0;
        for (int el : args) {
            sum += el;
        }
        return sum / args.length;
    }

    public static double getMean(double... args) {
        double sum = 0;
        for (double el : args) {
            sum += el;
        }
        return sum / args.length;
    }

    public static float getMean(float... args) {
        float sum = 0;
        for (float el : args) {
            sum += el;
        }
        return sum / args.length;
    }

    public static String getMean(String... args) {
        String newString = "";
        for (String el : args) {
            newString += el;
        }
        return newString;
    }
}
