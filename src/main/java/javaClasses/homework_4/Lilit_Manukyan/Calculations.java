package javaClasses.homework_4.Lilit_Manukyan;

public class Calculations {
    public static int getMean(int... args) {
        int sum = 0;
        int count = 0;
        for (int el : args) {
            count += 1;
            sum += el;
        }
        return sum / count;
    }

    public static double getMean(double... args) {
        double sum = 0;
        int count = 0;
        for (double el : args) {
            count += 1;
            sum += el;
        }
        return sum / count;
    }

    public static float getMean(float... args) {
        float sum = 0;
        int count = 0;
        for (float el : args) {
            count += 1;
            sum += el;
        }
        return sum / count;
    }

    public static String getMean(String... args) {
        String newString = "";
        for (String el : args) {
            newString += el;
        }
        return newString;
    }
}