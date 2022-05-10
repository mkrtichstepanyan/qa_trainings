package io.homework_8.ani_darbinyan.excel;

import java.io.IOException;

public class ExcelFileTest {

    public static void main(String[] args) throws IOException {
        ExcelFileReader excelFile = new ExcelFileReader("src/main/java/io/homework_8/ani_darbinyan/excel/excel.xlsx");
//        excelFile.readDataBySheetName("DEV");
//        excelFile.readDataBySheetName("QAT");

        Object[] data = {"06/04/25 10:02 AM", "589647", "20", "yes", "Refund FULL","06/04/30 10:04", "589647", "20"};
        ExcelFileWriter.insertRow("src/main/java/io/homework_8/ani_darbinyan/excel/test.xlsx", data);
    }
}
