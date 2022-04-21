package javaClasses.homework_4.heghine_khachatryan.overloading;

public class Math {
    public static void main(String[] args) {
        Calculations calculations = new Calculations();
        System.out.println(calculations.getMean(2, 4, 6));
        System.out.println(calculations.getMean(2.2, 4.4, 6.6));
        System.out.println(calculations.getMean(2.2F, 4.4F, 6.6F));
        System.out.println(calculations.getMean("Learn", "Java", "For", "Better", "Future", ":D"));
    }
}
