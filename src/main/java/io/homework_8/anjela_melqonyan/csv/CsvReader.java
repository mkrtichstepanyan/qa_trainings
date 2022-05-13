package io.homework_8.anjela_melqonyan.csv;


import java.io.*;


public class CsvReader {

    public static void main(String[] args) throws IOException{

        BufferedReader br = null;
        try {
            FileInputStream file = new FileInputStream
                    ("src/main/java/io/homework_8/anjela_melqonyan/csv/csv.csv");
            br = new BufferedReader
                    (new FileReader("src/main/java/io/homework_8/anjela_melqonyan/csv/csv.csv"));

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("file does not exist");
        } finally {

            br.close();
        }
    }
}
