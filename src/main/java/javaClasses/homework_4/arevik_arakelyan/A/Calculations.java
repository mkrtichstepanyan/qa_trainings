package javaClasses.homework_4.arevik_arakelyan.A;

public class Calculations {
    public int getMean(int... args) {
        int result = 0;
        int sum = 0;
        int count = 0;
        for (int value : args) {
            sum = sum + value;
            count++;
            result = sum / count;
        }
        return result;
    }

    public double getMean(double... args) {
        double result = 0;
        double sum = 0;
        int count = 0;
        for (double value : args) {
            sum = sum + value;
            count++;
            result = sum / count;
        }
        return result;
    }

    /* public float getMean(float ...args){
         float result = 0;
         float sum = 0;
         int count = 0;
         for (float value : args) {
             sum = sum + value;
             count++;
             result = sum / count;
         }
         return  result;
     }*/
    public String getMean(String... args) {
        String result = "";
        for (int value = 0; value < args.length; value++) {
            result = result + args[value];
        }
        return result;
    }
}
