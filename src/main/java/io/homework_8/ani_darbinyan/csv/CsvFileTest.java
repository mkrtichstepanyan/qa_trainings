package io.homework_8.ani_darbinyan.csv;

import java.util.ArrayList;
import java.util.List;

public class CsvFileTest {

    public static void main(String[] args) {
//        CsvFileReader.readDataLineByLine("src/main/java/io/homework_8/ani_darbinyan/csv/csv.csv");
//        CsvFileReader.readDataAtOnce("src/main/java/io/homework_8/ani_darbinyan/csv/csv.csv");


        String csvFileWriterPath = "src/main/java/io/homework_8/ani_darbinyan/csv/test.csv";
        String[] header = {"LatD", "LatM", "LatS", "NS", "LonD", "LonM", "LonS", "EW", "City", "State"};
        String[] data = {"40", "44", "40", "S", "60", "30", "10", "AM", "Gyumri", "Shirak"};
        String[] data1 = {"40", "44", "40", "S", "60", "30", "10", "AM", "Vanadzor", "Lori"};
//        CsvFileWriter.writeDataLineByLine(csvFileWriterPath, header, data);

        ArrayList<String[]> allData = new ArrayList<>();
        allData.add(header);
        allData.add(data);
        allData.add(data1);
        CsvFileWriter.writeDataAtOnce(csvFileWriterPath, allData);
    }
}
