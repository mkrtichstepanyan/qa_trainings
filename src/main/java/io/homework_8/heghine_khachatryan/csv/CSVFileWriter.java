package io.homework_8.heghine_khachatryan.csv;

import com.opencsv.CSVWriter;
import com.opencsv.ICSVWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public final class CSVFileWriter {

    private CSVFileWriter() {
    }

    public static void writeIntoCSVFile(String path, ArrayList<String[]> data) {
        try (CSVWriter csvWriter = new CSVWriter(new FileWriter(path))) {
            csvWriter.writeAll(data);
            System.out.println("Created new file and wrote data into it successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeIntoCSVFile(String path, char separator, ArrayList<String[]> data) {
        try (CSVWriter csvWriter = new CSVWriter(new FileWriter(path), separator,
                CSVWriter.DEFAULT_QUOTE_CHARACTER, CSVWriter.DEFAULT_ESCAPE_CHARACTER, CSVWriter.DEFAULT_LINE_END)) {
            csvWriter.writeAll(data);
            System.out.println("Created new file and wrote data into it successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
