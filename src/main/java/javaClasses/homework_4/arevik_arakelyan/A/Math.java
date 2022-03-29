package javaClasses.homework_4.arevik_arakelyan.A;

public class Math {
    public static void main(String[] args) {
        Calculations calculations = new Calculations();
        System.out.println(calculations.getMean(2, 3, 4, 5));
        System.out.println(calculations.getMean(2.1, 3.2, 4.0, 5.0));
        System.out.println(calculations.getMean(2.1f, 3.2f, 4.0f, 5.0f));
        System.out.println(calculations.getMean("Happy", "New", "Year"));
    }
}