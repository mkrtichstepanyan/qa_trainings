package io.homework_8.heghine_khachatryan.csv;

import java.util.ArrayList;

public class TestCSVReader {
    public static void main(String[] args) {
        ArrayList<String[]> data = new ArrayList<>();
        data.add(new String[]{"Heghine", "16", "Khachatryan", "Gyumri", "1996", "Armenia"});
        data.add(new String[]{"Diana", "16", "Poghosyan", "Yerevan", "2001", "Armenia"});
        data.add(new String[]{"Naira", "16", "Petrosyan", "Ashocq", "1994", "Armenia"});
        data.add(new String[]{"Raisa", "16", "Nalbandyan", "Mayisyan", "2005", "Armenia"});
        // CSVFileReader.readCSVFile("src/main/java/io/homework_8/heghine_khachatryan/csv/csv.csv");
        CSVFileReader.readCSVFileByCSVReader("src/main/java/io/homework_8/heghine_khachatryan/csv/csv.csv");
        CSVFileWriter.writeIntoCSVFile("src/main/java/io/homework_8/heghine_khachatryan/csv/writeCsv.csv", data);
        // CSVFileWriter.writeIntoCSVFile("src/main/java/io/homework_8/heghine_khachatryan/csv/writeCsv.csv", '|', data);
    }
}
