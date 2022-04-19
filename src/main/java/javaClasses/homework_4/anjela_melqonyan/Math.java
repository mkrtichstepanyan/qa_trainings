package javaClasses.homework_4.anjela_melqonyan;

public class Math {

    public static void main( String [] args){
        int intResult= Calculations.getMean(2,4,14,12,6,4);
        System.out.println("Result of integers average" + " " +intResult);
        double doubleResult= Calculations.getMean(3.5,14.2,6.3,7.8,3.2);
        System.out.println("Result of double average"+ " " + doubleResult);
        float floatResult=Calculations.getMean(2.6f,12f, 1.4f, 5.4f);
        System.out.println("Result of float average"+ " "+ floatResult);
        String StringResult=Calculations.getMean("Happy","New","Year");
        System.out.println("Result of String" + " " +StringResult);

    }

}
