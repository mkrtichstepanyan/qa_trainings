package javaClasses.homework_4.AndranikSargsyan;

public class Math {
    public static void main(String[] args) {

        Calculations calculations = new Calculations();

        System.out.println("int: " + calculations.getMean(7,8,9,10,11,12));
        System.out.println("double: " + calculations.getMean(7.2,8.5,9.7,10.2,11.0,12.8));
        System.out.println("float: " + calculations.getMean(8.54545F,9.71112F,10F,1100F,12.89987F));
        System.out.println(calculations.getMean("Happy", "New", "Year"));
    }
}
