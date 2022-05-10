package io.homework_8.davit_balabekyan.csv;

import com.opencsv.CSVReader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class CSVFileReader {

    private static final File FILE = new File("src/main/java/io/homework_8/davit_balabekyan/csv/csv.csv");

    public static void readAll() {
        try (CSVReader reader = new CSVReader(new FileReader(FILE))) {
            String[] line;
            while ((line = reader.readNext()) != null) {
                System.out.println(Arrays.toString(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String[] getRowByName(String name) {
        try (CSVReader csvReader = new CSVReader(new FileReader(FILE))) {
//            StringBuilder stringBuilder = new StringBuilder();
            List<String[]> list = csvReader.readAll();
            for (String[] row : list) {
                if (Arrays.asList(row).contains(name)) {
                    return row;
                }
            }
            return null;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
