package io.homework_8.heghine_khachatryan.csv;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.*;
import java.util.Arrays;

public final class CSVFileReader {

    private CSVFileReader() {}

    public static void readCSVFile(String path) {
        String[] rows;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                rows = line.split(",");
                for (String row : rows) {
                    System.out.print(row);
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readCSVFileByCSVReader(String path) {
        try (CSVReader csvReader = new CSVReader(new FileReader(path))) {
            String[] line;
            while ((line = csvReader.readNext()) != null) {
                System.out.println(Arrays.toString(line));
            }
        } catch (CsvValidationException | IOException e) {
            e.printStackTrace();
        }
    }
}
