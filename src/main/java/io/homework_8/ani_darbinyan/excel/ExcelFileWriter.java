package io.homework_8.ani_darbinyan.excel;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelFileWriter {

    public static void insertRow(String filepath, Object[] data) throws IOException {
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Students");
        Row[] rows = new Row[data.length];
        for (int i = 0; i < data.length; i++) {
            rows[i] = sheet.createRow(i);
        }
        int cellCount = 0;
        for (int i = 0; i < data.length; i++) {
            rows[i].createCell(cellCount).setCellValue((String) data[i]);
            cellCount++;
        }

        try (FileOutputStream fout = new FileOutputStream(filepath)) {
            workbook.write(fout);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
