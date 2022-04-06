package javaClasses.homework_4.anjela_melqonyan;

public class Calculations {
    public static int getMean(int ... numbers) {
      int sum=0;
      for( int i=0; i< numbers.length; i++){
          sum=sum+numbers[i];
      }
      return sum/ numbers.length;
    }


    public static double getMean(double ... numbers) {
        double sum = 0;
        for(int i=0; i< numbers.length; i++){
            sum = sum+numbers[i];
        }
        return sum/ numbers.length;
    }

    public static float getMean(float ... numbers) {
        float sum = 0;
        for( int i=0; i< numbers.length; i++){
            sum= sum+numbers[i];
        }
        return sum/ numbers.length;
    }

    public static String getMean(String ... args) {
        String result ="";
        for (int i=0; i< args.length;i++){

             result=result+args[i];
        }
        return result;
    }

   }