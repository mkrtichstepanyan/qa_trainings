package io.homework_8.davit_balabekyan.csv;

import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        CSVFileReader.readAll();
        System.out.println("-----------------------------");
        String[] rowByName = CSVFileReader.getRowByName("Davit");
        System.out.println(Arrays.toString(rowByName));
        System.out.println("---------------------------");

        CSVFileWriter.addRow("7","Petros","Petrosyan","Male","60");
        System.out.println("-------------------------------");
        CSVFileWriter.addRowByIndex(2,"8","Poghos","Poghosyan","Male","25");
        System.out.println("----------------------------");

        CsvFileDeleter.deleteRow();
        CsvFileDeleter.deleteRowByIndex(2);
        CsvFileDeleter.deleteRowById("3");
    }
}
