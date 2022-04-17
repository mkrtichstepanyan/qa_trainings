package javaClasses.homework_4.heghine_khachatryan.overloading;

public class Calculations {

    public int getMean(int... number) {
        int sum = 0;
        for (int i : number) {
            sum += i;
        }
        if (number.length != 0) {
            System.out.print("Mean of integers is: ");
            return sum / number.length;
        } else {
            System.out.print("No input parameter");
            return 0;
        }
    }

    public double getMean(double... number) {
        double sum = 0.0;
        for (double i : number) {
            sum += i;
        }
        if (number.length != 0) {
            System.out.print("Mean of doubles is: ");
            return sum / number.length;
        } else {
            System.out.print("No input parameter");
            return 0.0;
        }
    }

    public float getMean(float... number) {
        float sum = 0.0F;
        for (double i : number) {
            sum += i;
        }
        if (number.length != 0) {
            System.out.print("Mean of floats is: ");
            return sum / number.length;
        } else {
            System.out.print("No input parameter");
            return 0.0F;
        }
    }

    public String getMean(String... word) {
        StringBuilder resultWord = new StringBuilder();
        for (String s : word) {
            resultWord.append(s);
        }
        return resultWord.toString();
    }
}
