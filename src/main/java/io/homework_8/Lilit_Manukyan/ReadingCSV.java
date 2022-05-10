package io.homework_8.Lilit_Manukyan;

import com.opencsv.CSVReader;

import java.io.File;
import java.io.FileReader;

public class ReadingCSV {
    public static void main(String[] args) throws Exception {
        File file = new File("src/main/java/io/homework_8/Lilit_Manukyan/csv/csv.csv");
        FileReader fileReader = new FileReader(file);
        CSVReader csvReader = new CSVReader(fileReader);
        String[] nextRec;
        while ((nextRec = csvReader.readNext()) != null) {
            for (String cell : nextRec) {
                System.out.print(cell + "\t");
            }
            System.out.println();
        }
    }
}
