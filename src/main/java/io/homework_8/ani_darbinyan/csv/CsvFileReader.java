package io.homework_8.ani_darbinyan.csv;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;


public class CsvFileReader {

    public static void readDataLineByLine(String file) {
        try {
            FileReader fileReader = new FileReader(file);
            CSVReader csvReader = new CSVReader(fileReader);
            String[] nextRecord;

            while((nextRecord = csvReader.readNext()) != null){
                for(String cell : nextRecord){
                    System.out.print(cell + "\t");
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readDataAtOnce(String file){
        try {

            FileReader fileReader = new FileReader(file);
            CSVReader csvReader = new CSVReaderBuilder(fileReader).build();
            List<String[]> allData = csvReader.readAll();
            for (String[] row : allData) {
                for (String cell : row){
                    System.out.print(cell + "\t");
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
