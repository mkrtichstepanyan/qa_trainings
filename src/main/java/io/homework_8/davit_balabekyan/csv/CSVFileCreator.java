package io.homework_8.davit_balabekyan.csv;

import com.opencsv.CSVWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CSVFileCreator {

    private static final File FILE = new File("src/main/java/io/homework_8/davit_balabekyan/csv/csv.csv");

    public static void createCsvFile() {
        try (CSVWriter csvWriter = new CSVWriter(new FileWriter(FILE))) {
            csvWriter.writeNext(new String[]{"ID", "Name", "Surname", "Gender", "Age"});
            csvWriter.writeNext(new String[]{"1", "James", "Gosling", "Male", "66"});
            csvWriter.writeNext(new String[]{"2", "Mike", "Sheridan", "Male", "58"});
            csvWriter.writeNext(new String[]{"3", "Davit", "Balabekyan", "Male", "20"});
            csvWriter.writeNext(new String[]{"4", "Justin", "Timberlake", "Male", "41"});
            csvWriter.writeNext(new String[]{"5", "Jessica", "Biel", "Female", "40"});
            csvWriter.writeNext(new String[]{"6", "Angelina", "Jolie", "Female", "46"});
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
