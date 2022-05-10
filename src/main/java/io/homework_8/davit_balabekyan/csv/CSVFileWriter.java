package io.homework_8.davit_balabekyan.csv;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CSVFileWriter {

    private static final File FILE = new File("src/main/java/io/homework_8/davit_balabekyan/csv/csv.csv");

    public static void addRow(String ID, String name, String surname, String gender, String age) {
        try (CSVWriter csvWriter = new CSVWriter(new FileWriter(FILE, true))) {
            String[] newRow = {ID, name, surname, gender, age};
            csvWriter.writeNext(newRow);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void addRowByIndex(int index, String ID, String name, String surname, String gender, String age) {
        try {
            CSVReader csvReader = new CSVReader(new FileReader(FILE));
            List<String[]> list = csvReader.readAll();
            csvReader.close();
            CSVWriter csvWriter = new CSVWriter(new FileWriter(FILE));
            if (index > 0 && index < list.size()) {
                String[] array = {ID, name, surname, gender, age};
                list.add(index, array);
                for (String[] strings : list) {
                    csvWriter.writeNext(strings);
                }
                csvWriter.close();
            } else {
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
}
