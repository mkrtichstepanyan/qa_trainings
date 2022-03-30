package javaClasses.homework_4.heghine_khachatryan.overloading;

public class Calculations {

    public int getMean(int... number) {
        int count = 0;
        int sum = 0;
        for (int i : number) {
            sum += i;
            count++;
        }
        if (count != 0) {
            System.out.print("Mean of integers is: ");
            return sum / count;
        } else {
            System.out.print("No input parameter");
            return 0;
        }
    }

    public double getMean(double... number) {
        double count = 0.0;
        double sum = 0.0;
        for (double i : number) {
            sum += i;
            count++;
        }
        if (count != 0) {
            System.out.print("Mean of doubles is: ");
            return sum / count;
        } else {
            System.out.print("No input parameter");
            return 0.0;
        }
    }

    public float getMean(float... number) {
        float count = 0.0F;
        float sum = 0.0F;
        for (double i : number) {
            sum += i;
            count++;
        }
        if (count != 0) {
            System.out.print("Mean of floats is: ");
            return sum / count;
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
