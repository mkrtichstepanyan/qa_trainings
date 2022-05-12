package io.homework_8.davit_balabekyan.csv;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class CsvFileDeleter {

    private static final File FILE = new File("src/main/java/io/homework_8/davit_balabekyan/csv/csv.csv");

    public static void deleteRow() {
        try {
            CSVReader csvReader = new CSVReader(new FileReader(FILE));
            List<String[]> list = csvReader.readAll();
            csvReader.close();
            CSVWriter csvWriter = new CSVWriter(new FileWriter(FILE));
            if (list.size() > 0) {
                for (int i = 0; i < list.size() - 1; i++) {
                    csvWriter.writeNext(list.get(i));
                }
                csvWriter.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void deleteRowByIndex(int index) {
        try {
            CSVReader csvReader = new CSVReader(new FileReader(FILE));
            List<String[]> list = csvReader.readAll();
            csvReader.close();
            if (index > 0 && index < list.size()) {
                list.remove(index);
                CSVWriter csvWriter = new CSVWriter(new FileWriter(FILE));
                csvWriter.writeAll(list);
                csvWriter.close();
            }else {
                if (index > list.size()) {
                    throw new IndexOutOfBoundsException("Your entered index " + index + " is more than list length");
                } else {
                    throw new IndexOutOfBoundsException("Your entered index " + index + " is less than list length");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void deleteRowById(String id) {
        try {
            CSVReader csvReader = new CSVReader(new FileReader(FILE));
            List<String[]> list = csvReader.readAll();
            csvReader.close();
            CSVWriter csvWriter = new CSVWriter(new FileWriter(FILE));
            for (String[] strings : list) {
                if (!Arrays.asList(strings).contains(id)) {
                    csvWriter.writeNext(strings);
                }
            }
            csvWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
