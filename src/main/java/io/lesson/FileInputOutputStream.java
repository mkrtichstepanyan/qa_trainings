package io.lesson;

import java.io.*;

public class FileInputOutputStream {

    // InputStream
    // OutputStream
    // Reader
    // Writer
    // ObjectInputStream
    // ObjectOutputStream

    public static void main(String[] args) throws IOException {
        InputStream in = new FileInputStream("src/main/java/io/files/file1.txt");
        OutputStream os = new FileOutputStream("src/main/java/io/files/file2.txt");
        int nextByte;
        while ((nextByte = in.read()) != -1) {
            System.out.println((char) nextByte);
        }

    }
}
