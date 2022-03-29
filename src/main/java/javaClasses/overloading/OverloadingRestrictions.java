package javaClasses.overloading;

/**
 * Class with methods that can cause problems during overloading process,
 * uncomment any of them to see the problem
 */

public class OverloadingRestrictions {
    public double multiply(double number1, double number2) {
        return number1 * number2;
    }

//    public void multiply(double number1, double number2) {
//        System.out.println("result is: " + number1 * number2);
//    }

    public double multiply(int number1, int number2) {
        return number1 * number2;
    }



//    private double multiply(int number1, int number2) {
//        return number1 * number2;
//    }

//    private int multiply(double number1, double number2) {
//        return number1 * number2;
//    }

//    public static double multiply(double number1, double number2) {
//        return number1 * number2;
//    }

//    public final double multiply(double number1, double number2) {
//        return number1 * number2;
//    }

}
