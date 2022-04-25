package javaClasses.homework_4.ani_darbinyan;

public class Calculations {
    public static int getMean(int... args){
        int sum = 0;
        for(int i : args){
            sum =+ i;
        }
        return sum / args.length;
    }

    public static double getMean(double... args){
        double sum = 0;
        for(double i : args){
            sum =+ i;
        }
        return sum / args.length;
    }

    public static float getMean(float... args){
        float sum = 0;
        for(float i : args){
            sum =+ i;
        }
        return sum / args.length;
    }

    public static String concatString(String... args){
        String res = "";
        for(String s : args){
            res += s;
        }
        return res;
    }

}
