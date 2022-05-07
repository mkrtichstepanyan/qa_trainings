package io.lesson;

import java.io.*;

public class BufferedReaderWriter {

    public static void main(String[] args) throws IOException {
        File file = new File("src/main/java/io/files/file1.txt");
        BufferedReader bufferedReader = new BufferedReader(new FileReader("src/main/java/io/files/file1.txt"));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/main/java/io/files/file2.txt", true));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            bufferedWriter.append(line + "\n");
        }
        bufferedWriter.close();
        bufferedReader.close();

    }
}
