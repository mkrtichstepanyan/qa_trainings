package io.homework_8.ani_darbinyan.csv;

import com.opencsv.CSVWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class CsvFileWriter {

    public static void writeDataLineByLine(String file, String[] header, String[] data){
        try {
            FileWriter outputfile = new FileWriter(file);
            CSVWriter csvWriter = new CSVWriter(outputfile);

            csvWriter.writeNext(header);
            csvWriter.writeNext(data);
            System.out.println("Data was successfully written!");
            csvWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeDataAtOnce(String file, ArrayList<String[]> data) {
        try {
            FileWriter fileWriter = new FileWriter(file);
            CSVWriter writer = new CSVWriter(fileWriter);

            writer.writeAll(data);
            System.out.println("All data was successfully written");
            writer.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

}
