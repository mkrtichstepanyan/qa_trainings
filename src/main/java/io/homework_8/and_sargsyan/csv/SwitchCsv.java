package io.homework_8.and_sargsyan.csv;

import java.io.IOException;
import java.util.Scanner;

public class SwitchCsv {
    static ReadCsv readCsv = new ReadCsv();

    public static void main(String[] args) throws Exception {

        ask();
    }

    public static void ask() throws Exception {
        Scanner sc = new Scanner(System.in);
        boolean isWrongAnswer;
        do {
            isWrongAnswer = false;
            System.out.println("What do you want to do?");
            System.out.println("< 1 >show all values in the table " + "\n"
                    + "< 2 > search by city name " + "\n" +
                    "< 3 >add new data in the table " + "\n" +
                    "< 4 >delete a string with the name of city"+"\n"+
                    "< 5 >delete row by number row ");

            switch (sc.nextInt()) {
                case 1:
                    readCsv.printAll();
                    ask();
                    break;
                case 2:
                    System.out.println("Please input Name of citi");
                    readCsv.search();
                    break;
                case 3:
                    System.out.println("pleas input LatD,LatM,LatS,NS,LonD,LonM,LonS,EW,City,State");
                    readCsv.writInCsv();
                    ask();
                    break;
                case 4:
                    System.out.println("please input name of city");
                    readCsv.deleteByCity();
                    break;
                case 5:
                    System.out.println("please input number Row");
                    readCsv.deleteByRowNumber();
                    break;

                default:
                    System.out.println("Choose one of the options! ");
                    isWrongAnswer = true;
            }
        } while (isWrongAnswer);
    }
}
