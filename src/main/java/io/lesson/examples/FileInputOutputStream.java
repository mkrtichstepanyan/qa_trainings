package io.lesson.examples;

import java.io.*;

public class FileInputOutputStream {

    public static void main(String[] args) {

        try (InputStream in = new FileInputStream("src/main/java/io/lesson/files/file1.txt");
             OutputStream os = new FileOutputStream("src/main/java/io/lesson/files/file2.txt")) {
            int nextByte;
            while ((nextByte = in.read()) != -1) {
                System.out.println((char) nextByte);
                os.write(nextByte);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
