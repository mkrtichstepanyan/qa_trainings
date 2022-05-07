package io.lesson.examples;

import java.io.*;

public class BufferedReaderWriter {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("src/main/java/io/lesson/files/file1.txt"));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/main/java/io/lesson/files/file2.txt", true));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
            bufferedWriter.append(line + "\n");
        }
        bufferedWriter.close();
        bufferedReader.close();

    }
}
