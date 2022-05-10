package io.homework_8.Lilit_Manukyan;

import java.io.*;

public class WriteExcel {

    public static void main(String[] args) {

        try (InputStream in = new FileInputStream("src/main/java/io/homework_8/Lilit_Manukyan/excel/excel.xlsx");
             OutputStream os = new FileOutputStream(new File("src/main/java/io/homework_8/Lilit_Manukyan/excel/excel1.xlsx"))) {
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
