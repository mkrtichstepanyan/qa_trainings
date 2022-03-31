package javaClasses.homework_4.stepan_alvajyan;

public class Math {
    public static void main(String[] args) {
       Calculations calculations = new Calculations();
        System.out.println(calculations.getMean(10,30));
        System.out.println(calculations.getMean(10,30, 40));
        System.out.println(calculations.getMean(5.6f,6.8f));
        System.out.println(calculations.getMean(15d,30d, 14d));
        System.out.println(calculations.getMean("Happy","New", "Year"));

    }
}
