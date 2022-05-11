package io.homework_8.and_sargsyan.csv;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import java.io.*;
import java.util.*;

public class ReadCsv {

    private static final File csvFile = new File("C:\\Users\\User\\IdeaProjects\\qa_trainings\\src\\main\\java\\io\\homework_8\\and_sargsyan\\csv\\csv.csv");
    Scanner sc = new Scanner(System.in);

    CSVReader reader;
    {
        try {
            reader = new CSVReader(new FileReader(csvFile));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void writInCsv() throws IOException {

        String input = sc.next();
        CSVWriter writer = new CSVWriter(new FileWriter(csvFile, true));
        String[] record = input.split(",");
        writer.writeNext(record);
        writer.close();
    }

    @SuppressWarnings("resource")
    public void printAll() throws Exception {
        CSVReader reader = null;
        try {
            reader = new CSVReader(new FileReader(csvFile));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        List<String[]> allRows = reader.readAll();
        for (String[] row : allRows) {
            System.out.println(Arrays.toString(row));
        }
    }

    @SuppressWarnings("resource")
    public void search() throws Exception {
        String line = sc.nextLine();
        Reader reader = new FileReader(csvFile);
        CSVReader csvReader = new CSVReader(reader);
        StringBuilder sb = new StringBuilder();
        String[] str;
        while ((str = csvReader.readNext()) != null) {
            List<String> ln = Arrays.asList(str);
            if (ln.contains(line)) {
                for (String s : ln) {
                    sb.append(s).append(",");
                }
            }
        }
        System.out.println(sb);
    }

    @SuppressWarnings("resource")
    public void deleteByCity() throws Exception {
        String line = sc.nextLine();
        new CSVReader(new FileReader(csvFile));
        List<String[]> allElements = reader.readAll();
        reader.close();
        FileWriter sw = new FileWriter(csvFile);
        CSVWriter writer = new CSVWriter(sw);
        for (String[] allElement : allElements) {
            if (!Arrays.asList(allElement).contains(line)) {
                writer.writeNext(allElement);
            }
        }
        writer.close();
    }

    public void deleteByRowNumber()throws Exception{
        int line = sc.nextInt();
        new CSVReader(new FileReader(csvFile));
        List<String[]> allElements = reader.readAll();
        allElements.remove(line-1);
        reader.close();
        FileWriter sw = new FileWriter(csvFile);
        CSVWriter writer = new CSVWriter(sw);
        writer.writeAll(allElements);
        writer.close();
    }
}