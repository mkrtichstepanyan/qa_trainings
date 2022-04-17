package javaClasses.homework_4.davit_balabekyan.math;

public class Math {
    public static void main(String[] args) {
        int intResult = Calculations.getMean(7, 12, 8);
        System.out.println("Result of integers average " + intResult);
        double doubleResult = Calculations.getMean(1.7, 3.9, -8.3);
        System.out.println("Result of doubles average " + doubleResult);
        float floatResult = Calculations.getMean(2.9f, 7.2f, -7.6f);
        System.out.println("Result of floats average " + floatResult);

        String concatResult = Calculations.concat("Happy", "New", "Year");
        System.out.println("Result of concat strings " + concatResult);
    }
}
