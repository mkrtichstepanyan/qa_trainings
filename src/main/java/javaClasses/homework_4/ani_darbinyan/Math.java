package javaClasses.homework_4.ani_darbinyan;

public class Math {
    public static void main(String[] args) {
        System.out.println("Overloading: integer result is " + Calculations.getMean(5, 8, 60));
        System.out.println("Overloading: double result is " + Calculations.getMean(15.2, 58.01, 1.6));
        System.out.println("Overloading: float result is " + Calculations.getMean(50.80, 180.6, 60.90));
        System.out.println("Overloading: New string is " + Calculations.concatString("Hello", "world", "!"));
    }
}
